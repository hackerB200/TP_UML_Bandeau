import bandeau.Bandeau;

public class EffetTourEntier extends Effet {

    public EffetTourEntier(Bandeau bandeau, String message){
        super(bandeau, message);
    }

    public EffetTourEntier(){
        super();
    }

    @Override
    public void jouerEffet(){
        this.bandeau.setMessage(message);
        faireTourner();
    }

    public void faireTourner(){
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2*Math.PI*i / 100);
            bandeau.sleep(20);
        }
    }
}
