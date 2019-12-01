
package teamfighttactics;

public class Vigia implements Classe{

    @Override
    public void descricao() {
        System.out.println("Classe: Vigia"
                + "Vigias são feitos para aguentar grande quantidade de dano");
    }

    @Override
    public void efeito() {
        System.out.println("Vigias ganham % de Armadura e Resistência Mágica.");
    }
    
}
