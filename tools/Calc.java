package tools;
import secondpkg.minus;;
public class Calc {
    public int add(int a, int b) {
        minus m = new minus();
        int result = m.subtract(a, b);
        System.out.println("Subtraction Result: " + result);
        return a + b;
    }
}