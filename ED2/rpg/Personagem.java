package ED2.rpg;

/**
 * Classe base que representa um personagem do RPG.
 * Contém atributos e métodos comuns a todos os tipos de personagem.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem.
     * @param nome Nome do personagem
     */
    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100;
        this.ataqueBase = 10;
    }

    /**
     * Realiza um ataque em outro personagem.
     * @param inimigo Personagem que será atacado
     * @return Dano causado
     */
    public abstract int atacar(Personagem inimigo);

    /**
     * Defende-se de um ataque.
     * @param dano Quantidade de dano a ser recebida
     */
    public abstract void defender(int dano);

    /**
     * Usa uma habilidade especial.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println("\n=== Status de " + nome + " ===");
        System.out.println("HP: " + hp);
        System.out.println("Ataque Base: " + ataqueBase);
    }

    /**
     * Verifica se o personagem está vivo.
     * @return true se o personagem estiver vivo
     */
    public boolean estaVivo() {
        return hp > 0;
    }
} 