import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                count++;
                n = n / 2;
            }
        }
        if (count == 1) {
            System.out.println("Yes a power of 2");
        } else {
            System.out.println("Not a power of 2");
        }

    }

}
