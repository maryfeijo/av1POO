import java.util.Scanner;

public class TestMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica matematica = new Matematica();
		Scanner input = new Scanner(System.in);
		//Leia um n�mero e armazene na classe (teste 1.1)
		int lerNumero;
		System.out.println("Insira um numero:");
		lerNumero = input.nextInt();
		//Chame o m�todo fibonacci que imprima a s�rie (teste 1.2)
		matematica.Fibonacci(lerNumero);
		//Chame o m�todo fatorial que imprime o fatorial (teste 1.3)
		matematica.Fatorial(lerNumero);
		input.close();
	}
}
