import java.io.Serializable;

public class Food implements Serializable
{
    int item_no;
    int quantity;
    float price;

    Food(int itemno,int quantity)
    {
        this.item_no =itemno;
        this.quantity=quantity;
        switch(itemno)
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
}