import java.util.*;

public class ProductofSix {
    public static int productofsix(int a, int b, int c, int d, int e, int f) {
        return a * b * c * d * e * f;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int one = obj.nextInt();
        int two = obj.nextInt();
        int three = obj.nextInt();
        int four = obj.nextInt();
        int five = obj.nextInt();
        int six = obj.nextInt();
        System.out.println("The product is :" + productofsix(one, two, three, four, five, six));

    }
}
