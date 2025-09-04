import java.util.Scanner;

public class p032_PagoEstacionamiento {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float tasa=0, paga, impuesto=0, total;
		int est;
		
		System.out.println("ELIGE\n");
		System.out.println("  [1]  Fuente Conauistadores  ( 3% )");
		System.out.println("\n  [2]  Tacuba  ( 5% )");
		System.out.println("\n  [3]  Borrego  ( 10% )");
		System.out.println("\n  [4]  Fuerza    ( 20% )"); 
		System.out.print("\n\nEstacionamiento?  "); est = obj.nextInt();
		System.out.print("\n\nPaga?  "); paga = obj.nextFloat();
		
		switch (n) {
			case 1 : tasa = 3f; break;
			case 2 : tasa = 5f; break;
			case 3 : tasa = 10f; break;
			case 4 : tasa = 20f; break;
			default :
				System.out.println("\n\nNo")
	}
}