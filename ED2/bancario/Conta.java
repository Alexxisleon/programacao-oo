package ED2.bancario;

/**
 * Classe base que representa uma conta bancária.
 * Contém atributos e métodos comuns a todos os tipos de conta.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da classe Conta.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado
     * @return true se o depósito foi realizado com sucesso
     */
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    /**
     * Realiza um saque na conta.
     * @param valor Valor a ser sacado
     * @return true se o saque foi realizado com sucesso
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor para outra conta.
     * @param destino Conta que receberá o valor
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada com sucesso
     */
    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            return destino.depositar(valor);
        }
        return false;
    }

    /**
     * Retorna o saldo atual da conta.
     * @return Saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta.
     * Deve ser sobrescrito pelas subclasses.
     */
    public abstract void imprimirExtrato();

    /**
     * Aplica juros diários na conta.
     * Deve ser sobrescrito pelas subclasses.
     */
    public abstract void aplicarJurosDiarios();
} 