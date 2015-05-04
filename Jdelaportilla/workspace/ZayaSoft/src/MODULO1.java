import java.util.Scanner;


public class MODULO1 {
	
	public static void main (String args []){
		int a=0, b=0, suma=0, resta=0, mul=0, div=0;
		
		Scanner ivo=new Scanner (System.in);
		
		System.out.println("Introduce el valor del primer número: ");
		a=ivo.nextInt();
		System.out.println("Introduce el valor del segundo número: ");
		b=ivo.nextInt();
		
		suma = a+b; //MODULO SUMA
		resta=a-b; //MODULO RESTA
		mul=a*b; //MODULO MULTIPLICACION
		div=a/b; //MODULO DIVISION
		
		System.out.println("La suma es: "+suma+" La resta es: "+resta+" La multiplicacion es: "+mul+" La division es: "+div);
		

}
} 