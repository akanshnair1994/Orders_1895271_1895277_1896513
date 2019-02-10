package ordersproject;
//@author 1895271
public class Payment {
    private float amount;
    public Order order;
    
    public Payment(float amount) {
        this.amount = amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    public float getAmount() {
        return amount;
    }
}
