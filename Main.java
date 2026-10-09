
package pp2.week03.geometry;

public class Main {
    public static void main(String[] args) {
    
        Point p1 = new Point();
        Point p2 = new Point(3.0f, 4.0f);
        Point p3 = new Point(p2);

        System.out.println("Default point: ("
                + p1.getX() + ", " + p1.getY() + ")");

        System.out.println("Point 2: ("
                + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Copied point equals Point 2: "
                + p3.equals(p2));

        //setters
        p1.setX(1.0f);
        p1.setY(2.0f);

        System.out.println("Point 1 after setters: ("
                + p1.getX() + ", " + p1.getY() + ")");

        //distance and translate
        System.out.println("Distance: " + p1.distance(p2));

        p1.translate(1.0f, 1.0f);

        System.out.println("Point 1 after translation: ("
                + p1.getX() + ", " + p1.getY() + ")");

        System.out.println("Points equal: " + p1.equals(p2));

        //Segment constructors
        Segment s1 = new Segment(
                new Point(0.0f, 0.0f),
                new Point(4.0f, 4.0f)
        );

        Segment s2 = new Segment(
                0.0f, 0.0f, 4.0f, 4.0f
        );

        //getters and setters
        System.out.println("P1: ("
                + s1.getP1().getX() + ", "
                + s1.getP1().getY() + ")");

        System.out.println("P2: ("
                + s1.getP2().getX() + ", "
                + s1.getP2().getY() + ")");

        s1.setP1(new Point(1.0f, 1.0f));
        s1.setP2(new Point(5.0f, 5.0f));

        System.out.println("Length: " + s1.length());
        System.out.println("Segments equal: " + s1.equals(s2));
        System.out.println("Slope: " + s1.getSlope());
        System.out.println("Intercept: " + s1.getIntercept());

        //isOnLine and isOnSegment
        Point p4 = new Point(3.0f, 3.0f);
        Point p5 = new Point(6.0f, 6.0f);

        System.out.println("Point (3,3) on line: "
                + s1.isOnLine(p4));

        System.out.println("Point (3,3) on segment: "
                + s1.isOnSegment(p4));

        System.out.println("Point (6,6) on segment: "
                + s1.isOnSegment(p5));

        //Segment translation
        s1.translate(1.0f, 0.0f);

        System.out.println("New P1 after translation: ("
                + s1.getP1().getX() + ", "
                + s1.getP1().getY() + ")");
    }
}
