package Elemento;

public class Nuvem implements Elemento{
    private String nomeElemento = "Nuvem";
    
    @Override
    public void aprimoramento(){
        System.out.println(
                "Elemento: Nuvem[vento]\n"
               +"Aprimoramento: Concede chance de esquiva de ataques.\n");
    }
    
    @Override
    public String getNomeElemento(){
        return this.nomeElemento;
    }
}
