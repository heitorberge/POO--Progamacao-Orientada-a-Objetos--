package cursoemvideo.mortalemojikombat;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada = false;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1.getCategoria() == L2.getCategoria()) {
            if (L1 != L2) {
                this.setAprovada(true);
                this.desafiado = L1;
                this.desafiante = L2;
            }
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
    if (aprovada == true) {
        desafiado.apresentar();
        desafiante.apresentar();
        Random random = new Random();
        int vencedor = random.nextInt(3);
        System.out.println("======== Resultado da Luta ========");
        switch (vencedor) {
            case 0:
                System.out.println("Empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
            case 1:
                System.out.println(desafiado.getNome() + " Ganhou!");
                System.out.println(desafiante.getNome() + " Perdeu!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            case 2:
                System.out.println(desafiante.getNome() + " Ganhou!");
                System.out.println(desafiado.getNome() + " Perdeu!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
        }
        System.out.println("====================================");
    } else {
        System.out.println("Luta não pode Acontecer.");
    }
}
    }

