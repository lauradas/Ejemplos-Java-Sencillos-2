import java.util.Scanner;

public class HorarioExtraescolar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un día de la semana: ");
		String diasemana=sc.nextLine();
		
		switch(diasemana.toLowerCase()) {
		case "lunes":
			System.out.println("Psicomotricidad");
			break;
		case "martes":
			System.out.println("Natación");
			break;
		case "miércoles":
			System.out.println("Música");
			break;
		case "jueves":
			System.out.println("Natación");
			break;
		case "viernes":
			System.out.println("Descanso");
			break;
		case "sábado":
		case "domingo":
			System.out.println("\033[31mDía sin actividades\033[0m");
			break;
		default:
			System.out.println("\033[31mDía erróneo\033[0m");	
		}
	}

}
