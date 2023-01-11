package iRobot;

public class Robot1 {
    /**
     * уровень робота
     */
    public int level;
    /** имя робота */
    public String name;

    /**
     *
     * @param level уровень робота
     * @param name имя робота (не должно начинаться с цифры)
     */

    public Robot1(int level, String name) {
        this.level = level;
        this.name = name;
    }

    // Методы вкл/выкл подсистем

    /** Загрузка Bios */
    public void startBios() {
        System.out.println("Start Bios...");
    }
    /** Загрузка OS */
    public void startOS() {
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
    public void stopOS() {
        System.out.println("Stop OS...");
    }
    /** Прощание */
    public void sayBye() {
        System.out.println("Bye...");
    }
    /** Работа */
    public void work() {
        System.out.println("Working...");
    }

}
