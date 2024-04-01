public class Main {
    public static void main(String[] args) {

        testCar();
        testWizard();

    }
    public static void testCar(){
        Car car1 = new Car();
        car1.setBrand("Бибика");
        car1.setV(0);
        Car car2 = new Car("Лада",60);
        car1.addSpeed(50);
        System.out.println("Скорость "+car1.getBrand()+" = "+car1.getV());
        car1.lowerSpeed(45);
        System.out.println("Скорость "+car1.getBrand()+" = "+car1.getV());
        System.out.println(car2.getBrand()+" быстрее на = "+(car2.getV()-car1.getV()));
    }
    public static void testWizard(){
        Wizard wizard1 = new Wizard("Мерлин", 100);
        Wizard wizard2 = new Wizard();
        wizard1.magic(20);
        wizard2.magic(20);
        wizard2.rest(30);
        wizard2.magic(20);
    }
}