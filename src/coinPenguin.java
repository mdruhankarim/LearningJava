import java.util.Scanner;

public class coinPenguin {
    public static void main(String[] args){
        double converted, coinValue = 0.0045;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total coin number: ");
        int coin = scanner.nextInt();
        converted = coin * coinValue;
        System.out.println("You have $" + converted + " USD.");

    }
}
