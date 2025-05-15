package ED2.bancario;

/**
 * Representa uma conta poupança bancária.
 * Aplica 0.08% de juros ao dia.
 */
public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.0008; // 0.08% ao dia

    /**
     * Construtor da classe ContaPoupanca.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da conta poupança.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("Taxa de Juros: 0.08% ao dia");
    }

    /**
     * Aplica juros diários na conta poupança.
     * Taxa de 0.08% ao dia.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * TAXA_JUROS;
    }
} 