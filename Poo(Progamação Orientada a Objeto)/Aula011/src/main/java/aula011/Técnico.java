package aula011;
public class Técnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println("Praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
