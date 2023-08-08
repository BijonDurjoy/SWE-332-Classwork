
package ISP;

public class SWE implements Department,IICT{

    @Override
    public void classroom() {
        System.out.println("SWE has classroom");
    }

    @Override
    public void office() {
        System.out.println("SWE has office");
    }

    @Override
    public void computerLab() {
        System.out.println("SWE has computer lab");
    }
    
}
