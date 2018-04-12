package decorator.turduken;

public class Duck extends Bird {
    public Duck(Filler filler) {
        super(filler);
    }

    public String getFillerName()	{
        return "duck filled with " + filler.getFillerName();
    }
}
