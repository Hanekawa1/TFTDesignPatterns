package teamfighttactics;

public class Vigia implements Classe{
    private String nomeClasse = "Vigia"; 
    
    @Override
    public void descricao() {
        System.out.println("Classe: Vigia\n"
                + "Vigias são feitos para aguentar grande quantidade de dano");
    }

    @Override
    public void efeito() {
        System.out.println("Vigias ganham % de Armadura e Resistência Mágica.");
    }
    
    @Override
    public String getNomeClasse(){
        return this.nomeClasse;
    }
}
