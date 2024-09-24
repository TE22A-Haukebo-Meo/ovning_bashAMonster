import java.util.Scanner;

public class fighter {
    Scanner tb = new Scanner(System.in);
    String name;
    int hp = 100;

    int attack(int hp, int dmg){
        System.out.println(name+" attacked!");
        hp -= dmg;
        return hp;
    }
}
