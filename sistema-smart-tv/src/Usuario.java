public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();


        smartTv.mudarCanal(14);
        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV ligada : " + smartTv.ligada);
    }
}
