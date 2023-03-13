import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter xx:");
        int x = scanner.nextInt();
        System.out.println("Enter yy:");
        int y = scanner.nextInt();
        System.out.println("Hypotenuse: " + Math.sqrt(x*x + y*y));


    }

}
