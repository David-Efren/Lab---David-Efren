public class p090_Temperaturas {
	public static void mostrar(double[] x) {
		for (int i=0; i<x.length;i++)
			System.out.print(x[i] + " ");
	}
	public static void convert(double[] x) {
		for (int i=0; i<x.length;i++)
			if (x[i] > 10)
				x[i] = 0;
	}
	
	public static void main(String[] args) {
		double x[] = {2.34,44.56,7.89,0.5,2.5,4.67,40.3,22.35,56.22};
		
		System.out.println("Primer dígito :\t");
		System.out.print(x[0]);
		System.out.println("\n\nTercer dígito  :\t");
		System.out.print(x[0]);
		System.out.println("\n\nAntes del cambio :");
		mostrar(x);
		System.out.println("\n\nDespues del cambio :\n(Números mayor que diez son igual a cero)");
		convert(x);
		mostrar(x);
		
	}
}