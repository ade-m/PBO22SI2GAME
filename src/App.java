import model.Burung;
import model.Enemy;
import model.Pocong;
import model.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Enemy[] enemy = {new Enemy(), new Burung(), 
            new Pocong(),new Zombie() };
        for (Enemy enemy2 : enemy) {
            enemy2.attack();
        }
        
        enemy[2].attack();

        Zombie a = new Zombie();
        Burung b = new Burung();
        Pocong c = new Pocong();
        a.attack();
        a.walk();
        b.attack();
        c.attack();
    }
}
