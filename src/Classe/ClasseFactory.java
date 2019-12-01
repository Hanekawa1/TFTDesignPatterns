
package Classe;

public class ClasseFactory {
    
    public Classe criarClasse(String classe){
        if(classe.equalsIgnoreCase("Assasino")){
            return new Assasino();
        }else if(classe.equalsIgnoreCase("Berserker")){
            return new Berserker();
        }else if(classe.equalsIgnoreCase("Patrulheiro")){
            return new Patrulheiro();
        }
        return new Avatar();
    }

}
