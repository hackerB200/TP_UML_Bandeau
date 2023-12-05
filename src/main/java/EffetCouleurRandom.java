import bandeau.Bandeau;

import java.awt.*;

public class EffetCouleurRandom extends Effet {

    public EffetCouleurRandom(Bandeau bandeau, String message){
        super(bandeau, message);
    }

    public EffetCouleurRandom(){
        super();
    }

    @Override
    public void jouerEffet(){
        bandeau.setMessage(message);
        changeCouleurTexte();
    }

    public void changeCouleurTexte(){
        bandeau.setForeground(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
        bandeau.sleep(100);
    }
}
