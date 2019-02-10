package ordersproject;
//@author 1895271
public class OrderDetail {
    private int quantity;
    private String taxStatus;
    public Order order;
    public Item item;
    
    public OrderDetail(int quantity, String taxStatus) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
    }
    
    public void calcSubTotal() {
        System.out.println("This is the calcSubTotal() method");
    }
    
    public void calcTax() {
        System.out.println("This is the calcTax() method");
    }
    
    public void calcWeight() {
        System.out.println("This is the calcWeight() method");
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }
    
    public String getTaxStatus() {
        return taxStatus;
    }
}
