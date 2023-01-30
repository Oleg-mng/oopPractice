package aGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++){
            int val = rand.nextInt(3);
            switch (val) {
                case (0):
                    team.add(new Priest());
                    break;
                case (1):
                    team.add(new Magician());
                    break;
                case (2):
                    team.add(new Druid());
                    break;
//                default:
//                    team.add(new BaseHero());
//                    break;
            }
            System.out.println(team.get(i).getInfo());
        }
        System.out.println();

//        BaseHero hero = new BaseHero();
//        System.out.println(hero);
        Magician magician = new Magician();
        System.out.println(magician);
        Priest priest = new Priest();
        System.out.println(priest);
        Druid druid = new Druid();
        System.out.println(druid);

    }
}

