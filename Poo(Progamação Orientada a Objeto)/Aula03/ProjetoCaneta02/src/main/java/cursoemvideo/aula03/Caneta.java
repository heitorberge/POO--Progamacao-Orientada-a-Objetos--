package cursoemvideo.aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        if (cor != null) {
            System.out.println("Uma caneta " + this.cor + ".");
        }
        if (modelo != null) {
            System.out.println("Modelo da Caneta: " + this.modelo + ".");
        }
        if (carga != 0) {
                   System.out.println("Carga da Caneta: " + this.carga + ".");
        }
        if (ponta != 0) {
                   System.out.println("Ponta da Caneta: " + this.ponta);
        }
        if (tampada == true) {
            System.out.println("Essa Caneta Esta Tampada");
        } else {
            System.out.println("Essa Caneta Esta Destampada");
        }
    }
    public void rabiscar() {
        if (tampada) {
            System.out.println("Caneta esta tampada, impossivel rabiscar.");
        } else {
            System.out.println("Rabiscando...");
            carga -= 5;
            System.out.println("Carga restante: " + carga);
        }
    }
    public void tampar() {
        tampada = true;
        System.out.println("Caneta foi Tampada");
    }
     public void destampar() {
        tampada = false;
        System.out.println("Caneta foi Destampada");
    }
}