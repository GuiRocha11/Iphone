package desafioDio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música: " + musica + " selecionada");
		
	}

	
}
