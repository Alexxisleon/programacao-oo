package ED2.bancario;

/**
 * Representa uma conta corrente bancária.
 * Aplica 0.1% de juros ao dia.
 */
public class ContaCorrente extends Conta {
    private static final double TAXA_JUROS = 0.001; // 0.1% ao dia

    /**
     * Construtor da classe ContaCorrente.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da conta corrente.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("Taxa de Juros: 0.1% ao dia");
    }

    /**
     * Aplica juros diários na conta corrente.
     * Taxa de 0.1% ao dia.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * TAXA_JUROS;
    }
} 