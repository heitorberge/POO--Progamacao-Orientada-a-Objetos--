package cursoemvideo.projetoaula;
public class ProjetoAula {
    public static void main(String[] args) {
        Aula A1 = new Aula();
        A1.AssistirAula();
        A1.duracao = 15;
        A1.professor = "Gustavo.g";
        A1.tipo = "Poo, Progamacao Orientada a Objetos";
        A1.status();
    }
}
