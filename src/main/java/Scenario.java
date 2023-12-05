import java.util.LinkedHashMap;

public class Scenario {

    private LinkedHashMap<Effet, Integer> effets;


    public Scenario(){
        effets = new LinkedHashMap<>();
    }

    public void ajouterEffet(Effet effet, int repetition){
        effets.put(effet, repetition);
    }

    public void jouerScenario(){
        effets.forEach((effet, repetition) -> {
            for (int i = 0; i < repetition; i++) {
                effet.jouerEffet();
            }
        });
    }
}
