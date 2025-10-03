public class p087_ArregloTemperaturas {
	public static void mostrar(double[] x) {
		for (int i=0; i<x.length;i++)
			System.out.print(x[i] + " ");
	}
	
	public static double mayor(double[] x) {
		double m = x[0];
		for (int i = 0; i<x.length;i++)
			if (x[i] > m) m = x[i];
		return m;
	}
	
	public static double menor(double[] x) {
		double m = x[0];
		for (int i = 0; i<x.length;i++)
			if (x[i] < m) m = x[i];
		return m;
	}
	
	public static double mayor(double[] x) {
		int pos = -1;
		for (int i = 0; i<x.length;i++)
			if (x[i] == b) {
				pos = i;
				break;
			}
		return pos;
	}
	
	public static void main(String[] args) {
		double[] temps = {12.34,56.22,5.0,10.0,10.25,60.22,10.5};
		
		System.out.println("ARREGLO DE TEMPERATURAS\n");
		mostrar(temps);
		System.out.println("\nEl mayor es :\t" + mayor(temps));
		System.out.println("\nEl menor es :\t" + menor(temps));
		
		//Busqueda con la nuestra
		System.out.print("\nElemento a buscar :\t");
		double bus = new Scanner(System.in).nextDouble();
		if(pos != -1) 
			System.out.println("\tEncontrado en posición " + pos);
		else
			System.out.println("\tNo");
	}
}