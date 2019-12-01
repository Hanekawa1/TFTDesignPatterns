
package teamfighttactics;

public class Avatar implements Classe, Elemento{

    @Override
    public void descricao() {
        System.out.println("Avatares são desconhecidos.");
    }

    @Override
    public void efeito() {
        System.out.println("Avatares ganham os efeitos de todas as outras classes.\n");
    }
    
    @Override
    public void aprimoramento(){
        System.out.println("Avatares não contém elementos");
    }
    
}
