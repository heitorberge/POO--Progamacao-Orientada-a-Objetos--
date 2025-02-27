package cursoemvideo.projetocontrole;
import java.util.Random;
public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private int canal;
    private boolean ligado;
    private boolean tocando;
    private Random random = new Random();
    
    // Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU------");
        System.out.println("Esta Ligado? " + this.ligado );
        System.out.println("Esta Tocando? " + this.tocando);
        System.out.print("Volume:" + this.volume + " ");
        for (int i = 0;i <= this.volume;i+=10) {
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("Canal de Tv: " + this.canal);
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.ligado == true) {
            this.setVolume(this.volume + 5);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado == false) {
            this.setVolume(this.volume - 5);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.volume > 0) {
            this.setVolume(0);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado && this.volume == 0) {
            this.setVolume(50);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false) {
            this.setTocando(true);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }    

    @Override
    public void trocarCanal() {
        if (this.getLigado()) {
            canal = random.nextInt(100);
        } else {
            System.out.println("POR FAVOR LIGUE A TV ANTES DE FAZER ALGO"); 
        }
    }
}
