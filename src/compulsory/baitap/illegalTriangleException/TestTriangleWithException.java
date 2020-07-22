package compulsory.baitap.illegalTriangleException;

public class TestTriangleWithException {
    public static void main(String[] args) {
        try {
            new Triangle();
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
