package Characters;

import java.util.Random;

public class BreezeHacker extends Creatures{

    private Random rand;

    public BreezeHacker(){
        setNome(CreaturesName.BreezeHacker);
        setElemento(CreaturesElements.Ar);
        setPoder(rand.nextInt(21) + 10);
        setAtaque(rand.nextInt(11) + 5);
        setDefesa(rand.nextInt(11) + 5);
        setVelocidade(rand.nextInt(10) + 1);
        setPontosDeVida(rand.nextInt(201) + 200);
        setTotalVidaInicial(getPontosDeVida());
    }


    @Override
	public double fatorDanoCriaturas(Creatures criaturaAtacante, Creatures criaturaDefensora) {
        CreaturesElements elementoAtacante = criaturaAtacante.getElemento();
        CreaturesElements elementoDefensor = criaturaDefensora.getElemento();
        
        double fatorDano = 0;

        if(elementoAtacante == CreaturesElements.Ar){
            if(elementoDefensor == CreaturesElements.Ar){
                fatorDano = 0.5;
            }else if(elementoDefensor == CreaturesElements.Agua){
                fatorDano = 1.0;
            }else if(elementoDefensor == CreaturesElements.Fogo){
                fatorDano = 1.0;
            }else if(elementoDefensor == CreaturesElements.Terra){
                fatorDano = 2.0;
            }
        }  

        return criaturaAtacante.getPoder() * criaturaAtacante.getAtaque() / criaturaDefensora.getDefesa() * fatorDano;
    }


    @Override
    public void ataqueElemental(Creatures criaturaAtacante, Creatures criaturaDefensora){

        double fatorAtaque = fatorDanoCriaturas(criaturaAtacante, criaturaDefensora);

        System.out.println(criaturaAtacante.getNome() + " lançou um ataque elemental");
        System.out.println();

        defenderDano(criaturaAtacante, criaturaDefensora, fatorAtaque);
        if(criaturaDefensora.getPontosDeVida() <= 0 ){
            System.out.println("Pontos de vida restante %d" + criaturaDefensora.getNome() + " : 0");
        }else{
            System.out.println("Pontos de vida restante %d" + criaturaDefensora.getNome() + ": " + criaturaDefensora.getPontosDeVida());
        }

    }

}
