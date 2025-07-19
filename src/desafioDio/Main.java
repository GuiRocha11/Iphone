package desafioDio;

public class Main {

	public static void main(String[] args) {
	
	Iphone meuIphone = new Iphone();
	
	meuIphone.tocar();
    meuIphone.selecionarMusica("SOLTO - Djonga");
    meuIphone.pausar();

    meuIphone.ligar("99999-9999");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    meuIphone.exibirPagina("https://www.apple.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();

	}

}
