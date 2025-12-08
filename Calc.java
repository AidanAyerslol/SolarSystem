import java.lang.Math;
public class Calc {

    private Double polartoX(Double r, Double theta){
        return (r * Math.cos(theta));
    }
    private Double polartoY(Double r, Double theta){
        return (r * Math.sin(theta));
    }

    private Double resultantX(Double xa, Double xb){
        return (xa+xb);
    }
    private Double resultantY(Double ya, Double yb){
        return (ya+yb);
    }

    private Double cartesiantoR(Double x, Double y){
        Double xsq = x*x;
        Double ysq = y*y;
        return (Math.sqrt(xsq+ysq));
    }

    public Double findX(body body){
        if (body.getParent() == null) {
            return 0.0;
        }
        else if (body.getParent().getParent() == null) {
            return polartoX(body.getDistance(), body.getAngle());
        }
        else {
            Double xa = polartoX(body.getDistance(), body.getAngle());
            Double xb = polartoX(body.getParent().getDistance(), body.getParent().getAngle());
            return resultantX(xa, xb);
        }
    }

    public Double findY(body body) {
        if (body.getParent() == null) {
            return 0.0;
        } else if (body.getParent().getParent() == null) {
            return polartoY(body.getDistance(), body.getAngle());
        } else {
            Double ya = polartoY(body.getDistance(), body.getAngle());
            Double yb = polartoY(body.getParent().getDistance(), body.getParent().getAngle());
            return resultantY(ya, yb);
        }
    }

    public Double findDistance(body body) {
        if (body.getParent() == null) {
            return 0.0;
        }
        else if (body.getParent().getParent() == null) {
            return body.getDistance();
        }
        else {
            Double x = findX(body);
            Double y = findY(body);
            return cartesiantoR(x, y);
        }
    }

    public Double findDistance(body body1, body body2) {

        // sqrt of ((x2-x1)^2 plus (y2-y1)^2)

        Double xchange = (findX(body1) - findX(body2) * (findX(body1) - findX(body2)));
        //find the absolute value of the x distance
        Double ychange = (findY(body1) - findY(body2) * (findY(body1) - findY(body2)));
        //find the absolute value of the y distance
        return Math.sqrt(xchange + ychange);
        //pythagorean theorem, find the hypotenuse which equals the distance

    }

    public Double findAngle(body body){
        if (body.getParent() == null) {
            return 0.0;
        }
        else if (body.getParent().getParent() == null) {
            return body.getAngle();
        }
        else {
            Double thetaAminusB = body.getAngle();
            Double thetaB = body.getParent().getAngle();
            return ((2 * thetaAminusB) - thetaB - 3.1415);
        }
    }

}
