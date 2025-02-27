package cursoemvideo.projetocontrole;
public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.trocarCanal();
        c.abrirMenu();
        c.fecharMenu();
    }
}
