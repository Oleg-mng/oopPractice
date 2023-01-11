package iRobot;

public class Program {
    public static void main(String[] args) {
        Robot2 robot2 = new Robot2(99, "robotAnaytics");
        System.out.printf("robots level: %d   name: %s\n", robot2.getLevel(), robot2.getName());
        robot2.powerOn();
        robot2.work();
        robot2.powerOf();


//        Robot1 robot1 = new Robot1(1, "robotProgrammer");
//        System.out.printf("robots level: %d   name: %s\n", robot1.level, robot1.name);
//        robot1.startBios();
//        robot1.startOS();
//        robot1.sayHi();
//
//        robot1.work();
//        robot1.work();
//        robot1.work();

    }
}
