import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // for (int num = 0; num < 100; num++) {
        // System.out.println("Hello world");
        // }

        // for (int num = 0; num < 11; num++) {
        // System.out.print(num + " ");
        // }

        // int curr = 0;
        // while (curr < 11) {
        // System.out.print(curr + " ");
        // curr++;
        // }

        // int curr = 0;
        // do {
        // System.out.print(curr + " ");
        // curr++;
        // } while (curr < 11);

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;
        for (int num = 1; num <= limit; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
