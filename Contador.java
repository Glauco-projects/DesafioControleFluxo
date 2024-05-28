import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		 
		} catch (ParametrosInvalidosException exception) {
			System.out.println("Erro:  " + exception);
		} finally {
			terminal.close();
		}

		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;
		if (contagem <= 0) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
			
		} else {
            for ( int i = parametroUm; i <= contagem+1; i++) {
               System.out.println(i);
			}
		}
		
	}
}
