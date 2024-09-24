public class App {
    public static void main(String[] args) throws Exception {
        
        fighter p1 = new fighter();
        p1.name = "Jag";

        opps e1 = new opps();
        e1.name = "Du";

        while (e1.hp > 0) {
            e1.hp = p1.attack(e1.hp);
            /*e1.hp -= 10;*/
            System.out.println("Du har nu hp:"+e1.hp);
            Thread.sleep(500);
        }
        
    }
}
