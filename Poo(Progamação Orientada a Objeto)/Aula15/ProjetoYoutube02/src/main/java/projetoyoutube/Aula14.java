package projetoyoutube;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("Aula 10 de Html5");

        Visualisador pv[] = new Visualisador[2];
        pv[0] = new Visualisador("Jubileu", 22, "M", "juba");
        pv[1] = new Visualisador("Creuza", 12, "F", "creuzita");

        Visualização visu = new Visualização(pv[0], v[2]); // Jubileu assiste Html5
        visu.avaliar();
        Visualização visu2 = new Visualização(pv[0], v[1]); // Jubileu assiste PHP
        visu.avaliar(35.5f);
        Visualização visu3 = new Visualização(pv[1], v[2]); // Creuza assiste Html5
        visu.avaliar(5);
        Visualização visu4 = new Visualização(pv[1], v[0]); // Creuza assiste Poo
        visu.avaliar();
        Visualização visu5 = new Visualização(pv[0], v[0]); // Jubileu assiste Poo
        visu.avaliar(10);

        v[0].Status();
        v[1].Status();
        v[2].Status();
        pv[0].Status();
        pv[1].Status();
        visu.Status();
        visu2.Status();
        visu3.Status();
        visu4.Status();
        visu5.Status();
    }
}