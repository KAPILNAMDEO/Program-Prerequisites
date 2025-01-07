import java.util.Scanner;

public class cylindervolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();
        
        double volume = Math.PI * Math.pow(r, 2) * h;
        
        System.out.println("The volume of the cylinder is: " + volume);
        
        sc.close();
    }
}
