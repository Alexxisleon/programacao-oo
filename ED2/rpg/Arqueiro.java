package ED2.rpg;

/**
 * Representa um arqueiro no RPG.
 * Possui ataque médio com chance de crítico.
 */
public class Arqueiro extends Personagem {
    private static final double CHANCE_CRITICO = 0.3; // 30%
    private static final double MULTIPLICADOR_CRITICO = 1.5;

    /**
     * Construtor da classe Arqueiro.
     * @param nome Nome do arqueiro
     */
    public Arqueiro(String nome) {
        super(nome);
        this.ataqueBase = 11;
    }

    /**
     * Realiza um ataque com arco.
     * Tem chance de acerto crítico.
     * @param inimigo Personagem que será atacado
     * @return Dano causado
     */
    @Override
    public int atacar(Personagem inimigo) {
        int dano = ataqueBase;
        
        if (Math.random() < CHANCE_CRITICO) {
            dano = (int)(dano * MULTIPLICADOR_CRITICO);
            System.out.println(nome + " acertou um tiro crítico!");
        }
        
        inimigo.defender(dano);
        return dano;
    }

    /**
     * Defende-se de um ataque.
     * @param dano Quantidade de dano a ser recebida
     */
    @Override
    public void defender(int dano) {
        hp = Math.max(0, hp - dano);
    }

    /**
     * Usa a habilidade especial "Chuva de Flechas".
     * Realiza 3 ataques consecutivos.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " inicia uma Chuva de Flechas!");
        System.out.println("Realizando 3 ataques consecutivos...");
    }
} 