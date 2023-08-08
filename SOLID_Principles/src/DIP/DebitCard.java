
package DIP;


public class DebitCard implements CanteenPayment{

    @Override
    public void canteenBill(int amount) {
        System.out.println("Paid in DebitCard");
    }
}

