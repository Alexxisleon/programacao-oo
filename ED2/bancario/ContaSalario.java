package ED2.bancario;

/**
 * Representa uma conta salário bancária.
 * Não aplica juros.
 */
public class ContaSalario extends Conta {

    /**
     * Construtor da classe ContaSalario.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da conta salário.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Salário ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("Taxa de Juros: Não aplicável");
    }

    /**
     * Aplica juros diários na conta salário.
     * Conta salário não recebe juros.
     */
    @Override
    public void aplicarJurosDiarios() {
        // Conta salário não recebe juros
    }
} 