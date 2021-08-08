package Jogos;

import java.util.Scanner;

public class JogoMain {

	public static void main(String[] args) {	        
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("----- LOJA DE JOGOS -----");
	        byte opcao = 0;
	        while (opcao != 1 && opcao != 2) {
	            System.out.println("Qual tipo de jogo você deseja incluir?"
	                    + "\n1) Jogo de cartas\n2) Jogo eletrônico");
	            opcao = entrada.nextByte();
	        }
	        entrada.nextLine();
	        
	        System.out.println("Informe o nome do jogo:");
	        String nomeJogo = entrada.nextLine();
	        System.out.println("Informe o preço do jogo (em R$):");
	        float precoJogo = entrada.nextFloat();
	        System.out.println("Informe a classificação etária:");
	        byte clasJogo = entrada.nextByte();
	        
	        Jogo jogo = criarJogo(entrada, nomeJogo, precoJogo, clasJogo, opcao);
	        System.out.println(jogo.getInfoJogo());
	        
	    }	    
	    private static Jogo criarJogo(Scanner entrada, String nome, float preco, byte clasEtaria, byte opcao){
	    	if(opcao==1) {
	    		System.out.println("Quantidade de jogadores: ");
	    		byte qtdJogadores =entrada.nextByte();
	    		JogoCartas jogoCartas = new JogoCartas(nome, preco, clasEtaria,qtdJogadores);	 
	    		return  jogoCartas;
	    	}else{
	    		System.out.println("Informe o tamanho do jogo em GB: ");
	    		float tamanhoGB=entrada.nextFloat();
	    		JogoEletronico jogoEletronico = new JogoEletronico(nome, preco,clasEtaria,tamanhoGB); 
	    		return jogoEletronico;
	    	} 
	    }
}
