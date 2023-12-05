import bandeau.Bandeau;
public abstract  class Effet {
    protected Bandeau bandeau;
    protected String message;

    public Effet(Bandeau bandeau, String message){
        this.bandeau = bandeau;
        this.message = message;
    }

    public Effet(){
        this.bandeau = new Bandeau();
        this.message = "Bandeau";
    }

    public Bandeau getBandeau() {
        return bandeau;
    }

    public void setBandeau(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void jouerEffet();

}
