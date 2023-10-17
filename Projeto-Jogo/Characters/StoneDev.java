package Characters;

import java.util.Random;

public class StoneDev extends Creatures {

    private Random rand;

    public StoneDev() {
        setNome(CreaturesName.StoneDev);
        setElemento(CreaturesElements.Terra);
        setPoder(rand.nextInt(21) + 10);
        setAtaque(rand.nextInt(11) + 5);
        setDefesa(rand.nextInt(11) + 5);
        setVelocidade(rand.nextInt(10) + 1);
        setPontosDeVida(rand.nextInt(201) + 200);
        setTotalVidaInicial(getPontosDeVida());
    }

    @Override
    public double fatorDanoCriaturas(Creatures criaturaAtaquente, Creatures criaturaDefensora) {
        CreaturesElements elementoAtacante = criaturaAtaquente.getElemento();
        CreaturesElements elementoDefensor = criaturaDefensora.getElemento();

        double fatorDano = 0;

        if (elementoAtacante == CreaturesElements.Terra) {
            if (elementoDefensor == CreaturesElements.Ar) {
                fatorDano = 1.0;
            } else if (elementoDefensor == CreaturesElements.Agua) {
                fatorDano = 2.0;
            } else if (elementoDefensor == CreaturesElements.Fogo) {
                fatorDano = 1.0;
            } else if (elementoDefensor == CreaturesElements.Terra) {
                fatorDano = 0.5;
            }
        }
        return (double) (criaturaAtaquente.getPoder() * criaturaAtaquente.getAtaque()) / criaturaDefensora.getDefesa() * fatorDano;
    }

    
    @Override
    public void ataqueElemental(Creatures criaturaAtaquente, Creatures criaturaDefensora) {

        double fatorAtaque = fatorDanoCriaturas(criaturaAtaquente, criaturaDefensora);

        System.out.println(criaturaAtaquente.getNome() + " lançou um ataque elemental");
        System.out.println();

        defenderDano(criaturaAtaquente, criaturaDefensora, fatorAtaque);
        if (criaturaDefensora.getPontosDeVida() <= 0) {
            System.out.println("Pontos de vida restante " + criaturaDefensora.getNome() + " : 0");
        } else {
            System.out.println("Pontos de vida restante " + criaturaDefensora.getNome() + ": " + criaturaDefensora.getPontosDeVida());
        }

    }

}
