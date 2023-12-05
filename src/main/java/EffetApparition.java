import bandeau.Bandeau;
public class EffetApparition extends Effet {

    protected String direction;

    public EffetApparition(Bandeau bandeau, String message, String direction){
        super(bandeau, message);
        this.direction = direction;
    }

    public EffetApparition(){
        super();
        this.direction = "droite";
    }

    @Override
    public void jouerEffet(){
       faireApparaitre();
    }

    public void faireApparaitre(){
        if (direction.equals("gauche")) {
            for (int i = message.length(); i > 0; i--) {
                bandeau.sleep(100);
                bandeau.setMessage(message.substring(i - 1));
                bandeau.sleep(100);
            }
        } else {
            for (int i = 0; i < message.length(); i++) {
                bandeau.sleep(100);
                bandeau.setMessage(message.substring(0, i + 1));
                bandeau.sleep(100);
            }
        }
    }
}
