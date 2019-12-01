package Classe;

public class Patrulheiro implements Classe{
    private String nomeClasse = "Patrulheiro"; 
    
    @Override
    public void descricao() {
        System.out.println("Classe: Patrulheiro\n"
                + "Patrulheiros atacam de longe com armas ou arcos.");
    }

    @Override
    public void efeito() {
        System.out.println("Patrulheiros ganham, de tempos em tempos, uma chance de receber um surto de Velocidade de Ataque.\n");
    }
    
    @Override
    public String getNomeClasse(){
        return this.nomeClasse;
    }
}
