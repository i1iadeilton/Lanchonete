import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    double conta = 0,cachorroQuente,xSalada;
		double xBacon,mistoQuente,refrigerante;
		int quantidade;
		
		System.out.println("-----------------------");
		System.out.println("Lanchonete FiveStar");
		System.out.println("-----------------------");
		System.out.println("Escolha seu lanche! :)");
		
		System.out.print("\n1-Cachorro Quente - R$ 4.00\n2-X-Salada - R$ 4.50\n3-X-Bacon - R$ 5.00\n");
		System.out.println("4-Misto quente - R$ 2.00\n5-Refrigerante - R$ 1.50\n");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
		
		case 1: 
			cachorroQuente = 4.00;
			conta = cachorroQuente;
			break;
		case 2: 
			xSalada = 4.50;
			conta = xSalada;
			break;
		case 3: 
			xBacon = 5.00;
			conta = xBacon;
			break;
		case 4: 
			mistoQuente = 2.00;
			conta = mistoQuente;
			break;
		case 5: 
			refrigerante = 1.50;
			conta = refrigerante;
			break;
		}
		
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		conta *= quantidade;
		
		System.out.println("O valor do lanche deu: R$ "+ conta);
		
		
		sc.close();

	
  }
}