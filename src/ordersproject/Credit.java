/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersproject;

import java.util.Date;

/**
 *
 * @author 1896513
 */
public class Credit extends Payment {

    private String name;
    private String type;
    private Date expDate;

    public Credit(String name, String type, Date expDate, float amount) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setexpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getexpDate() {
        return expDate;
    }

    public void authorized() {
        System.out.println("Authorize method");
    }

}
