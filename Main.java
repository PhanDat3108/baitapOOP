import order.Order;
import payment.*;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Nguyen Van A", 100000, new CashPayment());
        Order o2 = new Order("Tran Thi B", 200000, new PayPalPayment());
        Order o3 = new Order("Le Van C", 300000, new MoMoPayment());

        o1.processOrder();
        o2.processOrder();
        o3.processOrder();
    }
}
