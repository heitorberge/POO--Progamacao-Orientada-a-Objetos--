package cursoemvideo.projetocontabanco;
public class ContaBanco {
    private int numConta;
    private float saldo;
    private boolean status;
    private String dono;
    private String tipo;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            saldo = 50;
        } else if (t == "CP") {
            saldo = 150;
        }
    }
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("NAO POSSO FECHAR CONTA COM DINHEIRO");
        } else if (saldo < 0) {
            System.out.println("NAO POSSO FECHAR CONTA EM DEBITO");
        } else {
            status = false;
        }
    }
    public void depositar(int d) {
        if (status == true) {
            saldo += d;
        } else {
            System.out.println("NAO E POSSIVEL DEPOSITAR EM UMA CONTA FECHADA");
        }
    }
    public void sacar(int d) {
        if (status == true) {
            if (saldo > d) {
                saldo -= d;
            } else if (saldo < d) {
                System.out.println("NAO E POSSIVEL SACAR UM VALOR MAIOR QUE O SALDO");
            }
        } else if (status == false) {
            System.out.println("NAO E POSSIVEL SACAR EM UMA CONTA FECHADA");
        }
    }
    public void pagarMensal() {
        float v;
        if (status = true) {
            if (tipo == "CC") {
                v = 12;
            } else {
                v = 20;
            }
            if (saldo > v) {
                saldo -= v;
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        } else {
            System.out.println("NAO E POSSIVEL PAGAR MENSALIDADE EM UMA CONTA FECHADA");
        }
    }
}
