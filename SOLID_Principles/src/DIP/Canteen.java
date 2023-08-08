
package DIP;

public class Canteen {
    private CanteenPayment canteenPayment;
    public Canteen(CanteenPayment canteenPayment) {
        this.canteenPayment = canteenPayment;
    }
    public void pay(int amount) {
        canteenPayment.canteenBill(amount);
    }
}
