package teamfighttactics;

public class TeamFightTactics {

    public static void main(String[] args) {
        
        /*Teste da factory de elementos
        ElementoFactory elem = new ElementoFactory(); 
        Elemento e = elem.fabricaElemento("4234");
        e.aprimoramento();
  
        Teste da Factory de Classe
        ClasseFactory clas = new ClasseFactory(); 
        Classe c = clas.criarClasse("Assassino");
        c.descricao();
        c.efeito();
        */
    
        //Teste do Builder
        Campeao varus = new CampeaoBuilder()
                        .comNome("Varus")
                        .comCusto(2)
                        .deClasse("Patrulheiro")
                        .comElemento("Inferno")
                        .build();
        varus.exibeStatus();
        
        Campeao nautilus = new CampeaoBuilder()
                        .comNome("Nautilus")
                        .comCusto(3)
                        .deClasse("Vigia")
                        .comElemento("Oceano")
                        .build();
        nautilus.exibeStatus();
        
        Campeao khazix = new CampeaoBuilder()
                        .comNome("Kha'Zix")
                        .comCusto(4)
                        .deClasse("Assasino")
                        .comElemento("Montanha")
                        .build();
        khazix.exibeStatus();
        
        Campeao lux = new CampeaoBuilder()
                        .comNome("Lux")
                        .comCusto(7)
                        .deClasse("Avatar")
                        .comElemento("Avatar")
                        .build();
        lux.exibeStatus();
        
        Campeao mundo = new CampeaoBuilder()
                        .comNome("Dr. Mundo")
                        .comCusto(3)
                        .deClasse("Berserker")
                        .comElemento("Nuvem")
                        .build();
        mundo.exibeStatus();
        
        //System.out.println(ashe.getCampeoesComposicao());
        
        Composicao time1 = new Formacao(varus, nautilus, khazix, lux, mundo);
        
        time1.getCampeoesComposicao();
        time1.getCustoComposicao();  
    }
}
