
package teamfighttactics;

public class Formacao implements Composicao{
   
    private Campeao campeao1;
    private Campeao campeao2;
    private Campeao campeao3;
    private Campeao campeao4;
    private Campeao campeao5;

    public Formacao(Campeao campeao1, Campeao campeao2, Campeao campeao3, Campeao campeao4, Campeao campeao5) {
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
        this.campeao3 = campeao3;
        this.campeao4 = campeao4;
        this.campeao5 = campeao5;
    }

    @Override
    public void getCampeoesComposicao() {
        System.out.println("Composição: \n" 
                +"Campeão: " + this.campeao1.getNome() + "\n" +
                    "\tCusto: " + this.campeao1.getCusto() + "\n" +
                    "\tClasse : " + this.campeao1.getClasse().getNomeClasse() + "\n" +
                    "\tElemento: " + this.campeao1.getElemento().getNomeElemento() + "\n"
                            
                +"Campeão: " + this.campeao2.getNome() + "\n" +
                    "\tCusto: " + this.campeao2.getCusto() + "\n" +
                    "\tClasse : " + this.campeao2.getClasse().getNomeClasse() + "\n" +
                    "\tElemento: " + this.campeao2.getElemento().getNomeElemento() + "\n"
                            
                +"Campeão: " + this.campeao3.getNome() + "\n" +
                    "\tCusto: " + this.campeao3.getCusto() + "\n" +
                    "\tClasse : " + this.campeao3.getClasse().getNomeClasse() + "\n" +
                    "\tElemento: " + this.campeao3.getElemento().getNomeElemento() + "\n"
                            
                +"Campeão: " + this.campeao4.getNome() + "\n" +
                    "\tCusto: " + this.campeao4.getCusto() + "\n" +
                    "\tClasse : " + this.campeao4.getClasse().getNomeClasse() + "\n" +
                    "\tElemento: " + this.campeao4.getElemento().getNomeElemento() + "\n"
                            
                +"Campeão: " + this.campeao5.getNome() + "\n" +
                    "\tCusto: " + this.campeao5.getCusto() + "\n" +
                    "\tClasse : " + this.campeao5.getClasse().getNomeClasse() + "\n" +
                    "\tElemento: " + this.campeao5.getElemento().getNomeElemento() + "\n"
        );
    }

    @Override
    public void getCustoComposicao() {
        int custo = this.campeao1.getCusto()
                +this.campeao2.getCusto() 
                +this.campeao3.getCusto()
                +this.campeao4.getCusto()
                +this.campeao5.getCusto();
        System.out.println("Custo total da composição: " + custo);
    }
    
}
