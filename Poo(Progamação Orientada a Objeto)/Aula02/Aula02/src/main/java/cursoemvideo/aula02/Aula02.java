package cursoemvideo.aula02;
public class Aula02 {
    public static void main(String[] args) {
        System.out.println("_____________________________________");
        System.out.println("Caneta Numero 1");
        System.out.println("-------------------------------------");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        System.out.println("_____________________________________");
        System.out.println("Caneta Numero 2");
        System.out.println("-------------------------------------");
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c1.status();
        System.out.println("_____________________________________");
    }
}