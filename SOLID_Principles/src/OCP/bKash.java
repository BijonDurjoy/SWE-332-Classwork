
package OCP;


public class bKash implements CreditFee {

    @Override
    public double cashback(double amount) {
       return amount*0.025;
    }
}
