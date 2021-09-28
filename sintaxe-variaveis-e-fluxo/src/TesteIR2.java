import java.util.Scanner;
		public class TesteIR2 {
	
		public static void main(String[] args) {
			
			double salario = 0;
			int margem = 0;
			double imposto = 0;
			
			System.out.println("Digite a margem do seu salário ");

			System.out.println("1: menos de 1900");
			System.out.println("2: 1900.0 até 2800.0");
			System.out.println("3: 2800.01 até 3751.0");
			System.out.println("4: 3751.01 até 4664.0");
			System.out.println("5: maior que 4664.0");
			
			@SuppressWarnings("resource")
			Scanner scan= new Scanner(System.in);
			margem = scan.nextInt(); 
			
			System.out.println("Digite seu salário: ");
			
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			salario = sc.nextDouble(); 
					
			// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de
			// R$ 142
			// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
			// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
			
			
			switch (margem) { 
			
			case 1: System.out.println("Voce está isento de pagar IR");
			break;
			
			case 2: 
				
				imposto = (salario * 0.075);
				System.out.println("Sei IR é de 7.5%. Você pode deduzir na declaração o valor de R$ " + imposto);
				break; 
			
			case 3:
				
				imposto = (salario * 0.15);
				System.out.println("Sei IR é de 15%. Você pode deduzir na declaração o valor de R$ " + imposto);
				break; 
		
			case 4:
				
				imposto = (salario * 0.225);
				System.out.println("Sei IR é de 22.5%. Você pode deduzir na declaração o valor de R$ " + imposto);
				break; 
				
			default: 
				
				System.out.println("Rico d+, vtnc.");
				
			}

		}

	}
	
	

