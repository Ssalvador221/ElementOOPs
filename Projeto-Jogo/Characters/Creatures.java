
package Characters;
import java.util.Random;

public abstract class  Creatures {
    private final int poder; 
    private final int ataque;
    private final int defesa;
    private final int velocidade;
    private final int pontosDeVida;
    private int totalVida;

    
    
    public Creatures() {
        this.poder = getRandomValue(10, 30);
        this.ataque = getRandomValue(5, 15);
        this.defesa = getRandomValue(5, 15);
        this.velocidade = getRandomValue(1, 10);
        this.totalVida = getRandomValue(200, 400);
        this.pontosDeVida = totalVida;

    }


    public static int getRandomValue(int valorMax, int valorMin){
        Random rand = new Random();
        return rand.nextInt(valorMax - valorMin + 1) + valorMin;
    }

    
    public int getPoder() {
        return poder;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void vidaPlayer() {
        this.totalVida = this.pontosDeVida;
    }

    
    public int attackPhysical(Creatures creatures){
        return this.getPoder() * this.getAtaque() / creatures.getDefesa();
    }

    public void damage(int dano){
        this.totalVida -= dano;
    }

    public abstract int elementalDamage(Creatures creatures);

    public abstract String getEspeciePlayer();

    
}
