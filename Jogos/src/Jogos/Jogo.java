package Jogos;

public class Jogo{
	
	protected String nome;
	protected float precoUnitario;
	protected int clasEtaria;
	
	protected Jogo(String nome, float precoUnitario, int clasEtaria){
		this.nome=nome;
		this.precoUnitario=precoUnitario;
		this.clasEtaria=clasEtaria;
	}

	public String getInfoJogo(){
		return  "Nome: " + nome + "|" + "Pe�o:" + precoUnitario + "|" + "Classifica��o: " + clasEtaria;
	}

}
