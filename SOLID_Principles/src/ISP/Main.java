
package ISP;

public class Main {
    public static void main(String[] args) {
        SWE swe = new SWE();
        swe.classroom();
        swe.office();
        swe.computerLab();
        
        CSE cse = new CSE();
        cse.classroom();
        cse.office();
        cse.computerLab();
        
        
        ENG eng = new ENG();
        eng.classroom();
        eng.office();
        //ENG don't have computer lab
    }
}
