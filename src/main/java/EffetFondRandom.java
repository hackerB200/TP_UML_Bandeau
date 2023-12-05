import bandeau.Bandeau;

import java.awt.Color;

public class EffetFondRandom extends Effet {

    public EffetFondRandom(Bandeau bandeau, String message){
        super(bandeau, message);
    }

    public EffetFondRandom(){
        super();
    }

    @Override
    public void jouerEffet(){
        bandeau.setMessage(message);
       changeCouleurFond();
    }

    public void changeCouleurFond(){
        bandeau.setBackground(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
        bandeau.sleep(100);
    }
}
