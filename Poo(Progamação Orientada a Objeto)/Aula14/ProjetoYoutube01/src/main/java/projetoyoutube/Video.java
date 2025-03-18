package projetoyoutube;
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(curtidas++);
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(0);
        this.setCurtidas(0);
        this.setViews(0);
    }
    
    public void Status() {
        System.out.println(this.getTitulo());
        System.out.println("Avaliacao: " + this.getAvaliacao());
        System.out.println("Views: " + this.getViews());
        System.out.println("Curtidas: " + this.getCurtidas());
        if (reproduzindo == true) {
            System.out.println("Esta Reproduzindo");
        } else {
            System.out.println("Nao Esta Reproduzindo");
        }
        System.out.println("----------------------------------");
    }
}