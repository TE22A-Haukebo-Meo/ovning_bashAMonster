public class fighter {
    String name;
    int hp = 100;

    int attack(int hp){
        System.out.println(name+" attacked!");
        hp -=10;
        return hp;
    }
}
