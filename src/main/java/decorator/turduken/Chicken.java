package decorator.turduken;

public class Chicken extends Bird {

    public Chicken(Filler filler) {
        super(filler);
    }

    @Override
    public String getFillerName() {
        return "chicken filled with " + filler.getFillerName();
    }
}

