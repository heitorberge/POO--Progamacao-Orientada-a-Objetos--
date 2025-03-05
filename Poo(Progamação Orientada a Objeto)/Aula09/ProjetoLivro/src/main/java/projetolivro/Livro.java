package projetolivro;
public class Livro implements Publicacao {
    private String título;
    private Pessoa autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String título, Pessoa autor, int totPaginas, Pessoa leitor) {
        this.título = título;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            if (p < 1) {
                System.out.println("Nao posso folhear ate uma pagina Inexistente");
            }
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (totPaginas == pagAtual) {
            System.out.println("Impossivel Avancar, voce esta na ultima pagina");
        } else {
            this.setPagAtual(pagAtual + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (1 == pagAtual) {
            System.out.println("Impossivel Voltar, voce esta na primeira pagina");
        } else {
            this.setPagAtual(pagAtual - 1);
        }
    }

    public void detalhes() {
        System.out.println("------" + this.getTítulo() + "------");
        System.out.println("Autor: " + this.autor.getNome());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("Esta Aberto? " + this.getAberto());
        System.out.println("Pagina Atual: " + this.getPagAtual());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("---------------------------");
    }
    
    
}
