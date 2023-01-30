package aGame;


import java.util.Random;

    public class Magician extends BaseHero {
        private int mana;
        private int maxMana;
        static {
            aGame.Magician.number = 0;
            aGame.Magician.r = new Random();
        }

        public Magician() {

            super(String.format("Hero_Magician %d", aGame.Magician.number++), aGame.Magician.r.nextInt(100, 200));
            this.maxMana = aGame.Magician.r.nextInt(150, 300);
            this.mana = maxMana;
        }


        public String getInfo() {
            return String.format("%s   mana: %d", super.getInfo(), this.mana);
        }

        @Override
        public void die() {

        }


    }


