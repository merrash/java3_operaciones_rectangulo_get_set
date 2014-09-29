import java.util.Scanner;

public class OperacionesRectangulo {

	
	public static void main(String[] args) {
		
		double altura, base, resultadoArea, resultadoPerimetro;
		Rectangulo operaciones = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa altura: ");
		altura = sc.nextDouble();

		
		System.out.print("\ningresa base: ");
		base = sc.nextDouble();

		resultadoArea = operaciones.area(altura, base);		
		resultadoPerimetro = operaciones.perimetro(altura, base);

		System.out.println("\nEl resultado AREA es: " + resultadoArea);
		System.out.println("\nEl resultado PERIMETRO es: " + resultadoPerimetro);
		
		
		System.out.println("\n\nLO HAS CONSEGUIDO!!\n");
	}

}
