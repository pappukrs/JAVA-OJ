import java.util.*;

public class SumOfFive {

    public static int sumOfFive(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int one = obj.nextInt();
        int two = obj.nextInt();
        int three = obj.nextInt();
        int four = obj.nextInt();
        int five = obj.nextInt();
        System.out.println("The sum of five is:" + sumOfFive(one, two, three, four, five));
    }
}
