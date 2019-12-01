package teamfighttactics;

public class Montanha implements Elemento {
    @Override
    public void aprimoramento(){
        System.out.println(
                "Elemento: Montanha[terra]\n"
               +"Aprimoramento: Concede velocidade de ataque extra.");
    }
}
