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
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Robot3.names.indexOf(name) == -1) {
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
}

