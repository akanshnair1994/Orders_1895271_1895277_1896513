package ordersproject;

import java.util.Date;
//@author 1895277
public class Customer {
    
    private String name;
    private String address;
    
  public Customer(String name,String address){
      this.name=name;
      this.address=address;
  }  
    
    public void setName (String name){
        this.name = name;
    }
     public void setAddress (String address){
        this.address = address;
    }
     public String getName (){
        return name;
    }
      public String getAddress (){
        return address;
    }
    
    
}
