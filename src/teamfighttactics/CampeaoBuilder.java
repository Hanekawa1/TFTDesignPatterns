package teamfighttactics;

import Elemento.ElementoFactory;
import Classe.ClasseFactory;

public class CampeaoBuilder {
    private Campeao campeao;
    
    public CampeaoBuilder(){
        campeao = new Campeao();
    }
    
    public CampeaoBuilder comNome(String nome){
        campeao.setNome(nome);
        return this;
    }
    
    public CampeaoBuilder comCusto(int custo){
        campeao.setCusto(custo);
        return this;
    }
    
    public CampeaoBuilder deClasse(String classe){
        ClasseFactory classeFactory = new ClasseFactory();
        campeao.setClasse(classeFactory.criarClasse(classe));
        return this;
    }
    
    public CampeaoBuilder comElemento(String elemento){
        ElementoFactory elementoFactory = new ElementoFactory();
        campeao.setElemento(elementoFactory.fabricaElemento(elemento));
        return this;
    }
    
    public Campeao build(){
        return campeao;
    }   
}
