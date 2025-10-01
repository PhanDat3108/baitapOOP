package order;

import payment.PaymentMethod;

public class Order {
    private String customerName;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, double amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder() {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Số tiền: " + amount);
      
        paymentMethod.pay(amount);
        System.out.println("-----------------------------");
    }
}
