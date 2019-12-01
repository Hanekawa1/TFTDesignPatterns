package teamfighttactics;

public class Campeao implements Composicao{
    private String nome;
    private int custo;
    private Classe classe;
    private Elemento elemento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }     
    
    public void dados(){
        System.out.println
        ("Nome do campeão: " + this.getNome() + "\n"
        +"Custo do campeão: " + this.getCusto() + "\n");
    }
    
    public void exibeStatus(){
        this.dados();
        this.getClasse().descricao();
        this.getClasse().efeito();
        this.getElemento().aprimoramento();
    }
    
    @Override
    public void getCampeoesComposicao(){
        System.out.println("Composição: " + this.getNome());
    }
    
    @Override
    public void getCustoComposicao(){
        System.out.println("Custo: " + this.getCusto());
    }
    
}
