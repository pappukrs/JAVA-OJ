import java.util.*;

public class Multiplyby50 {

    public static int multiplyby50(int a) {
        return a * 50;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("The Result is:" + multiplyby50(num));
    }
}
