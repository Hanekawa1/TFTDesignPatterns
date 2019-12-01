package Classe;

import Elemento.Elemento;

public class Avatar implements Classe, Elemento{
    private String nomeElemento = "Nenhum";
    private String nomeClasse = "Avatar";   
    
    @Override
    public void descricao() {
        System.out.println("Classe: Avatar\n"
                + "Avatares são desconhecidos.");
    }

    @Override
    public void efeito() {
        System.out.println("Avatares ganham os efeitos de todas as outras classes.\n");
    }
    
    @Override
    public void aprimoramento(){
        System.out.println(
                "Elemento: Nenhum[Avatar]\n"
               +"Avatares não contém aprimoramentos");
    }
    @Override
    public String getNomeElemento(){
        return this.nomeElemento;
    }
    
    @Override
    public String getNomeClasse(){
        return this.nomeClasse;
    }
}
