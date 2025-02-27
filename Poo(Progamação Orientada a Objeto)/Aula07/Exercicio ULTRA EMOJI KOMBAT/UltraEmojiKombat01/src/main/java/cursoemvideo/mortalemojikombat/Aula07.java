package cursoemvideo.mortalemojikombat;
public class Aula07 {
    public static void main(String[] args) {
        Lutador L1 = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3, 1);
        Lutador L2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador L3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador L4 = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        Lutador L5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 113.3f, 5, 4, 3);
        Lutador L6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        L1.apresentar();
        L2.apresentar();
        L3.apresentar();
        L4.apresentar();
        L5.apresentar();
        L6.apresentar();
    }
}
