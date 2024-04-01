public class Wizard {
    private int energy;
    private String name;
    public Wizard(){
        name = "Безымянный";
        energy = 0;
    }
    public Wizard(String name, int energy){
        this.energy = energy;
        this.name = name;
    }
    public void magic(int minusEnergy){
        if (energy - minusEnergy > 0) {
            energy -= minusEnergy;
            System.out.println("Я, "+name+" заклинаю! Осталось "+energy+" энергии.");
        }
        else
            System.out.println(name+" сдулся... Пшик!");
    }
    public void rest(int time){
        energy += time;
    }
}
