
public class Triangulo {
	//==============Atributos
	public double lado1;
	public double lado2;
	public double lado3;
	public String color;
	//==============Metodos
	public double perimetro() {
		return (lado1 + lado2 + lado3);
	}
	public double area() {
		double s = (lado1 + lado2 + lado3) / 2;
		return (Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)));
	}
	public boolean esEquilatero() { 
		if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esIsoceles() { 
		if ((lado1 == lado2) && (lado1 != lado3) || (lado2 == lado3) && (lado3 != lado1) || (lado3 == lado1) && (lado1 != lado2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esEscaleno() { 
		if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
			return true;
		} else {
			return false;
		}
	}
}
