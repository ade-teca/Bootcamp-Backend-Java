
public class App {

    public static void main(String[] args) {
        Iphones iphone = new Iphones("preto", "Iphone 4");

        
        System.out.println(iphone.getCor());
        System.out.println(iphone.getModelo());
        
        iphone.ligar();
        iphone.selecionarMusica();
    }
}