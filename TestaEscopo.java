public class TestaEscopo {

	public static void main(String[] args) {

		double salario = 3100;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("Desconto de 7,5% ");
			double desconto = salario * (7.5 / 100);
			System.out.println("Total igual a " + (salario - desconto));
		}
		if (salario > 2800 && salario <= 3751) {
			System.out.println("Desconto de 15% ");
			double desconto = salario * (15 / 100);
			System.out.println("Total igual a " + (salario - desconto));
		}
		if (salario >= 3751 && salario <= 4664) {
			System.out.println("Desconto de 22.5% ");
			double desconto = salario * (22.5 / 100);
			System.out.println("Total igual a " + (salario - desconto));
		}

	}
}