package decorator.turduken;

public class TurduckenDemo {

    public static void main(String... args) {
        Bird turducken = new Turkey(new Duck(new Chicken(new SimpleFiller())));
        System.out.println(turducken.getFillerName());

        Bird doubleTurducken = new Turkey(new Turkey(new Duck(new Chicken(new SimpleFiller()))));
        System.out.println(doubleTurducken.getFillerName());

        Bird filledChicken = new Chicken(new SimpleFiller());
        System.out.println(filledChicken.getFillerName());

        Bird turkeyFilledWithFilledChicken = new Turkey(new Chicken(new SimpleFiller()));
        System.out.println(turkeyFilledWithFilledChicken.getFillerName());

    }
}