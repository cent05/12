interface Car {
    void assemble();
}

class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}

abstract class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features for Sports Car");
    }
}

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features for Luxury Car");
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();

        Car sportsCar = new SportsCar(basicCar);
        sportsCar.assemble();

        System.out.println();

        Car luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.assemble();
    }
}
