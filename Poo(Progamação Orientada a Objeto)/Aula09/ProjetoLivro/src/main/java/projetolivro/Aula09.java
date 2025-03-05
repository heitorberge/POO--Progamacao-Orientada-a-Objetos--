package projetolivro;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[5];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        p[2] = new Pessoa("Jose da Silva", 33, "M");
        p[3] = new Pessoa("Pedro Paulo", 44, "M");
        p[4] = new Pessoa("Maria Candido", 23, "F");
        
        l[0] = new Livro("Aprendendo Java", p[2], 300, p[0]);
        l[1] = new Livro("Poo para Iniciantes", p[3], 500, p[1]);
        l[2] = new Livro("java Avncado", p[4], 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].detalhes();
    }
}
