import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		
		Triangulo tr1 = new Triangulo();
		Triangulo tr2 = new Triangulo();
		
		System.out.print("Ingrese lado 1 del primer triangulo: "); 
		tr1.lado1 = sc.nextDouble(); System.out.println(" ");
		System.out.print("Ingrese lado 2 del primer triangulo: "); 
		tr1.lado2 = sc.nextDouble(); System.out.println(" ");
		System.out.print("Ingrese lado 3 del primer triangulo: "); 
		tr1.lado3 = sc.nextDouble(); System.out.println(" ");
		System.out.println("Ingrese color del primer triangulo: ");
		tr1.color = st.nextLine();
		System.out.println("===============================================");
		System.out.print("Ingrese lado 1 del segundo triangulo: "); 
		tr2.lado1 = sc.nextDouble(); System.out.println(" ");
		System.out.print("Ingrese lado 2 del segundo triangulo: "); 
		tr2.lado2 = sc.nextDouble(); System.out.println(" ");
		System.out.print("Ingrese lado 3 del segundo triangulo: "); 
		tr2.lado3 = sc.nextDouble();  System.out.println(" ");
		System.out.println("Ingrese color del segundo triangulo: ");
		tr2.color = st.nextLine();
		System.out.println("===============================================");
		System.out.println("Triangulo 1: ");
		System.out.println("Perimetro: " + tr1.perimetro());
		System.out.println("Area: " + tr1.area());
		if (tr1.esEquilatero()) {
			System.out.println("Tipo de Triangulo: Equilatero");
		} else if(tr1.esEscaleno() ) {
			System.out.println("Tipo de Triangulo: Escaleno");
		} else if (tr1.esIsoceles()) {
			System.out.println("Tipo de Triangulo: Isoceles");
		}
		System.out.println("Color: "+ tr1.color);
		System.out.println("===============================================");
		System.out.println("Triangulo 2: ");
		System.out.println("Perimetro: " + tr2.perimetro());
		System.out.println("Area: " + tr2.area());
		if (tr2.esEquilatero()) {
			System.out.println("Tipo de Triangulo: Equilatero");
		}
		if (tr2.esEscaleno() ) {
			System.out.println("Tipo de Triangulo: Escaleno");
		}
		if (tr2.esIsoceles()) {
			System.out.println("Tipo de Triangulo: Isoceles");
		}
		System.out.println("Color: "+ tr2.color);
	}

}
