package projetoyoutube;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("Aula 5 de Html5");
        
        Visualisador pv[] = new Visualisador[2];
        pv[0] = new Visualisador("Jubileu", 22, "M", "juba");
        pv[1] = new Visualisador("Creuza", 12, "F", "creuzita");
        
        v[0].Status();
        v[1].Status();
        v[2].Status();
        pv[0].Status();
        pv[1].Status();
    }
}