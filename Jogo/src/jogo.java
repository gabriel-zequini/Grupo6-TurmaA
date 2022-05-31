import java.util.Scanner;
public class jogo {
	
	public static void main(String[] args) {
		
		System.out.println("Início do projeto RPG");
		
		Scanner input = new Scanner(System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		
		System.out.println("2º fase: ");
	
		do{
			System.out.println("Após sair do bunker você avista um carro tecnológico abandonado dentro de um armazém, mas antes de entrar, você viu outro sobrevivente de um bunker entrar e morrer imediatamente pois a entrada está infectada. ");
			
			System.out.println("Você possui as seguintes opções para conseguir o carro: ");
			System.out.println("1) Entrar sem respirar ");
			System.out.println("2) Pular as grades em volta do armazém ");
			System.out.println("3) Usar a máscara quimica na sua mochila ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
			
			case "2":
				System.out.println("Você foi infectado e morreu!!!");
				contador = contador +1; 
			break;
			
			case "3":
				System.out.println("Você conseguiu chegar até o carro!!! ");
				acertou = true;
				
				contador = contador +1;
				break;
				
			
			}
		
		}while (!acertou && contador <3);
		
		if(acertou) {
			System.out.println("Você alcançou o carro na " + contador + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
		}
		
		
	System.out.println("3º fase: ");
	
	
	    int contador2 = 0;
	    boolean acertou2 = false;
        do{
            System.out.println("Para ligar o carro você precisa consertar o painel de comunicação ");
			
			System.out.println("Você possui as seguintes opções para consertar o painel: ");
			System.out.println("1) Trocar o barramento ");
			System.out.println("2) Trocar a placa mãe e o barramento do painel ");
			System.out.println("3) Colocar gasolina ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
			
			case "2":
				System.out.println("Você conseguiu consertar o painel e ligar o carro!!!");
				acertou2 = true;
				contador2 = contador2 +1; 
			break;
			
			case "3":
				System.out.println("Você não conseguiu consertar o carro, ficou preso no armazém e morreu!!! ");
	
				contador2 = contador2 +1;
				break;
				
			}
        	
        }while (!acertou2 && contador2 <3);
		
		if(acertou2) {
			System.out.println("Você conseguiu consertar o painel na  " + contador2 + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
	
		}
	
        System.out.println("4º fase: ");
        
        int contador3 = 0;
        boolean acertou3 = false;
        
        do{
			System.out.println("Após conseguir ligar o carro você precisa sair do armazém e pegar a estrada para Washington pelo estado de Óregon ");
			
			System.out.println("Você possui as seguintes opções para sair do armazém: ");
			System.out.println("1) Derrubar o muro com o carro");
			System.out.println("2) Derrubar a cerca danificada com o carro ");
			System.out.println("3) Correr até o portão para abri-lo e depois sair ");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
				System.out.println("Você bateu o carro contra o muro e morreu!!");
				contador3 = contador3 + 1;
			    break;
			case "2":
				System.out.println("Você conseguiu sair do armazém e pegar a estrada para washington!!!");
				acertou3 = true;
				contador3 = contador3 +1; 
			break;
			
			case "3":
				System.out.println("Você foi pego por uma horda de infectado e morreu!!! ");
				
				contador3= contador3 +1;
				break;

			}
		
		}while (!acertou3 && contador3 <3);
		
		if(acertou3) {
			System.out.println("Você conseguiu sair do armazém na  " + contador3 + "a Tentativa");
		}else { 
			System.out.println("Game over!!!");
		}
        
        
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
