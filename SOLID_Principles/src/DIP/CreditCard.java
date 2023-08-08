
package DIP;

public class CreditCard implements CanteenPayment{

    @Override
    public void canteenBill(int amount) {
        System.out.println("Paid in Credit Card");
    }
}
