
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Naruto",100,500);
        HeroStrength hero2 = new HeroStrength("Sasuke", 120, 500);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}