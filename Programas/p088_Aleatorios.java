
import java.util.Random;

public class p088_Aleatorios {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int a1 = rnd.nextInt();
		int a2 = rnd.nextInt(30)+1;
		int min = 100;
		int max = 300;
		int a3 = rnd.nextInt(max+min+1); //100...300 
		
		System.out.println("Número aleatorio\t" + a1);
		System.out.println("Número aleatorio 1 - 30\t" + a2);
		System.out.println("Número aleatorio 100 - 300\t" + a3);
	}
}