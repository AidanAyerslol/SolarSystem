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

}
