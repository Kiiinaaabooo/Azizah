public class Catactivity {
    // Atribut
    private int mood;
    private int hungry;
    private int energy;

    public Catactivity(int mood, int hungry, int energy) {
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    //sleep
    public void sleep() {
        energy += 1;
        hungry += 1;
        System.out.println("The cat is sleeping. Energy and hunger increased.");
    }

    //play
    public void play() {
        if (energy > 0) {
            mood += 1;
            energy -= 1;
            System.out.println("The cat is playing. Mood increased, energy decreased.");
        } else {
            System.out.println("The cat is too tired to play.");
        }
        meow();
    }

    //feed
    public void feed() {
        hungry -= 1;
        mood += 1;
        System.out.println("The cat is eating. Hunger decreased, mood increased.");
        meow();
    }

    //meow
    public void meow() {
        System.out.println("Meow!");
    }

    public void showStatus() {
        System.out.println("Mood: " + mood);
        System.out.println("Hungry: " + hungry);
        System.out.println("Energy: " + energy);
    }

    //simulasi
    public static void main(String[] args) {
        Catactivity myCat = new Catactivity(5, 5, 5);

        myCat.showStatus();
        System.out.println();

        myCat.play();
        myCat.feed();
        myCat.sleep();

        System.out.println();
        myCat.showStatus();
    }
}
