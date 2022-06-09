import java.util.Scanner;

public class jogo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		
		do{
			System.out.println("Assim que ele consegue sair da cela, ele percebe que estava em uma casa “simples” porem grande,ao olhar o relógio e o calendário, ele vê que ficou quase 1 dia em cativeiro, desmaiado!");
			System.out.println("O personagem sobe as escadas pois a ficava no porão da casa e ele percebe que tem cerca de 7 sobreviventes vivendo no local, e que provavelmente não tinham boas intenções com ele, já que podiam pegar recursos com a família em troca da vida dele.");
			System.out.println("O personagem olha pra fora da casa pra saber onde ela estava localizada e percebe que estava em uma fazenda, com ruas largas e lisas, no estado de Oregon, além disso ele percebe que tem um pequeno avião lá fora, o personagem não pensa duas vezes e já vai tentar sair da casa e continuar seu trajeto até sua família, então o personagem passa por 5 das pessoas que estavam na casa em escondido “stealth”, assim ele consegue sair da casa porem perto do avião ele ve dois homens como se eles estivessem protegendo o avião e a casa de outros saqueadores, com isso ele tem que bolar um plano pra lutar com os dois sobreviventes e entrar no avião.");
			System.out.println("Para se livrar dos saqueadores ele precisa lutar porém eles estam armados! Com issso ele tem 3 opções:");
			System.out.println("1) Ataca-los por tras um de cada vez, sem fazer muito barulho para não alarmar o outro!");
			System.out.println("2) Não ataca-los e ir direto ao avião");
			System.out.println("3) Ataca-lós brutalmente de uma vez só");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
            switch(alternativa) {
			
			case "1":
                acertou = true;
				break;
			
			case "2":
				System.out.println("Ao tentar ir direto para o avião os sobreviventes percebem uma movimentação! tente novamente:");
				contador = contador +1; 
			    break;
				
			case "3":
				System.out.println("Ao atacalós você se machuva e não consegue seguir na luta! tente novamente: ");
				contador = contador +1; 
			    break;
			
			}
		
		} while (!acertou && contador <3);
		
		if(acertou) {
			System.out.println("Você conseguiu acerta os sobreviventes e segue em diração do avião!");
		}else { 
			System.out.println("Game over!");
		}
		
		do{
			System.out.println("Após conseguir entrar no avião, ele tem que resolver mais um desafio para conseguir ligar o sistema da aeronave e ligar os motores!");
			
			System.out.println("Para ligar o sistema do avião você precisa descobrir qual a estrutura de uma CPU?: ");
			System.out.println("1) Barramentos, Mémoria, Entrada e Saída");
			System.out.println("2) Mémoria, Unidade Lógica, Registradores");
			System.out.println("3) Unidade de controle, Barramentos Interno, Resgistradores, Unidade lógica");
			
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
			
			case "2":
				System.out.println("Uma parte do sistema danificou com seu erro! mas tente novamente!");
				contador = contador +1; 
			break;
			
			case "3":
				acertou = true;
				
				contador = contador +1;
				break;
				
			}
		
		} while (!acertou && contador <3);
		
		if(acertou) {
			System.out.println("Você conseguiu ligar o avião! na sua " + contador + "ª tentativa!");
			System.out.println("Após conseguir ligar o avião ele sobe voo e vai em direção a Whasington!");
		}else { 
			System.out.println("Game over!");
		
		}
		
		do{
			System.out.println("O personagem pousa o avião em um aeroporto abandonado perto de onde estava o banker onde seu pai e irmão estão, quando ele sai do avião vê uma movimentação estranha um pouco distante dele porém com precaução ele se afasta e tenta decidir se ira embora ou tentara reencontar sua família, eram 3 criaturas nunca antes vistas! Ao que se sabe eram 3 Bhetas uma especie bem parecida com cavalo e com espinhos espalhados pelo corpo");
			System.out.println("Ele precisa decidir se ");
			System.out.println("1) Atacará as criaturas para poder seguir ate o banker");
			System.out.println("2) Seguirá viagem sozinho ");
			System.out.println("Escolha uma alternativa: ");
			
			alternativa = input.next();
			
			switch(alternativa) {
			
			case "1":
				System.out.println("ELe ataca brutalmente as criaturas porém acaba se ferindo seriamente e não sabe se terá chance de sobreviver");
				contador = contador +1; 
				
			case "2":
				acertou = true;
				contador = contador +1;
				break;
			}
		
		} while (!acertou && contador <3);
		
		if(acertou) {
			System.out.println("ELe segue viagem sozinho! com destino para....... FIM DE JOGO...   ");
		}else { 
			System.out.println("FIM DE JOGO...   ");
		
		}
	
	}
	
}

	