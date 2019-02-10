/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersproject;

/**
 *
 * @author 1895277
 */
public class Item {
    private float shippingWeight;
    private String description;
    
    public Item(float shippingWeight,String description){
        this.shippingWeight=shippingWeight;
        this.description=description;
    }
    public void setshippingWeight (float shippingWeight){
        this.shippingWeight = shippingWeight;
    }
     public void setDescription (String description){
        this.description = description;
    }
      public float getshippingWeight (){
         return shippingWeight;
     }
      public String getdescription (){
         return description;
     }
      public void getPriceForQuantity(){
          System.out.println("Get price for quantity method");
      }
      public void getTax(){
          System.out.println("Get tax method");
      }
      public void getinStock(){
          System.out.println("Get inStock method");
      }
}
