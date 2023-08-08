
package OCP;

public class nagad implements CreditFee {    
    @Override
    public double cashback(double amount) {
       return amount*0.05;
    }
}
