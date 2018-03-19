import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kq = false;
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) kq = false;
                else kq = true;
            }
            if (kq) System.out.println(number + "is a prime");
            else System.out.println(number + " is not s prime");
        }
    }
}
