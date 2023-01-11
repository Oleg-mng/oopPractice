package iPoint;

public class App1 {

    public static void main(String[] args) {
    Point2D a = new Point2D(0, 2);
    a.setX(0);
    a.setY(2);
    System.out.println(a.getX());
    System.out.println(a.getY());

    Point2D b = new Point2D(10);
    System.out.println(b);

    var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }

}


