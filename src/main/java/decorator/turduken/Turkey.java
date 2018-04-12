package decorator.turduken;

public class Turkey extends Bird {
    public Turkey(Filler filler) {
        super(filler);
    }

    public String getFillerName() {
        return "turkey filled with " + filler.getFillerName();
    }
}
