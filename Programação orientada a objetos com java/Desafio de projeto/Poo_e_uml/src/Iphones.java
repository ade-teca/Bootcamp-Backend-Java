
public class Iphones implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        
        // Implementação para tocar música
        System.out.println("tocando");
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando a música "+musica);
    }

    @Override
    public void ligar(String numero){
    
        // Implementação para ligar para um número
        System.out.println("ligando para: "+numero);
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
        System.out.println("iniciando correio de voz..");
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na internet
        System.out.println("exibindo a página "+url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página no navegador
        System.out.println("atualizando a pagina");
    }
}
