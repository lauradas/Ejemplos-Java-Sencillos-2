import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número entre 1 y 10: ");
		int num=sc.nextInt();
		sc.nextLine();
		
		if(num>=1 && num<=10) {
			System.out.println("Tabla de multiplicar del "+num+":");
			for(int i=1; i<=10; i++) {
				int resultado=num*i;
				System.out.println(num+" x "+i+" = "+resultado);
			}
		}else {
			System.out.println("Número fuera rango especificado. Debe ser entre 1 y 10.");
		}
		
		sc.close();
	}

}
