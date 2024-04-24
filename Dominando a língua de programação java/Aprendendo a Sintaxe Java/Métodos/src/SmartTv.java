public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
        System.out.println("aumentando o volume para: "+volume);
    }

    public void diminuirVolume(){
        volume -= 1;
        System.out.println("diminuindo o volume para: "+volume);
    }

    public void mudarCanal(int n){
        canal = n;
        System.out.println("mudando o nanal para "+canal);
    }
}