package projetoyoutube;
public class Visualização {
    private Visualisador espectador;
    private Video filme;

    public Visualização(Visualisador espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Visualisador getEspectador() {
        return espectador;
    }

    public void setEspectador(Visualisador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar() {
        this.filme.setAvaliacao( 1);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 1;
        } else if (porc <= 50) {
            tot = 4;
        } else if (porc <= 90) {
            tot = 7;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public void Status() {
        System.out.println("Visualizacao:");
        System.out.println("Espectador: " + espectador.getNome());
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("----------------------------------");
    }
    
    public void like() {
       this.filme.setCurtidas(this.filme.getCurtidas() + 1);
    }
}
