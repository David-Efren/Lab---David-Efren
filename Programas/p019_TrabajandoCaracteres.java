public class p019_TrabajandoCaracteres {
	public static void main(String[] args) {
		
		char c1 = 'A'; char c2 = 'B'; // char = 1 carácter
		char numero = '9', arroba = '@', pesos = 36; // $ es el carácter 36 en unicode
		char java = '\u2668';// u = unicode, este es un símbolo de café/java
		char w = 119;
		char espacio = ' ';
		
		System.out.println("\nTrabajando con carácteres\n");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(numero);
		System.out.println(arroba);
		System.out.println(pesos);
		System.out.println(java);
		System.out.println(w);
		System.out.println(espacio);
		
		c1++;c2++; numero--;
		System.out.println(numero);
		System.out.printf("\nC1  / C2  =  %c  /  %c",c1,c2); // ahora son B y C por el incremento 
		System.out.printf("\nC1  / C2  =  %d  /  %d",(int)c1,(int)c2); // muestra su codigo
		
		// isLetter,Digit,Alphabetic,SpaceChar(?)
		
		System.out.printf("\nes C1 una letra?   :  %b",Character.isLetter(c1));
		System.out.printf("\nes C1 un digito?   :  %b",Character.isDigit(c1));
		System.out.printf("\nes C1 alfabético?  :  %b",Character.isAlphabetic(c1));
		System.out.printf("\nes C1 un espacio?   :  %b",Character.isSpaceChar(c1));
		
	}
}