public class p086_ArregloMostrar {
	public static void mostrar(int[] x) {
		for (int i=0; i<x.length;i++)
			System.out.print(x[i] + " ");
	}
	public static void cuadrado(int[] x) {
		for (int i=0; i<x.length;i++)
			x[i] = x[i] * x[i];
		return x[];
	}
	public static void main(String[] args) {
		int A[] = {2,4,6,8,10,12,14,16};
		int B[] = {1,3,5,7,9,11,13,15,17};
		
		System.out.println("Arreglo A");
		mostrar(A);
		System.out.println("Arreglo B");
		cuadrado(B);
	}
}