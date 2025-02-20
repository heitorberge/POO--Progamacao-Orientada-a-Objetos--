package cursoemvideo.aula03;
public class Aula03 {
    public static void main(String[] args) {
        System.out.println("_____________________________________");
        System.out.println("Caneta Numero 1");
        System.out.println("-------------------------------------");
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        System.out.println("_____________________________________");
    }
}