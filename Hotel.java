package hotelmanagementsystem;

import java.io.IOException;
import java.util.Scanner;


public class Hotel
{
   
    static Scanner sc = new Scanner(System.in);
        
    public Room roomList[] ;

    void CustDetails(int i,int rn)            
    {
        String name, contact, gender;
        
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact=sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
    
        
        //arrayofavailableroom
        roomList[rn]=new Room(name,contact,gender);
        
    }
    

     void bookroom()
    {
        int j;
        int rn;
        System.out.println("\nChoose room number from : ");
        
        
                for(j=0;j<roomList.length;j++)
                {
                    if(roomList[j]==null)
                    {
                        System.out.print(j+1+",");
                    }
                }
                System.out.print("\nChoose room number: ");
                
                rn=sc.nextInt();
                rn--;
                if(roomList[rn]!=null){
                    
                    
                    CustDetails(j,rn);
                }
        
                
    }

    

    void availability()
    {
        int j,count=0;
        
        for(j=0;j<10;j++)
                {
                    if(roomList[j]==null)
                        count++;
                }
         
                
        System.out.println("Number of rooms available : "+count);
    }

    
    void bill(int rn,int rtype)
    {
        double amount=0;
        String list[]={"Sandwich","Pasta","Noodles","Coke"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");

        switch(rtype)
        {
            case 1:
                amount+=4000;
                System.out.println("\nRoom Charge - "+4000);
                System.out.println("\n===============");
                System.out.println("Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                
                for(Food obb:roomList[rn].getFood())
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.getItemNo()-1],obb.quantity,obb.price );
                }

                break;
            case 2:amount+=3000;
                System.out.println("Room Charge - "+3000);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:roomList[rn].getFood())
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.getItemNo()-1],obb.quantity,obb.price );
                }
                break;
            case 3:amount+=2200;
                System.out.println("Room Charge - "+2200);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:roomList[rn].getFood())
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.getItemNo()-1],obb.quantity,obb.price );
                }
                break;
            case 4:amount+=1200;
                System.out.println("Room Charge - "+1200);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:roomList[rn].getFood())
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.getItemNo()-1],obb.quantity,obb.price );
                }
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- "+amount);
    }

    void deallocate(int rn,int rtype)
    {
        int j;
        char w;
                if(roomList[rn]!=null)
                    System.out.println("Room used by "+roomList[rn].getCustName());
                else
                {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    roomList[rn]=null;
                    System.out.println("Deallocated succesfully");
                }
        }
    

    void order(int rn,int rtype)
    {
        int i,q;
        char wish;
        
        
            System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
            do
            {
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q=sc.nextInt();

                switch(rtype){
                    case 1: roomList[rn].getFood().add(new Food(i,q));
                        break;
                    case 2: roomList[rn].getFood().add(new Food(i,q));
                        break;
                    case 3: roomList[rn].getFood().add(new Food(i,q));
                        break;
                    case 4: roomList[rn].getFood().add(new Food(i,q));
                        break;
                }
                System.out.println("Do you want to order anything else ? (y/n)");
                wish=sc.next().charAt(0);
            }while(wish=='y'||wish=='Y');
        
            
        
    }
}

