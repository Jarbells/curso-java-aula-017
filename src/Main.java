import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double amount = sc.nextDouble();
		double tax = 0.0;
		
		if (amount <= 2000.0) {
			tax = 0.0;
		}
		else if (amount <= 3000.0) {
			tax = (amount - 2000.0) * 0.08; 
		}
		else if (amount <= 4500.0) {
			tax = (amount - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			tax = (amount - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (tax == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", tax);
		}
		
		sc.close();		
	}
}
