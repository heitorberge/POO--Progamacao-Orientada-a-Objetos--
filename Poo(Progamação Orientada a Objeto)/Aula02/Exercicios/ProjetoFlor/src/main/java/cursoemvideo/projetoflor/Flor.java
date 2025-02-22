package cursoemvideo.projetoflor;
public class Flor {
    String cor;
    String tipo;
    void status() {
        if (cor != null) {
            System.out.println("A cor da flor e " + cor);
        }
        if (tipo != null) {
            System.out.println("O tipo da flor e Um(a) " + tipo);
        }
    }
    void cheirarflor() {
        System.out.println("Cheirando Flor");
    }
}
