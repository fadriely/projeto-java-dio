public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
                                             //nem todos os métodos precisam dar retorno
    public void mudarCanal (int novoCanal){ //alguns métodos terão parâmetros e esses métodos podem manipular as variáveis
        canal = novoCanal;                  // ou as ccaracterísticas do objeto principal "SmartTv"
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    //volume = volume +1
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("diminuindo o volume para: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}

