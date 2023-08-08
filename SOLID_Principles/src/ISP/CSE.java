
package ISP;

public class CSE implements Department,IICT{

    @Override
    public void classroom() {
        System.out.println("CSE has classroom");
    }

    @Override
    public void office() {
        System.out.println("CSE has office");
    }

    @Override
    public void computerLab() {
        System.out.println("CSE has computer lab");
    }
    
}