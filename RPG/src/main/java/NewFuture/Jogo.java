package newfuture;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class jogo {
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("\n---- NEW FUTURE: THE GAME ----");
        
        System.out.println("\nOlá Sobrevivente, antes de começar a aventura nesse mundo pós-apocaliptico insano, digite um nome para o personagem: ");
        String nome = entrada.next();
        
        int op=0;
        
        do{
            
            System.out.println("\n1) Qual a hisória de NewFuture?");
            System.out.println("2) Como Jogar?");
            System.out.println("3) Começar a aventura!");
            System.out.println("4) Créditos");
            System.out.println("5) Sair");
            
            System.out.println("\nOlá Sobrevivente escolha uma opção de 1 a 4");
            op = entrada.nextInt();
            
            switch (op){
                
                case 1: 
                    System.out.println("    Após três anos sendo obrigado a viver em um banker para conseguir sobreviver, "+nome+ " finalmente pode sair,"
                            + "\ne seu unico objetivo é econtrar com seu pai e seu irmão, que estão em outro estado dos Estados Unidos. Porém pra fazer isso, "
                            + "\nterá que enfrentar vários desafios, áreas radioativas, outros sobreviventes saqueadores e criaturas nunca antes vistas.  ");
                    break;
                    
                case 2: 
                    System.out.println("    As fases de NewFuture tem três respostas possiveis (três alternativas 0,1 e 2) em que o jogador pode "
                                    + "\nescolher o próximo passo de "+nome+", porém se escolher a alternativa errada duas vezes você perde, e terá que "
                                    + "\niniciar game novamente para saber o resto da aventura. As fases 1,2,3 e 4 são com alternativas normais que não "
                                    + "\nembaralham para o jogador entender como funciona o game e as fase 5, 6, 7, 8, 9 e 10 embaralham se você errar uma vez "
                                    + "\nmas elas possuem dicas para auxiliar o jogador.");
                    
                    break;
                
                case 3: 
                    System.out.println("\nEntão vamos começar essa aventura sobrevivente!...");
                    int jo = op;
                            break;
                
                case 4 :
                    System.out.println("\nNOMES QUE CRIARAM NEW FUTURE: "
                            + "\nGabriel Zequini Falco"
                            + "\nGabriel Pereira"
                            + "\nGiovanne Moreira"
                            + "\nJoão Pedro");
                    break;
                
                case 5:
                    break; 
                    
                default : 
                    System.out.println("Opção inválida, digite um número de 1 a 4");
                } 
            
        }  while (op !=5  && op !=3);
        
        if (op ==3 ){
            
            
            boolean acertou = false;
		int contador = 0;
		String alternativa;
		
		System.out.println("\n----1º FASE - Novo Mundo-----");
	
		do{
			System.out.println("\n     Em 2030 uma radiação misteriosa no mundo inteiro fez a vida na terra quase acabar totalmente,"
                                                 + "\nsobreviveram apenas pessoas que conseguiram um lugar especial para se abrigar ou pessoas que já nasceram "
                                                 + "\nimunes a essa radiação sem explicação. Todos os animais e insetos não sofreram danos fatais com essa radiação,"
                                                 + "\nporém um terço de cada sofreu mutações genéticas, transformando-os em criaturas nunca vistas e fazendo com que "
                                                 + "\na vida na terra se tornasse uma verdadeira luta pela sobrevivência.\n" 
                                                 + "\n    Quando a radiação começou a dizimar a vida na terra, o governo disponibilizou bankers secretos para as famílias de "
                                                 + "\npessoas que serviam o exército (que eles tinham feito em diversos lugares do país em caso de guerra)." 
                                                 + "\n    Os bankers tinham alimentos para 3 pessoas viver cerca de 5 anos,  água, luz, roupas, camas, mas não tinha comunicação "
                                                 + "\ncom o mundo externo devido o confinamento em um lugar totalmente fechado e livre da radiação.\n" 
                                                 + "\n    "+ nome + " trabalhava no exercito no passado em um cargo bem alto e com um alta experiencia de computação, luta e "
                                                 + "\nsobrevivência, porem foi afastado devido a alguns problemas no país e isso fez com que ele pudesse ficar em um bunker, "
                                                 + "\nmas como ele que morava em Whasington e estava viajando  sozinho por causa de seu trabalho atual no momento do início do caos, "
                                                 + "\nem uma cidade pequena na California, ele teve que ir em um banker do exército na cidade que ele estava e ficar lá sozinho "
                                                 + "\n e longe de seu pai e seu irmão, até receber ordens para poder sair. ");
                                         
                                       System.out.println("\n3 anos depois de 2030, O banker que "+nome+" estava sobrevivendo, começa a fazer um barulho como se fosse um alarme, "+nome+" "
                                                 + "\nsobe as escadas rapidamente em seu banker que tinha cerca de 3 andares, quando ele chega no ultimo andar do banker mais proximo a superficie "
                                                 + "\nda terra, sobe um monitor de video bem grande como se fosse uma televisão de alta tecnologia, e começa a passar um vídeo do presidente dos EUA "
                                                 + "\ndizendo com que a radiação tinha acabado na maior parte do mundo e que as pessoas que sobreviveram poderiam sair do banker e avisou que o mundo "
                                                 + "\nnão era mais o mesmo, tinham saqueadores, criaturas horríveis e áreas que ainda continham a radiação mortal. O presidente disse que a senha para"
                                                 + "\nsair do banker era o ano de nascimento de "+nome+" em número binário");
			
			System.out.println("\n" + nome + " nasceu em 19-06-1996, então a senha para sair do banker é: ");
			System.out.println("[0] 11111010011");
			System.out.println("[1] 11111001111");
			System.out.println("[2] 11111001100");
			
			System.out.println("\nDigite sua resposta com cautela sobrevivente, você só tem duas chances...");
			
			alternativa = entrada.next();
			
			switch(alternativa) {
			
			case "0":
                            
                            System.out.println("\n---SENHA INCORRETA, tente novamente...");
                                  break;
			case "1":
				System.out.println("\n---SENHA INCORRETA, tente novamente...");
				contador = contador +1; 
                                break;
			
			case "2":
                                       System.out.println("\n"+nome+" ouve um barulho vindo no teto do banker, a grande porta começa a descer. Ele pega varios suprimemtos como comida, "
                                                   + "uma arma de fogo, uma máscara química para a radiação e kitmédicos, coloca tudo em sua mochila e sai do banker com um único objetivo, "
                                                   + "\nencontrar sua fámilia em Whasington...");
				acertou = true;
				
				contador = contador +1;
				break;
				
			
			}
		
		}while (!acertou && contador <3);
		
		if(acertou) {
            
                boolean acertou1 = false;
		int contador1 = 0;
		
		
		System.out.println("\n----- 2º FASE - Armazém Radioativo ----");
	
		do{
			System.out.println("\n  Então ele começa a caminhar perto da área que estava seu banker para ver se acha algo de útil que possa ajudar ele a chegar em seu longo destino. Horas se"
                                + "\npassam e ele ouve um barulho de alguém gritando como se estivesse com dor, ele vai correndo para verificar o que era e percebe que algum sobrevivente entrou"
                                + "\nem um armazém para pegar um carro que estava com a porta aberta, mas a entrada estava com um ar denso e quando ele olhou pra lá, viu que estava distorcendo a visão "
                                + "\ncomo se estivesse olhando o vapor de óleo quente, assim ele percebe que a entrada do armazém  estava infectada com a radiação e não se passou nem um minuto e o homem"
                                + "\nque passou pela área infectada simplesmente morreu...");
			
			System.out.println("\n"+nome+ " verifica as possibilidades, e percebe que o único jeito de chegar no carro é: ");
			System.out.println("[0] Entrar sem respirar ");
			System.out.println("[1] Pular as grades velhas em volta do armazém ");
			System.out.println("[2] Usar a máscara quimica na sua mochila ");
			
			System.out.println("\nEscolha o melhor jeito para entrar no armazém com vida: ");
			
			alternativa = entrada.next();
			
			switch(alternativa) {
			
			case "0":
                            
                       System.out.println("\nApesar de entrar sem respirar, os olhos de "+nome+" começaram a ficar irritados como se estivesse queimando, ele perdeu os movimentos do corpo e simplesmente "
                               + "\nmorreu. Tente novamente sobrevivente....");
			break;
			case "1":
				System.out.println("\nAs grades em volta do Armazém estavam muitos velhas, e quando ele chegou no topo as grades cairam. "+nome+" quebrou as duas pernas. Tente novamente...");
				contador1 = contador1 +1; 
			break;
			
			case "2":
				System.out.println("\nEle percebe que o único jeito de entrar é usando a máscara química, então ele pega a máscara na mochila, coloca em seu rosto e consegue passar"
                                        + "\n pela área infectada...");
				acertou1 = true;
				
				contador1 = contador1 +1;
				break;
				
			
			}
		
		}while (!acertou1 && contador1 <2);
		
		if(acertou1) {
			System.out.println("Você alcançou o carro na " + contador + "a Tentativa");
                        
                        System.out.println("\n----3º FASE - Finalmente, um carro -----");
	
	
	    int contador2 = 0;
	    boolean acertou2 = false;
            do{
                                System.out.println("\n  Chegando no carro, "+nome+" percebe que a chave estava no banco do passageiro, porém para ligar ele precisa consertar o painel de comunicação....");
			
                        System.out.println("As opções para consertar o painel são: ");
			System.out.println("[0] Tentar ligar com o painel quebrado ");
			System.out.println("[1] Trocar a placa mãe e o barramento do painel ");
			System.out.println("[2] Colocar gasolina ");
			
			System.out.println("\nEscolha a melhor opção para arrumar o carro:  ");
			
			alternativa = entrada.next();
			
			switch(alternativa) {
			
			case "0":
                            System.out.println("\nO painel está quebrado sobrevivente...Preste atenção e tente novamente...");
                            contador2 = contador2 +1;
				break;
			
			case "1":
				System.out.println("\n"+nome+" consertou o painel e conseguiu ligar o carro!!!");
				acertou2 = true;
				contador2 = contador2 +1; 
			break;
			
			case "2":
				System.out.println("\nO carro já estava com gasolina...E ainda está quebrado. Tente novamente...");
	
				contador2 = contador2 +1;
				break;
				
			}
        	
        }while (!acertou2 && contador2 <2);
		
		if(acertou2) {
			System.out.println("Você conseguiu consertar o painel na  " + contador2 + "a Tentativa");
                        
                        System.out.println("\n---- 4ºFASE - Pegando a Estrada ----");
        
        int contador3 = 0;
        boolean acertou3 = false;
        
        do{
                                System.out.println("\n  Após conseguir ligar o carro, "+nome+" precisava sair do armazém, mas a entrada ainda estava com a radiação, então ele percebe que o único jeito"
                                        + "\nde sair do armazém e seguir estada é: ");
			
			System.out.println("\nVocê possui as seguintes opções para sair do armazém: ");
			System.out.println("[0] Derrubar o muro novo com o carro");
			System.out.println("[1] Derrubar a grade velha com o carro ");
			System.out.println("[2] Sair pela lugar que entrou empurrando o carro ");
			
			System.out.println("\nQual o melhor jeito de sair desse armazém?: ");
			
			alternativa = entrada.next();
			
			switch(alternativa) {
			
			case "0":
				System.out.println("\nO muro caiu em cima de "+nome+", o matando imediatamente...Tente novamente....");
				contador3 = contador3 + 1;
			    break;
			case "1":
				System.out.println("\nEle conseguiu derrubar a grade velha com o carro e seguiu sua longa viagem...");
				acertou3 = true;
				contador3 = contador3 +1; 
			break;
			
			case "2":
				System.out.println("\nOs olhos de "+nome+" começaram a ficar irritados como se estivesse queimando, ele perdeu os movimentos do corpo e simplesmente morreu. Tente "
                                        + "\nnovamente sobrevivente...");
				
				contador3= contador3 +1;
				break;

			}
		
		}while (!acertou3 && contador3 <2);
		
		if(acertou3) {
			System.out.println("Você conseguiu sair do armazém na  " + contador3 + "a Tentativa");
                        
                         System.out.println("\n---- 5º FASE - O Grito de Socorro ----");
                int contador5 = 0;
                                System.out.println("\n  Após horas e horas dirigindo em direção a Whasington, "+nome+" ouve gritos dentro de um mercado em Óregon, ele simplesmente para o carro e "
                                        + "\ndesce para ver se podia ajudar a pessoa, mas grades do mercado estavam fechadas, ele vê um computador na portária do mercado que possivelmente "
                                        + "\nservia para abrir as grades, porem estava desconectado do computador um item exepcional de entrada de dados para que ele pudesse digitar o "
                                        + "\ncomando que estava escrito em uma folha, dizendo que abre as grades. Quando ele olha na gaveta embaixo do computador, vê três objetos relacionados"
                                        + "\ncom computador...");
                                
        String questao = "\nQual objeto de entrada de dados "+nome+" pode usar para digitar o comando? ";

        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("PenDrive");
        alternativas.add("Webcam");
        alternativas.add("Teclado");


            String alternativaCorreta = "Teclado";

        boolean respostaCerta = false;

            do { 

            System.out.println(questao);

            Collections.shuffle((List<String>) alternativas);

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println(
                "[" + i + "] " + ((List<String>)alternativas).get(i)
                );
            }

            System.out.println("DICA! Ele tem que digitar o comando...");
            String resposta = entrada.nextLine();
            switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);
                String ValorDaResposta = ((List<String>) alternativas).get(respostaInt);

                if (ValorDaResposta.equals(alternativaCorreta)) {
                    System.out.println("\nCom o teclado, ele conseguiu digitar o comando e abrir as grades!... ");
                    respostaCerta = true; 
                    contador5 = contador5 +1;
                    
                    System.out.println("\n---- 6º FASE - A Criatura ----");
            int contador6 = 0;
                                System.out.println("\n  Depois que as grades foram abertas, "+nome+" seguiu caminho em direção ao mercado para ajudar quem estava gritando, porém ele ouve "
                                        + "\nalgo rosnando, quando ele olha pra trás ele vê um urso totalmente modificado por conta da radiação, com a pele ensanguentada, com os"
                                        + "\ndentes mais afiados e com o dobro de tamanho. Ele sai correndo e o urso tambem vai correndo em direção a ele com um olhar assasino, "
                                        + "\n"+nome+" consegue pegar uma distância da criatura, pois parecia que ela estava com a perna machucada, assim percebe que só tem um jeito"
                                                + "\nde sair com vida...");
            String questao2 = "\n"+nome+ " percebe que o melhor jeito de sair vivo é: ";

            Collection<String> alternativas2 = new ArrayList<>();
            alternativas2.add("Pegar um Galho Fino no chão");
            alternativas2.add("Pegar a Arma de Fogo na mochila e atirar");
            alternativas2.add("Sair correndo");


                String alternativaCorreta2 = "Pegar a Arma de Fogo na mochila e atirar";

            boolean respostaCerta2 = false;

                do { 

                System.out.println(questao2);

                Collections.shuffle((List<String>) alternativas2);

                for (int i = 0; i < alternativas2.size(); i++) {
                    System.out.println(
                    "[" + i + "] " + ((List<String>)alternativas2).get(i)
                    );
                }

                System.out.println("DICA! Acho que um humano não corre mais que um urso...");
                String resposta2 = entrada.nextLine();
                switch (resposta2) {
                case "0":
                case "1":
                case "2":
                    int respostaInt2 = Integer.parseInt(resposta2);
                    String ValorDaResposta2 = ((List<String>) alternativas2).get(respostaInt2);

                    if (ValorDaResposta2.equals(alternativaCorreta2)) {
                                System.out.println("\nComo "+nome+" tinha anos de experiencia no exercito, ele acerta apenas um tiro no urso, na cabeça, derrubando imediatamente...");
                        respostaCerta2 = true; 
                        contador6 = contador6 +1;
                        
                            System.out.println("\n---- 7º FASE - Em Cativeiro ----");
                        int contador7 = 0;
                        
                                System.out.println("\n  Após matar a criatura, quando "+nome+" entra no mercado, vê uma mulher gritando porem ela não parecia correr nenhum perigo. "
                                                + "\nEle estranha mas mesmo assim vai até a moça verificar se está tudo bem, quando derrepende "+nome+" desmaia com uma pancada de "
                                                + "\nbarra de ferro na cabeça. Se passam horas e horas e assim que ele acorda, percebe que caiu em uma armadilha de saqueadores "
                                                + "\ne vê que está em uma cela de uma prisão com uma tranca tecnológica dentro de uma casa velha. "
                                                + "\n   Frio e com raiva, "+nome+" analisa a tranca da cela que ele se encontra e vê o melhor jeito de escapar de lá sem chamar atenção...");
                                
                String questao3 = "\nComo "+nome+" pode sair da cela sem chamar muita atenção dos saqueadores?";

                Collection<String> alternativas3 = new ArrayList<>();
                alternativas3.add("Gritar por Socorro");
                alternativas3.add("Quebrar a CPU da Tranca");
                alternativas3.add("Tentar entortar a Barra de Ferro da Cela");


                    String alternativaCorreta3 = "Quebrar a CPU da Tranca";

                boolean respostaCerta3 = false;

                    do { 

                    System.out.println(questao3);

                    Collections.shuffle((List<String>) alternativas3);

                    for (int i = 0; i < alternativas3.size(); i++) {
                        System.out.println(
                        "[" + i + "] " + ((List<String>)alternativas3).get(i)
                        );
                    }

                    System.out.println("Dica: Ele não tem super-força haha....");
                    String resposta3 = entrada.nextLine();
                    switch (resposta3) {
                    case "0":
                    case "1":
                    case "2":
                        int respostaInt3 = Integer.parseInt(resposta3);
                        String ValorDaResposta3 = ((List<String>) alternativas3).get(respostaInt3);

                        if (ValorDaResposta3.equals(alternativaCorreta3)) {
                                System.out.println("\n"+nome+" passa o pé entre as grades da cela e começa a chutar a tranca até quebra-lá.A cela abre imediatamente...");
                            respostaCerta3 = true; 
                            contador7 = contador7 +1;
                            
                            System.out.println("\n---- 8º FASE - Não Confie em Ninguém ----");
        int contador8 = 0;
        
                                System.out.println("\nApós sair da cela, ele percebe que estava em uma casa “simples” porém grande, ao olhar o relógio e o calendário, ele vê que "
                                        + "\nficou quase 24 horas desmaiado no cativeiro, desmaiado."+nome+" sobe as escadas,pois a cela ficava no porão da casa e ele percebe que tem"
                                        + "\n7 sobreviventes vivendo no local, e que provavelmente não tinham boas intenções com ele, já que podiam pegar recursos com a família em "
                                        + "\ntroca da vida dele."+nome+" olha pra fora da casa pra saber onde ela estava localizada e percebe que estava em uma fazenda, com "
                                        + "\nruas largas e lisas, em Óregon, além disso ele percebe que tem um pequeno avião lá fora, ele nem pensa duas vezes e já vai tentar"
                                        + "\nsair da casa e continuar seu trajeto até sua família, então o personagem passa por 5 das pessoas que estavam na casa escondido, assim "
                                        + "\nele consegue sair da casa porém perto do avião ele ve dois homens como se eles estivessem protegendo o avião e a casa de outros saqueadores,"
                                        + "\ncom isso ele tem que bolar um plano pra lutar com os dois saqueadores e entrar no avião...");
                                
        String questao4 = "\nEscolha a melhor opção para se livrar dos saqueadores, um que está na porta do avião e outro fumando um cigarro atrás do avião: ";

        Collection<String> alternativas4 = new ArrayList<>();
        alternativas4.add("Tentar conversar com os saqueadores amigavelmente");
        alternativas4.add("Correr até o avião");
        alternativas4.add("Ataca-los por tras um de cada vez, sem fazer muito barulho para não alarmar o outro");


            String alternativaCorreta4 = "Ataca-los por tras um de cada vez, sem fazer muito barulho para não alarmar o outro";

        boolean respostaCerta4 = false;

            do { 

            System.out.println(questao4);

            Collections.shuffle((List<String>) alternativas4);

            for (int i = 0; i < alternativas4.size(); i++) {
                System.out.println(
                "[" + i + "] " + ((List<String>)alternativas4).get(i)
                );
            }

            System.out.println("DICA! Como o nome da fase já diz, não confie em ninguém...");
            String resposta4 = entrada.nextLine();
            switch (resposta4) {
            case "0":
            case "1":
            case "2":
                int respostaInt4 = Integer.parseInt(resposta4);
                String ValorDaResposta4 = ((List<String>) alternativas4).get(respostaInt4);

                if (ValorDaResposta4.equals(alternativaCorreta4)) {
                    System.out.println("\n"+nome+" consegue desmaiar cada um dos saqueadores com um mata-leão, e pega uma AK-47 que estava com um deles");
                    respostaCerta4 = true; 
                    contador8 = contador8 +1;
                    
                    System.out.println("\n---- 9º FASE - O Avião ----");
                    
            int contador9 = 0;
                                System.out.println("\nApós conseguir entrar no avião, ele tem que resolver mais um desafio para conseguir ligar o sistema da aeronave e ligar os motores...");
            String questao5 = "\nPara ligar o sistema do avião você precisa descobrir qual a estrutura de uma CPU?";

            Collection<String> alternativas5 = new ArrayList<>();
            alternativas5.add("Barramentos, Mémoria, Entrada e Saída");
            alternativas5.add("Unidade de controle, Barramentos Interno, Resgistradores e Unidade lógica");
            alternativas5.add("Mémoria, Unidade Lógica, Registradores");


                String alternativaCorreta5 = "Unidade de controle, Barramentos Interno, Resgistradores e Unidade lógica";

            boolean respostaCerta5 = false;

                do { 

                System.out.println(questao5);

                Collections.shuffle((List<String>) alternativas5);

                for (int i = 0; i < alternativas5.size(); i++) {
                    System.out.println(
                    "[" + i + "] " + ((List<String>)alternativas5).get(i)
                    );
                }

                System.out.println("DICA! Tem 4 coisas um estrutura...");
                String resposta5 = entrada.nextLine();
                switch (resposta5) {
                case "0":
                case "1":
                case "2":
                    int respostaInt5 = Integer.parseInt(resposta2);
                    String ValorDaResposta5 = ((List<String>) alternativas5).get(respostaInt5);

                    if (ValorDaResposta5.equals(alternativaCorreta5)) {
                        System.out.println("\nEle consegue ligar o avião, e como ja tinha pilotado um no exercito parte em direção a Whasington para finalmente encontrar com a fámilia...");
                        respostaCerta5 = true; 
                        contador9 = contador9 +1;
                        
                        System.out.println("\n---- 10º FASE - Em fim, Paz... ----");
                        int contador10 = 0;
                
                                System.out.println("\n"+nome+" pousa o avião em um aeroporto abandonado perto de onde estava o banker onde seu pai e irmão estão, quando ele sai do avião "
                                        + "\nvê uma movimentação estranha um pouco distante dele porém percebe que perceberam o avião pousando e ja estavam indo na direção dele. Quando elas"
                                        + "\nestão chegando perto ele vê que são mais animais que sofreram mutações pela radiação, um rato com tamanho de um leão, com dentes afiados, pele queimada"
                                        + "\ne com a boca ensanguentada provavelmente de outras vítimas, e um lobo com a parte branca do olho vermelha, dentes afiados e com sangue igual o rato. "
                                        + "\nAs criaturas vão correndo em direção ao avião, como se estivessem a dias sem comer carne, entâo "+nome+" percebe que tem que pensar rápido no seu "
                                        + "\npróximo passo, porque isso poderia fazer com que ele perdesse a vida, momentos antes de ver sua fámilia... ");
                                
                String questao6 = "O único jeito de sair vivo do avião é: ";

                Collection<String> alternativas6 = new ArrayList<>();
                alternativas6.add("Não abrir as portas do avião e esperar as criaturas irem embora");
                alternativas6.add("Pegar a AK-47 e atirar nas duas criaturas");
                alternativas6.add("Deixar os itens pra trás pra sair correndo do avião mais rápido");


                    String alternativaCorreta6 = "Pegar a AK-47 e atirar nas duas criaturas";

                boolean respostaCerta6 = false;

                    do { 

                    System.out.println(questao6);

                    Collections.shuffle((List<String>) alternativas6);

                    for (int i = 0; i < alternativas6.size(); i++) {
                        System.out.println(
                        "[" + i + "] " + ((List<String>)alternativas6).get(i)
                        );
                    }

                    System.out.println("DICA! Essas criaturas não desistem fácil...");
                    String resposta6 = entrada.nextLine();
                    switch (resposta6) {
                    case "0":
                    case "1":
                    case "2":
                        int respostaInt6 = Integer.parseInt(resposta6);
                        String ValorDaResposta6 = ((List<String>) alternativas6).get(respostaInt6);

                        if (ValorDaResposta6.equals(alternativaCorreta6)) {
                                System.out.println("\nEntão ele pega o Fuzil, abre a porta do avião e aperta o gatilho com a arma apontada para as duas criaturas, conseguindo mata-las. Depois"
                                        + "\ndisso ele volta pro avião pega sua mochila e vai correndo em direção ao banker que estava seu irmão e pai. Como o banker era relacionado a ele, a "
                                        + "\na senha da porta era o número binário da data de seu nascimento, então ele abre o banker e finalmente reecontra seu pai e seu irmão");
                            respostaCerta6 = true; 
                            contador10 = contador10 +1;

                        } else{ 
                            System.out.println("\n"+nome+" morreu...");
                            contador10 = contador10 +1;
                        }


                         break;
                    default: 
                        System.out.println("\nOpção inválida");
                    }


                    } while (!respostaCerta6 && contador10 < 2);

                    } else{ 
                        System.out.println("\nO avião começa a pifar.");
                        contador9 = contador9 +1;
                    }


                     break;
                default: 
                    System.out.println("\nOpção inválida");
                }


                } while (!respostaCerta5 && contador9 < 2); 

                } else{ 
                    System.out.println("\nOs saqueadores pegam ele novamente e amarram e prendem em uma cela. ");
                    contador8 = contador8 +1;
                }


                 break;
            default: 
                System.out.println("Opção inválida");
            }

            } while (!respostaCerta4 && contador8 < 2);

                        } else{ 
                            System.out.println("\n"+nome+" chamou muita atenção e morreu!");
                            contador7 = contador7 +1;
                        }


                         break;
                    default: 
                        System.out.println("Opção inválida");
                    }


                    } while (!respostaCerta3 && contador7 < 2);

                    } else{ 
                        System.out.println("\n"+nome+" não conseguiu correr ou matar a criatura  e morreu!");
                        contador6 = contador6 +1;
                    }


                     break;
                default: 
                    System.out.println("Opção inválida");
                }


                } while (!respostaCerta2 && contador6 < 2); 

                } else{ 
                    System.out.println("\nEsse objeto não é o correto! Game over! ");
                    contador5 = contador5 +1;
                }


                 break;
            default: 
                System.out.println("Opção inválida");
            }

            } while (!respostaCerta && contador5 < 2);
            
                }else {
                    System.out.println("");
                }
        
                }else { 
			System.out.println("Isso não funcionou!");
		}
                        
                        
		}else { 
			System.out.println("Game over!!!");
		}
                
		}else { 
			System.out.println("Game over!!!");
	
		}
                
		}else { 
			System.out.println("Que pena que você irá sair sobrevivente, volte depois para viver essa aventura...");
		}
            
            
        } 
       
        }
        
    
