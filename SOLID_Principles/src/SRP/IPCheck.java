
package SRP;

public class IPCheck implements StudentMailHandler{
    private StudentMailHandler studentMailHandler;
    @Override
    public void setNextHandler(StudentMailHandler studentMailHandler) {
        this.studentMailHandler = studentMailHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        String clientIP = getClientIP();
        if (!clientIP.contains("192.168.1.")) {
            System.out.println("IPWhitelisting : Authentication failed.");
            return false;
        }else {
            System.out.println("IPWhitelisting : Authentication successful.");
            return studentMailHandler.authenticate(userName, password);
        }      
    }
    
    private String getClientIP() {
        return "192.168.1.";
    }  
}
