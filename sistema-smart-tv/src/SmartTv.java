public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado=true;
    }
    
    public void deligar(){
        ligado=false;
    }
    public void almentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void almentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }
}
