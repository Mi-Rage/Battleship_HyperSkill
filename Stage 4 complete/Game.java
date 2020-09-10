
public class Game {

    public void start() {
        Player player = new Player();
        player.battlefield.initfield();
        System.out.println("The game starts!");
        player.battlefield.printBattlefield(true);
        System.out.println("Take a shot!");
        player.battlefield.makeShot();
    }
}
