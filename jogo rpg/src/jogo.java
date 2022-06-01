import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
public class jogo {
	public static void main(String[]args) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Questão 5");
        int contador = 0;
        System.out.println("chegando na metade de Óregon, você ve alguém gritando dentro de um mercado, mas o mercado esta com as grades automáticas fechadas, Você avista em computador, porem o computador está sem um item excepcional de entrada de dados para que ele pudesse dar o comando para que as portas abrissem, quando Você olha pra trás vê vários objetos relacionados com computador para poder abrir as portas"); 
        String questao = "Você tem as seguintes opções para conectar no computador: ";

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

            System.out.println("Digite sua resposta: ");
            String resposta = entrada.nextLine();
            switch (resposta) {
            case "0":
            case "1":
            case "2":
                int respostaInt = Integer.parseInt(resposta);
                String ValorDaResposta = ((List<String>) alternativas).get(respostaInt);

                if (ValorDaResposta.equals(alternativaCorreta)) {
                    System.out.println("Você conseguiu achar a peça e abrir as grades! ");
                    respostaCerta = true; 
                    contador = contador +1;

                } else{ 
                    System.out.println("Este item não é o correto! Game over! ");
                    contador = contador +1;
                }


                 break;
            default: 
                System.out.println("Opção inválida");
            }


            } while (!respostaCerta && contador < 3); 
            
            System.out.println("Questão 6");
            int contador2 = 0;
            System.out.println("depois que as grades do mercado abrem, você vê uma criatura que era um urso totalmente modificado, com a boca cheia de sangue, garras maiores que o normal, dentes muito mais afiados e com uma boca de orelha a orelha, o urso vai rosnando e correndo em sua direção"); 
            String questao2 = "Você tem as seguintes opções para matar a criatura: ";

            Collection<String> alternativas2 = new ArrayList<>();
            alternativas2.add("Barra de ferro");
            alternativas2.add("Arma de fogo");
            alternativas2.add("Correr");


                String alternativaCorreta2 = "Arma de fogo";

            boolean respostaCerta2 = false;

                do { 

                System.out.println(questao2);

                Collections.shuffle((List<String>) alternativas2);

                for (int i = 0; i < alternativas2.size(); i++) {
                    System.out.println(
                    "[" + i + "] " + ((List<String>)alternativas2).get(i)
                    );
                }

                System.out.println("Digite sua resposta: ");
                String resposta2 = entrada.nextLine();
                switch (resposta2) {
                case "0":
                case "1":
                case "2":
                    int respostaInt2 = Integer.parseInt(resposta2);
                    String ValorDaResposta2 = ((List<String>) alternativas2).get(respostaInt2);

                    if (ValorDaResposta2.equals(alternativaCorreta2)) {
                        System.out.println("Você conseguiu matar a criatura! ");
                        respostaCerta2 = true; 
                        contador2 = contador2 +1;

                    } else{ 
                        System.out.println("Você não conseguiu correr ou matar a criatura  e morreu! Game over! ");
                        contador2 = contador2 +1;
                    }


                     break;
                default: 
                    System.out.println("Opção inválida");
                }


                } while (!respostaCerta2 && contador2 < 3); 
                
                int contador3 = 0;
                System.out.println("Após matar a criatura quando você entra no mercado, você vê uma mulher gritando e quando você vai ver o que houve com ela,  simplesmente desmaia com uma pancada na cabeça. Horas depois você acorda em uma cela de uma prisão  que usa uma tranca tecnológica"); 
                String questao3 = "Você possui as seguintes opções para abrir a tranca tecnologica: ";

                Collection<String> alternativas3 = new ArrayList<>();
                alternativas3.add("Gritar");
                alternativas3.add("Quebrar a CPU da Tranca");
                alternativas3.add("Tentar quebrar a parte de ferro da tranca");


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

                    System.out.println("Digite sua resposta: ");
                    String resposta3 = entrada.nextLine();
                    switch (resposta3) {
                    case "0":
                    case "1":
                    case "2":
                        int respostaInt3 = Integer.parseInt(resposta3);
                        String ValorDaResposta3 = ((List<String>) alternativas3).get(respostaInt3);

                        if (ValorDaResposta3.equals(alternativaCorreta3)) {
                            System.out.println("\"Você conseguiu destruir a parte principal da tranca e conseguiu abrir!!! ");
                            respostaCerta3 = true; 
                            contador3 = contador3 +1;

                        } else{ 
                            System.out.println("Você chamou muita atenção e morreu!!! Game over! ");
                            contador3 = contador3 +1;
                        }


                         break;
                    default: 
                        System.out.println("Opção inválida");
                    }


                    } while (!respostaCerta3 && contador3 < 3); 

            }

       
	}
    
	  


