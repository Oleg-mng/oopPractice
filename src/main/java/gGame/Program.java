package gGame;

import gGame.Healers.Druid;
import gGame.Healers.Healer;
import gGame.Healers.Priest;
import gGame.Healers.Shaman;
import gGame.Warriors.Paladin;
import gGame.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Paladin());
        team1.add(new Shaman());

        var h = team1.get(3);
        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        }
        else if (h instanceof Healer){
            ((Healer) h).healing(null);
        }
        else {
            //
        }
        List<Healer> team2 = new ArrayList<>();
        team2.add(new Priest());
        team2.add(new Shaman());

        team2.get(0).healing(null);

        List<Warrior> team3 = new ArrayList<>();
        team3.add(new Paladin());
        team3.add(new Paladin());

        team3.get(0).attack(null);
    }
}
