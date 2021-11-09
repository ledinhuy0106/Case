package model;

import java.io.Serializable;

public class Receipt implements Serializable {
    private int receitId;
    private String customerName;
    private String staffName;
    private String checkinDay;
    private String checkoutDay;
    private double receiptPrice;

    public Receipt() {
    }

    public Receipt(int receitId, String customerName, String staffName, String checkinDay, String checkoutDay,double receiptPrice) {
        this.receitId = receitId;
        this.customerName = customerName;
        this.staffName = staffName;
        this.checkinDay = checkinDay;
        this.checkoutDay = checkoutDay;
        this.receiptPrice=receiptPrice;
    }

    public int getReceitId() {
        return receitId;
    }

    public void setReceitId(int receitId) {
        this.receitId = receitId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getCheckinDay() {
        return checkinDay;
    }

    public void setCheckinDay(String checkinDay) {
        this.checkinDay = checkinDay;
    }

    public String getCheckoutDay() {
        return checkoutDay;
    }

    public void setCheckoutDay(String checkoutDay) {
        this.checkoutDay = checkoutDay;
    }

    public double getReceiptPrice() {
        return receiptPrice;
    }

    public void setReceiptPrice(double receiptPrice) {
        this.receiptPrice = receiptPrice;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-25s%-25s%-20s%-20s%-5s",
                getReceitId(), getCustomerName(), getStaffName(), getCheckinDay(), getCheckoutDay());
    }
}


