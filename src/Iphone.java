public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{


    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina sendo exibida");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Nova página adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo a musica");
    }
}
