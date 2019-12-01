
package teamfighttactics;

public class Patrulheiro implements Classe{

    @Override
    public void descricao() {
        System.out.println("Patrulheiros atacam de longe com armas ou arcos.");
    }

    @Override
    public void efeito() {
        System.out.println("Patrulheiros ganham, de tempos em tempos, uma chance de receber um surto de Velocidade de Ataque.\n");
    }
    
}
