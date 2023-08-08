
package DIP;

public class Main {
    public static void main(String[] args) {
        CanteenPayment canteenPayment = new Cash();
        Canteen canteen = new Canteen(canteenPayment);
        canteen.pay(200);
    }
}
