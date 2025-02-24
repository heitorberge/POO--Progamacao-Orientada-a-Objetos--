package cursoemvideo.projetocontabanco;
public class Aula05 {
    public static void main(String[] args) {
        // CRIE OBJETOS AQUI!
        ContaBanco p1 = new ContaBanco("Jubileu");
        p1.setNumConta(1111);
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco("Creuza");
        p2.setNumConta(2222);
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
