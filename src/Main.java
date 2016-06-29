import java.util.ArrayList;
import java.util.List;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        List<Monster> monsters = new ArrayList<>();

        monsters.add(new Zombie());
        monsters.add(new Dragon());
        monsters.add(new Zombie());
        monsters.add(new Dragon());

        //TODO: Loop through the array of Monsters, printing out something for each Monster
        for (Monster monster : monsters) {
            System.out.println(monster.aboutMe());
        }

    }
}
