package DowncastUpcastEx;

public class Druid extends BaseHero{
    int mn;

        public Druid(String name, int hp, int mn){
            super(name, hp);
            System.out.println("Вызван Druid (String name, int hp, int mn)");
            this.mn = mn;
            this.hp = (int)(this.hp*0.8);
        }
        public Druid(){
            this("",0,0);
            System.out.println("Вызван Druid()");
        }
    }

