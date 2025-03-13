package projetoanimal;
public class Canguru extends Mamifero {
    
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
    public void usarBolsa() {
        System.out.println("Usando Bolsa");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
