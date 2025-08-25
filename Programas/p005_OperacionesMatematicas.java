// Resolver problemas matemáticos???

public class p005_OperacionesMatematicas {
	public static void main(String[] args) {
		double x, y, suma,resta,mult,div,res,pot;
		
		x = 10.5;
		y = 2.5;
		
		suma = x + y;
		resta = x - y;
		mult = x * y;
		div = x / y;
		res = x % y;
		pot = Math.pow(x,y);
		
		System.out.println(String.format ("Los números son   : %.2f", x, y));
		System.out.println(String.format ("Sumados              : %.2f", suma));
		System.out.println(String.format ("Restados              : %.2f", resta));
		System.out.println(String.format ("Multiplicados         : %.2f", mult));
		System.out.println(String.format ("Divididos               : %.2f", div));
		System.out.println(String.format ("Resto                    : %.2f", res));
		System.out.println(String.format ("Potencia                : %.2f", pot));
	}
}