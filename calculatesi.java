import java.util.Scanner;

public class calculatesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        double simpleinterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleinterest);
    }
}