import java.util.Scanner;

public class p024_PagaTrabajadorv2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String nombre;
		int horas, hextra;
		float paga, pagabase, pagatotal, pextra;
		
		System.out.println("CALCULAR PAGA DE TRABAJADOR, HORAS EXTRA SON DOBLES.\n");
		System.out.print("  Introduce nombre  :  "); nombre = obj.nextLine();
		System.out.print("  Horas                   :  "); horas = obj.nextInt();
		System.out.print("  Paga                    :  "); paga = obj.nextFloat();
		
		pagabase = horas * paga;
		
		if (horas > 40) {
			hextra = horas - 40;
			pextra = hextra * (paga * 2);
			pagatotal = pagabase + pextra;
		}
		else {
			hextra = 0;
			pextra = 0;
			pagatotal = pagabase;
		}
		
		System.out.printf("\n\nEl trbajador/a  %s  ha trabajado  %d  hora/s a un sueldo de  %,.2f  $ pesos por hora.\n",nombre,horas,paga);
		System.out.printf("\n  Horas extra  :  %d",hextra);
		System.out.printf("\n  Pago extra  :  %,.2f  $  pesos",pextra);
		System.out.printf("\n  Pago base  :  %,.2f  $  pesos",pagabase);
		System.out.printf("\n  PAGA TOTAL  :  %,.2f  $  pesos\n",pagatotal);
	}
}