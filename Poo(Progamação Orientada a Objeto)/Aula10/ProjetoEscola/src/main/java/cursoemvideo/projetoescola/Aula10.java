package cursoemvideo.projetoescola;
public class Aula10 {
    public static void main(String[] args) {
        // Progama Principal
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p3.ReceberAum(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatr();
        
        p1.setSexo("M");
        p3.setSexo("M");
        p2.setSexo("F");
        p4.setSexo("F");
        
        p1.setIdade(30);
        p2.setIdade(18);
        p3.setIdade(40);
        p4.setIdade(29);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
