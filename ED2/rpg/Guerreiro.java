package ED2.rpg;

/**
 * Representa um guerreiro no RPG.
 * Possui ataque físico forte e reduz dano recebido pela metade.
 */
public class Guerreiro extends Personagem {
    private boolean habilidadeEspecialUsada;

    /**
     * Construtor da classe Guerreiro.
     * @param nome Nome do guerreiro
     */
    public Guerreiro(String nome) {
        super(nome);
        this.ataqueBase = 15; // Ataque base mais forte
        this.habilidadeEspecialUsada = false;
    }

    /**
     * Realiza um ataque físico forte.
     * @param inimigo Personagem que será atacado
     * @return Dano causado
     */
    @Override
    public int atacar(Personagem inimigo) {
        int dano = ataqueBase;
        if (habilidadeEspecialUsada) {
            dano *= 2;
            System.out.println(nome + " desfere um golpe duplo!");
        }
        inimigo.defender(dano);
        return dano;
    }

    /**
     * Defende-se de um ataque, reduzindo o dano pela metade.
     * @param dano Quantidade de dano a ser recebida
     */
    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp = Math.max(0, hp - danoReduzido);
        System.out.println(nome + " reduz o dano pela metade!");
    }

    /**
     * Usa a habilidade especial "Golpe Duplo".
     * O próximo ataque causará o dobro de dano.
     */
    @Override
    public void usarHabilidadeEspecial() {
        habilidadeEspecialUsada = true;
        System.out.println(nome + " prepara um Golpe Duplo!");
    }
} 