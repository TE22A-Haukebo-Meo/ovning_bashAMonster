import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        fighter p1 = new fighter();
        p1.name = "Jag";

        opps e1 = new opps();
        e1.name = "Du";

        vapen v1 = new vapen();
        v1.typ = "svärd";
        v1.dmg = 20;

        vapen v2 = new vapen();
        v1.typ = "pistol";
        v2.dmg = 100;

        System.out.println("Välj vapen 1/2");
        int val = tb.nextInt();
        while (val != 1 || val != 2) {
            if (val == 1) {
                while (e1.hp > 0) {
                    e1.hp = p1.attack(e1.hp, v1.dmg);
                    /*e1.hp -= 10;*/
                    System.out.println("Du har nu hp:"+e1.hp);
                    Thread.sleep(500);
                }
                break;
            }
            else if (val == 2) {
                while (e1.hp > 0) {
                    e1.hp = p1.attack(e1.hp, v2.dmg);
                    /*e1.hp -= 10;*/
                    System.out.println("Du har nu hp:"+e1.hp);
                    Thread.sleep(500);
                }
                break;
            }
            else{

            }
        }
            

        
        
    }
}
