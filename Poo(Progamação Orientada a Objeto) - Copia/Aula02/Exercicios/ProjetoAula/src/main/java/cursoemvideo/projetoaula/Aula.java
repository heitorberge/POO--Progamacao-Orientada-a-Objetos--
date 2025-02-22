package cursoemvideo.projetoaula;
public class Aula {
    String tipo;
    String professor;
    int duracao;
    boolean Assistindo;
    void status() {
        System.out.println("Uma aula de: " + tipo + " do Professor " + professor + ".");
        System.out.println("Que vai durar " + duracao + " minutos.");
        if (Assistindo == true) {
            System.out.println("E Voce esta Assistindo a ela.");
        } else {
            System.out.println("E Voce nao esta Assistindo a ela.");
        }
    }
    void AssistirAula() {
        Assistindo = true;
    }
    void TerminarAula() {
        Assistindo = false;
    }    
}
