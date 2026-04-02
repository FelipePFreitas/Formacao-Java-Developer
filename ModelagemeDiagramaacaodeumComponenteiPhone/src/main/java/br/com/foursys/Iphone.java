package br.com.foursys;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo Correio");
    }

    @Override
    public void exibirPagina(String url) {

        System.out.println("Entrando na pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando");

    }

    @Override
    public void tocar() {
        System.out.println("Play musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pause musica");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Nome da musica: " + musica);

    }
}