import java.util.Scanner;

public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 0;
				
		System.out.println("Digite seu sal�rio: ");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		salario = scan.nextDouble(); 
				
		// De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de
		// R$ 142
		// De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350
		// De 3751.01 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636

		if (salario >= 1900.0 && salario <= 2800.0) {

			System.out.println("Seu IR � de 7.5%");
			System.out.println("Voc� pode deduzir R$ 142");

		} else if (salario >= 2800.01 && salario <= 3751.0) {

			System.out.println("Seu IR � de 15%");
			System.out.println("Voc� pode deduzir R$ 350");

		} else if (salario >= 3751.01 && salario <= 4664.00) {

			System.out.println("Seu IR � de 22.5%");
			System.out.println("Voc� pode deduzir R$ 636");

		}

	}

}
