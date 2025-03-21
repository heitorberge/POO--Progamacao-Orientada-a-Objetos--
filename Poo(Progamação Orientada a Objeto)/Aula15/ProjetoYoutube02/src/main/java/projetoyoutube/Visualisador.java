package projetoyoutube;
public class Visualisador extends Pessoa {
    private String login;
    private int totAssistido;

    public Visualisador(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    
    public void Status() {
        System.out.println("Visualizador " + super.getNome());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Total de videos Assistidos: " + this.getTotAssistido());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Experiencia: " + this.getExperiencia());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("----------------------------------");
    }
    
    
}
