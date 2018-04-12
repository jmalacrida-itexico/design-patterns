package decorator;

public class SquareDecorator extends ShapeDecorator {
    public SquareDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
    }
}
