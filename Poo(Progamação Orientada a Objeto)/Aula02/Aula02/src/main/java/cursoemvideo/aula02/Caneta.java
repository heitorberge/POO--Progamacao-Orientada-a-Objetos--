package cursoemvideo.aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
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
    void  rabiscar() {
        if (tampada) {
            System.out.println("Caneta esta tampada, impossivel rabiscar.");
        } else if (carga == 0) {
            System.out.println("Caneta esta sem carga, impossivel rabiscar.");
        } else {
            System.out.println("Rabiscando...");
            carga -= 5;
            System.out.println("Carga restante: " + carga);
        }
    }
    void tampar() {
        tampada = true;
        System.out.println("Caneta foi Tampada");
    }
    void destampar() {
        tampada = false;
        System.out.println("Caneta foi Destampada");
    }
}
