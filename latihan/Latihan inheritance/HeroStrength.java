public class HeroStrength extends Hero {
    String type = "Strength";

    //subclass consturctor
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type :" + this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receive Critical Damage " + damage + "->" + 2*damage);
        this.health = this.health - 2*damage;
    }
}