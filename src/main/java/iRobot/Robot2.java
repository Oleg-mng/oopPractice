package iRobot;

public class Robot2 {
        /**
         * уровень робота
         */
        private int level;
        /** имя робота */
        private String name;

        /**
         *
         * @param level уровень робота
         * @param name имя робота (не должно начинаться с цифры)
         */

        public Robot2(int level, String name) {
            this.level = level;
            this.name = name;
        }

        public void powerOn(){
            startBios();
            startOS();
            sayHi();
        }
        public void powerOf(){
            sayBye();
            stopOS();
            stopBios();
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }
    // Методы вкл/выкл подсистем

        /** Загрузка Bios */
        private void startBios() {
            System.out.println("Start Bios...");
        }
        /** Загрузка OS */
        private void startOS() {
            System.out.println("Start OS...");
        }
        /** Приветствие */
        public void sayHi() {
            System.out.println("Say Hi...");
        }
        /** Выгрузка Bios */
        public void stopBios() {
            System.out.println("Stop Bios...");
        }
        /** Выгрузка OS */
        private void stopOS() {
            System.out.println("Stop OS...");
        }
        /** Прощание */
        private void sayBye() {
            System.out.println("Bye...");
        }
        /** Работа */
        public void work() {
            System.out.println("Working...");
        }

}
