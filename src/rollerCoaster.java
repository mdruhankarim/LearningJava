import java.util.Scanner;
public class rollerCoaster {
    public static void main(String[] args){
        int weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        weight = scanner.nextInt();
        System.out.print("Enter your Height in cm: ");
        height = scanner.nextInt();
        if(weight >=40 && height >=120){
            System.out.println("Congrats! You can ride!");
        }
        else
            System.out.println("Sorry, You can't ride today.");
    }
}
