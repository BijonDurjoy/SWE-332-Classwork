
package SRP;

public interface StudentMailHandler {
    void setNextHandler(StudentMailHandler studentMailHandler);
    boolean authenticate(String userName, String password);
}
