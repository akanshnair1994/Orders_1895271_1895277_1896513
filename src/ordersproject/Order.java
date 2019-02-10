package ordersproject;
//@author 1895271
import java.util.Date;

public class Order {
    Date date;
    String status;
    
    public Order(Date date, String status) {
        this.date = date;
        this.status = status;
    }
    
    public void calcSubTotal() {
        System.out.println("This is the calcSubTotal() method");
    }
    
    public void calcTax() {
        System.out.println("This is the calcTax() method");
    }
    
    public void calcTotal() {
        System.out.println("This is the calcTotal() method");
    }
    
    public void calcTotalWeight() {
        System.out.println("This is the calcTotalWeight() method");
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
