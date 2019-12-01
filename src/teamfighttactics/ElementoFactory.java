package teamfighttactics;

public class ElementoFactory {
    public Elemento fabricaElemento(String elemento){
        if(elemento.equalsIgnoreCase("Inferno")){
            return new Inferno();
        } else if(elemento.equalsIgnoreCase("Oceano")){
            return new Oceano();
        } else if(elemento.equalsIgnoreCase("Montanha")){
            return new Montanha();
        } else if(elemento.equalsIgnoreCase("Nuvem")){
            return new Nuvem();
        }
        
        return new Avatar();
    }
}
