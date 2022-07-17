package hotelmanagementsystem;

import java.util.ArrayList;


public class Room 
{
    private String custName;
    private String custContact;
    private String custGender;

    public ArrayList<Food> foodList =new ArrayList<>();


    Room()
    {
        this.custName="";
    }
    Room(String name,String contact,String gender)
    {
        this.custName=name;
        this.custContact=contact;
        this.custGender=gender;
    }
    

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public void setFood(ArrayList<Food> food) {
        this.foodList = food;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustContact() {
        return custContact;
    }

    public String getCustGender() {
        return custGender;
    }

    public ArrayList<Food> getFood() {
        return foodList;
    }
    
    @Override
    public String toString() {
        return "Room{" + "custName=" + custName + ", custContact=" + custContact + ", custGender=" + custGender + ", food=" + foodList + '}';
    }

}
