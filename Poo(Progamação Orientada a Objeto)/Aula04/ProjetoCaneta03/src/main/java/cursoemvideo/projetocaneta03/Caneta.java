package cursoemvideo.projetocaneta03;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
     public void status() {
         System.out.println("SOBRE A CANETA:");
         System.out.println("Modelo: " + this.modelo);
         System.out.println("Ponta: " + this.ponta);
         System.out.println("Cor: " + this.cor);
         System.out.println("Tampada: " + this.tampada);

     }
}