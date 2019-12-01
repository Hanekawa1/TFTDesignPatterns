package Elemento;

public class Oceano implements Elemento{
    public String nomeElemento = "Oceano";
    
    @Override
    public void aprimoramento(){
        System.out.println(
            "Elemento: Oceano[água]\n"
           +"Aprimoramento: Concede regeneração de mana extra.\n");
    }
    
    @Override
    public String getNomeElemento(){
        return this.nomeElemento;
    }
}
