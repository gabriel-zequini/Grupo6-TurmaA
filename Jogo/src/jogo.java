import java.util.Scanner;
public class jogo {
	
	public static void main(String[] args) {
		
		System.out.println("In�cio do projeto RPG");
		
		Scanner input = new Scanner(System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		
		System.out.println("2� fase: ");
	
		do{
			System.out.println("Ap�s sair do bunker voc� avista um carro tecnol�gico abandonado dentro de um armaz�m, mas antes de entrar, voc� viu outro sobrevivente de um bunker entrar e morrer imediatamente pois a entrada est� infectada. ");
			
			System.out.println("Voc� possui as seguintes op��es para conseguir o carro: ");
			System.out.println("1) Entrar sem respirar ");
			System.out.println("2) Pular as grades em volta do armaz�m ");
			System.out.println("3) Usar a m�scara quimica na sua mochila ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
			
			case "2":
				System.out.println("Voc� foi infectado e morreu!!!");
				contador = contador +1; 
			break;
			
			case "3":
				System.out.println("Voc� conseguiu chegar at� o carro!!! ");
				acertou = true;
				
				contador = contador +1;
				break;
				
			
			}
		
		}while (!acertou && contador <3);
		
		if(acertou) {
			System.out.println("Voc� alcan�ou o carro na " + contador + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
		}
		
		
	System.out.println("3� fase: ");
	
	
	    int contador2 = 0;
	    boolean acertou2 = false;
        do{
            System.out.println("Para ligar o carro voc� precisa consertar o painel de comunica��o ");
			
			System.out.println("Voc� possui as seguintes op��es para consertar o painel: ");
			System.out.println("1) Trocar o barramento ");
			System.out.println("2) Trocar a placa m�e e o barramento do painel ");
			System.out.println("3) Colocar gasolina ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
			
			case "2":
				System.out.println("Voc� conseguiu consertar o painel e ligar o carro!!!");
				acertou2 = true;
				contador2 = contador2 +1; 
			break;
			
			case "3":
				System.out.println("Voc� n�o conseguiu consertar o carro, ficou preso no armaz�m e morreu!!! ");
	
				contador2 = contador2 +1;
				break;
				
			}
        	
        }while (!acertou2 && contador2 <3);
		
		if(acertou2) {
			System.out.println("Voc� conseguiu consertar o painel na  " + contador2 + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
	
		}
	
        System.out.println("4� fase: ");
        
        int contador3 = 0;
        boolean acertou3 = false;
        
        do{
			System.out.println("Ap�s conseguir ligar o carro voc� precisa sair do armaz�m e pegar a estrada para Washington pelo estado de �regon ");
			
			System.out.println("Voc� possui as seguintes op��es para sair do armaz�m: ");
			System.out.println("1) Derrubar o muro com o carro");
			System.out.println("2) Derrubar a cerca danificada com o carro ");
			System.out.println("3) Correr at� o port�o para abri-lo e depois sair ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
				System.out.println("Voc� bateu o carro contra o muro e morreu!!");
				contador3 = contador3 + 1;
			    break;
			case "2":
				System.out.println("Voc� conseguiu sair do armaz�m e pegar a estrada para washington!!!");
				acertou3 = true;
				contador3 = contador3 +1; 
			break;
			
			case "3":
				System.out.println("Voc� foi pego por uma horda de infectado e morreu!!! ");
				
				contador3= contador3 +1;
				break;

			}
		
		}while (!acertou3 && contador3 <3);
		
		if(acertou3) {
			System.out.println("Voc� conseguiu sair do armaz�m na  " + contador3 + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
		}
        
        
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
