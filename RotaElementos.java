
public class RotaElementos {

	public static void main(String[] args) {
		//Definir el array (10 elementos)
		int[] numeros=new int[10];
		
		//Carga el array de números aleatorios
		for(int i=0; i<10;i++) {
			numeros[i]=(int)(Math.random()*10)+1;
		}
		
		//Mostrar el contenido del array
		System.out.println("Contenido original del array:");
		mostrarArray(numeros);
		
		//Rotar hacia la derecha
		rotarElementos(numeros);
		
		//Mostrar el contenido después de la rotación
		System.out.println("\nContenido del array depués de la rotación");
		mostrarArray(numeros);
	}

	//Método para mostrar el contenido de un array
	private static void mostrarArray(int[] numeros) {
		for(int num: numeros) {
			System.out.println(num+ " ");
		}
		System.out.println();
	}
	
	//Método para rotar los elementos de un array una posición hacia la derecha
	private static void rotarElementos(int[] numeros) {
		int ultimoelemento=numeros[numeros.length-1];
		
		//Desplazar los elementos hacia la derecha
		for(int i=numeros.length-1;i>0;i--) {
			numeros[i]=numeros[i-1];
		}
		
		//Colocar el último elemento en la posición
		numeros[0]=ultimoelemento;
	}

}
