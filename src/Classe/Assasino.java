package Classe;

public class Assasino implements Classe{
    private String nomeClasse = "Assassino"; 
    
    @Override
    public void descricao() {
        System.out.println("Classe: Assasino\n"
                + "Assassinos se esgueiram pela arena no início do combate, colocando-se na posição oposta de onde começaram.");
    }
    
    @Override
    public void efeito() {
        System.out.println("Assassinos ganham chance de Acerto Crítico e mais dano de Acerto Crítico.\n");
    }
    
    @Override
    public String getNomeClasse(){
        return this.nomeClasse;
    }

}
