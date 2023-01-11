package iRobot;

import javax.swing.plaf.nimbus.State;
import java.awt.*;
import java.util.ArrayList;

public class Robot3 {

    /** уровень робот */
    private int level;

    /** имя робота */
    private String name;

    /** состояние робота */
    private State state;


    enum State {
        On, Off
    }

    private static int defaultIndex;

    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    /**
     * @param level уровень робота
     * @param name  имя робота (не должно начинаться с цифры)
     */

    private Robot3(int level, String name) {
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("Defaultname %d", defaultIndex++);
        } else {
            this.name = name;
        }
        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    public Robot3(String name) {
        this(1, name);
    }

    public Robot3() {
        this("");
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }
    // Методы вкл/выкл подсистем

    public void power () {
        if (state == State.Off) {
            this.powerOn();
            this.state = State.On;
        }
        else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }
    public void powerOn(){
        startBios();
        startOS();
        sayHi();
    }
    public void powerOff(){
        sayBye();
        stopOS();
        stopBios();
    }

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
        if (state == State.On) {
            System.out.println("Working...");
        }
    }

}

