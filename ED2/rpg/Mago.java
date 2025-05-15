package ED2.rpg;

/**
 * Representa um mago no RPG.
 * Possui ataque mágico forte e defesa fraca.
 */
public class Mago extends Personagem {
    private static final int DANO_BOLA_FOGO = 30;

    /**
     * Construtor da classe Mago.
     * @param nome Nome do mago
     */
    public Mago(String nome) {
        super(nome);
        this.ataqueBase = 12;
        this.hp = 80; // Menos HP que outros personagens
    }

    /**
     * Realiza um ataque mágico.
     * @param inimigo Personagem que será atacado
     * @return Dano causado
     */
    @Override
    public int atacar(Personagem inimigo) {
        int dano = ataqueBase;
        inimigo.defender(dano);
        return dano;
    }

    /**
     * Defende-se de um ataque.
     * Mago tem defesa fraca.
     * @param dano Quantidade de dano a ser recebida
     */
    @Override
    public void defender(int dano) {
        hp = Math.max(0, hp - dano);
        System.out.println(nome + " recebe dano total!");
    }

    /**
     * Usa a habilidade especial "Bola de Fogo".
     * Causa dano em área.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança uma Bola de Fogo!");
        System.out.println("Dano em área: " + DANO_BOLA_FOGO);
    }
} 