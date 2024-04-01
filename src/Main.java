public class Main {
    public static void main(String[] args) {

        testWizard();

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