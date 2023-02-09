package exercise;

// BEGIN
public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getBeginPoint() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEndPoint() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getMidPoint() {
        Point midPoint = new Point();
        int x = (start.getX() + end.getX()) / 2;
        int y = (start.getY() + end.getY()) / 2;

        midPoint.setX(x);
        midPoint.setY(y);

        return midPoint;
    }
}
// END
