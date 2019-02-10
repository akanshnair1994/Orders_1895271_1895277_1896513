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
public class Cash extends Payment {

    private float cashTendered;

    public Cash(float cashTendered, float amount) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    public void setcashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }

    public float getcashTendered() {
        return cashTendered;
    }

}
