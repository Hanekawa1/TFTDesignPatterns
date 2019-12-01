
package teamfighttactics;

public class Formacao implements Composicao{
   
    private Campeao campeao1;
    private Campeao campeao2;

    public Formacao(Campeao campeao1, Campeao campeao2) {
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
    }

    @Override
    public String getComposicao() {
        return this.campeao1.getNome()+this.campeao2.getNome();
    }

    @Override
    public int getCusto() {
        return this.campeao1.getCusto()+this.campeao2.getCusto();
    }
    
}
