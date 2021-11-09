package Service;

import model.Receipt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceiptManage implements InterFace<Receipt>, Serializable {
    List<Receipt> receiptList = new ArrayList<>();

    public ReceiptManage(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    public ReceiptManage() {
        receiptList = new ArrayList<>();
    }

    public List<Receipt> getReceiptList() {
        return receiptList;
    }

    public void setReceiptList(List<Receipt> receiptList) {
        this.receiptList = receiptList;
    }

    @Override
    public void add(Receipt receipt) {
        receiptList.add(receipt);
    }

    @Override
    public void edit(int id, Receipt receipt) {
        int index = findIndexById(id);
        receiptList.set(index, receipt);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        receiptList.remove(index);

    }

    public void delete2(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            receiptList.remove(index);
            System.out.println("Hoàn Thành");
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < receiptList.size(); i++) {
            if (receiptList.get(i).getReceitId()==id) {
                return i;
            }
        }
        return -1;
    }

    public void findIndexById2(int id) {
        for (Receipt receipt : receiptList) {
            if (receipt.getReceitId() == id) {
                System.out.println(receipt);
            }
        }
    }

    @Override
    public void printList() {
        for (Receipt receipt : receiptList) {
            System.out.println(receipt);
        }
    }

    public Receipt creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter staff name: ");
        String staffName = scanner.nextLine();
        System.out.println("Enter first day: ");
        String checkIn = scanner.nextLine();
        System.out.println("Enter last day: ");
        String checkOut = scanner.nextLine();
        System.out.println("Enter receipt ID: ");
        int receiptId = scanner.nextInt();
        System.out.println("Enter total bill: ");
        double receiptPrice = scanner.nextDouble();
        return new Receipt(receiptId, customerName, staffName, checkIn, checkOut, receiptPrice);
    }

    public void getTotalMoney() {
        int sum = 0;
        for (Receipt receipt : receiptList) {
            sum += receipt.getReceiptPrice();
        }
        System.out.println("Total Money: " + sum + " USD");
    }
}

