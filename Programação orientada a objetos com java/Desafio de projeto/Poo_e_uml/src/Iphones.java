import java.util.Scanner;

public class Iphones implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    Scanner scanner = new Scanner(System.in);

    private String cor;
    private String modelo;

    public Iphones(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    // getters e setters para os atributos cor e modelo
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void tocar() {
        
        // Implementação para tocar música
        System.out.println("tocando música");
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("pesquisa e da enter para selecionar a musica:");
    try {
        String musica = scanner.nextLine();


        checkMusic(musica);
    }
    catch (Exception e) {
        System.out.println("Houve um problema "+ e);

    }
        
    }

    static void checkMusic(String musica) throws NoMusicSelectedException{
        if (musica == null || musica.length()==0) {
            throw new NoMusicSelectedException("\nNenhuma musica foi selecionada");
        }
        else{
            System.out.println("A música "+musica+" foi selecionada.");
        }
        
    }

    @Override
    public void ligar(){
        System.out.println("Pesquisa e prima enter para ligar ao contato:\n");
        try {
            String contato = scanner.nextLine();
    
            checkContato(contato);
        }
        catch (Exception e) {
            System.out.println("Houve um problema "+ e);
    
        }
    
    }

    static void checkContato(String contato) throws InvalidPhoneNumberException{
        if (contato == null || contato.length()==0) {
            throw new InvalidPhoneNumberException("\nNenhuma musica foi selecionada");
        }
        else{
            
        // Implementação para ligar para um número
        System.out.println("ligando para: "+contato);
        }
        
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
        System.out.println("atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
        System.out.println("iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        // Implementação para exibir uma página na internet
        System.out.println("exibindo a página ");
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
