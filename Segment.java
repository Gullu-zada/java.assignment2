
package pp2.week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return new Point(p1);
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return (p1.equals(s.p1) && p2.equals(s.p2))
                || (p1.equals(s.p2) && p2.equals(s.p1));
    }

    public float getSlope() {
        float dx = p2.getX() - p1.getX();

        if (dx == 0) {
            throw new ArithmeticException(
                    "Slope is undefined for a vertical line.");
        }

        return (p2.getY() - p1.getY()) / dx;
    }

    public float getIntercept() {
        return p1.getY() - getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        float left = p.getY() - p1.getY();
        float right = getSlope() * (p.getX() - p1.getX());

        return Math.abs(left - right) < 0.0001f;
    }

    public boolean isOnSegment(Point p) {
        if (p1.getX() == p2.getX()
                && p1.getY() == p2.getY()) {
            return p.equals(p1);
        }

        float cross = (p.getX() - p1.getX())
                * (p2.getY() - p1.getY())
                - (p.getY() - p1.getY())
                * (p2.getX() - p1.getX());

        if (Math.abs(cross) > 0.0001f) {
            return false;
        }

        return p.getX() >= Math.min(p1.getX(), p2.getX())
                && p.getX() <= Math.max(p1.getX(), p2.getX())
                && p.getY() >= Math.min(p1.getY(), p2.getY())
                && p.getY() <= Math.max(p1.getY(), p2.getY());
    }
}

