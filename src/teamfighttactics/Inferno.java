package teamfighttactics;

public class Inferno implements Elemento {
    private String nomeElemento = "Inferno";
    
    @Override
    public void aprimoramento(){
        System.out.println(
                "Elemento: Inferno[fogo]\n"
               +"Aprimoramento: Concede dano extra.\n");
    }
    
    @Override
    public String getNomeElemento(){
        return this.nomeElemento;
    }
}
