package iPoint;

public class Point2D {
    private int x, y;

    /**
     * Это конструктор
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }
    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    private String getInfo() {
        return String.format("x:%d, y:%d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }
}
