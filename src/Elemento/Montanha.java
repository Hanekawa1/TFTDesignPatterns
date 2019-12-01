package Elemento;

public class Montanha implements Elemento {
    private String nomeElemento = "Montanha";
    
    @Override
    public void aprimoramento(){
        System.out.println(
                "Elemento: Montanha[terra]\n"
               +"Aprimoramento: Concede velocidade de ataque extra.\n");
    }
    
    @Override
    public String getNomeElemento(){
        return this.nomeElemento;
    }
}
