public class Usuario {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+smartTv.ligado);
        System.out.println("canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);
        
        smartTv.ligar();
        System.out.println("TV Ligada? "+smartTv.ligado);

        smartTv.deligar();
        System.out.println("TV Ligada? "+smartTv.ligado);

        smartTv.almentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        
        smartTv.diminuirVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.almentarCanal();
        System.out.println("canal atual: "+smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("canal atual: "+smartTv.canal);
        
        smartTv.mudarCanal(30);
        System.out.println("canal atual: "+smartTv.canal);
        


    }
}
