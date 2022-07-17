package hotelmanagementsystem;


public class Food
{
    private int itemNo;
    int quantity;
    float price;

    
    public Food() {
    }

    Food(int itemNo,int quantity)
    {
        this.itemNo=itemNo;
        this.quantity=quantity;
        switch(itemNo)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
    }
    
    
    public Food(int itemNo, int quantity, float price) {
        this.itemNo = itemNo;
        this.quantity = quantity;
        this.price = price;
    }


    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Food{" + "itemNo=" + itemNo + ", quantity=" + quantity + ", price=" + price + '}';
    }
}

