package cursoemvideo.mortalemojikombat;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //<editor-fold defaultstate="collapsed" desc="Getter e Setter">
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso<=120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
//</editor-fold>

    public Lutador(String no, String na, int id, float al,
            float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public void apresentar() {
        System.out.println("--------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente do(a) " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("E com " + this.getAltura() + "m de altura");
        System.out.println("E um Peso " + this.getCategoria());
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void status() {
        System.out.println("-----Status de " + this.getNome() + "-----");
        System.out.println("E um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    protected void ganharLuta() {
        this.setVitorias(this.vitorias + 1);
    }
    protected void perderLuta() {
        this.setDerrotas(this.derrotas + 1);
    }
    protected void empatarLuta() {
        this.setEmpates(this.empates + 1);
    }
    
}
