package utility;

public class ManhattanDistance2D implements Distance2D{

    @Override
    public double dist(Point2D p1, Point2D p2) {
        return Math.abs(p1.getX() - p2.getY()) + Math.abs(p1.getY() - p2.getY());
    }

}
