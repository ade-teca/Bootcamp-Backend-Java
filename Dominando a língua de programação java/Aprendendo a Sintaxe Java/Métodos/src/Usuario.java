public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual? "+smartTv.canal);
        System.out.println("Volume atual? "+smartTv.volume);

        

        System.out.println("\n");

        System.out.println("Tv ligada? "+smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.ligar();
        smartTv.mudarCanal(13);
        
    }
}
