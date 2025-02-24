package cursoemvideo.projetocontabanco;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected float saldo;
    private boolean status;
    private String dono;
    private String tipo;
    //Métodos
    public ContaBanco(String D) {
        this.setSaldo(0);
        this.setStatus(false);
        this.setDono(D);
    }

    //<editor-fold defaultstate="collapsed" desc="Getter e Setter">
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
//</editor-fold>
    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("SOBRE A CONTA DO BANCO");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " +  this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            saldo += 50;
        } else if (t == "CP") {
            saldo += 150;
        }
        System.out.println("Conta de " + this.getDono() + " aberta com Sucesso!");
    }
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("NAO POSSO FECHAR CONTA COM DINHEIRO");
        } else if (saldo < 0) {
            System.out.println("NAO POSSO FECHAR CONTA EM DEBITO");
        } else {
            status = false;
            System.out.println("Conta fechada com Sucesso!");
        }
    }
    public void depositar(float d) {
        if (status == true) {
            saldo += d;
            System.out.println("Deposito realizado com sucesso na Conta de " + this.getDono() + "!");
        } else {
            System.out.println("NAO E POSSIVEL DEPOSITAR EM UMA CONTA FECHADA");
        }
    }
    public void sacar(float d) {
        if (status == true) {
            if (saldo >= d) {
                saldo -= d;
                System.out.println("Saque realizado na conta de " + this.getDono() + "!");
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
            if (saldo >= v) {
                saldo -= v;
                System.out.println("Mensalidade Paga com sucesso por " + this.getDono() + "!");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        } else {
            System.out.println("NAO E POSSIVEL PAGAR MENSALIDADE EM UMA CONTA FECHADA");
        }
    }
}
