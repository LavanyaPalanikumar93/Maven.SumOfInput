import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number n");
        int n = scanner .nextInt();

        int sum = sumofInputs(n);
    }

    public static int sumofInputs(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("total " +sum);
        return sum;
    }
}