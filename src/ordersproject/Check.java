/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersproject;

/**
 *
 * @author 1896513
 */
public class Check {

    private String name;
    private String bankID;

    public Check(String name, String bankID) {
        this.name = name;
        this.bankID = bankID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getName(String name) {
        return name;
    }

    public String getBankID(String bankID) {
        return bankID;
    }
    public void authorized(){
        System.out.println("Authorize method");
    }
}
