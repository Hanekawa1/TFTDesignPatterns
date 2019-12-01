package teamfighttactics;

public class Berserker implements Classe{
    private String nomeClasse = "Berserker"; 
    
    @Override
    public void descricao() {
        System.out.println("Classe: Berseker\n"
                + "Berserkers no início do combate, saltam na primeira unidade a sua frente.");
    }

    @Override
    public void efeito() {
        System.out.println("Berserkers faz com que seus ataques tenham a chance de causar dano em cone atrás do alvo.\n");
    }
    
    @Override
    public String getNomeClasse(){
        return this.nomeClasse;
    }
    
}
