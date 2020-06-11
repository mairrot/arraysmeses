package arreglos;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		String [] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","stiembre","ocubre","noviembre","diciembre"};
		System.out.println("ingrese el numero del mes");
		numero=sc.nextInt();
		numero =numero-1;
		System.out.println(meses[numero]);
		
	}

}
