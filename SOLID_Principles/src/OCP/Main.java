
package OCP;

public class Main {
    public static void main(String[] args) {
          bKash bk = new bKash();
          double fee = 5000;
          double cashback = bk.cashback(fee);
          System.out.println("Cashback from bkash : "+cashback);
          System.out.println("Final Charge :"+(fee-cashback));
          
          nagad na = new nagad();
          double fee2 = 5000;
          double cashback2 = na.cashback(fee);
          System.out.println("Cashback from nagad : "+cashback2);
          System.out.println("Final Charge :"+(fee2-cashback2));
    }
}
