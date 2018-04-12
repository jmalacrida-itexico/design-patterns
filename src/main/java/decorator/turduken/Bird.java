package decorator.turduken;

public abstract class Bird implements Filler {
    protected Filler filler;

    public Bird(Filler filler) {
        this.filler = filler;
    }
}
