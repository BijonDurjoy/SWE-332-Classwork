
package DIP;

public class Cash implements CanteenPayment{

    @Override
    public void canteenBill(int amount) {
        System.out.println("Paid in cash");
    }
    
}
