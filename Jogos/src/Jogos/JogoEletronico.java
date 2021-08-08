package Jogos;

public class JogoEletronico extends Jogo{
	
	private float  tamanhoGB;
	
	public  JogoEletronico(String nome, float precoUnitario, int clasEtaria, float  tamanhoGB){
		super(nome,precoUnitario,clasEtaria);
		this.tamanhoGB=tamanhoGB;
	}
	
	@Override
	public String getInfoJogo() {
		return super.getInfoJogo() + "|" + "Tamanho do jogo GB: " + tamanhoGB;
	}
}
