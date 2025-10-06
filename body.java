import java.lang.Math;
public class body {
    //required variables
    //parent will be null if body is the sun
    //angle, distance, velocity, and radius is 0 if the body is the sun
    public String name;
    private body parent;
    private Double angle;
    private Double distance;
    private Double velocity;
    private Double radius;

    //constructor
    public void createBody(String bodyname, body parentbody, Double relativeangle, Double relativedistance, Double orbitalvelocity, Double bodyradius){
        name = bodyname;
        parent = parentbody;
        angle = relativeangle;
        distance = relativedistance;
        velocity = orbitalvelocity;
        radius = bodyradius;
    }


    //functions to return variable data
    public String getName(){
        return name;
    }
    public body getParent(){
        return parent;
    }
    public Double getAngle(){
        return angle;
    }
    public Double getDistance(){
        return distance;
    }
    public Double getVelocity(){
        return velocity;
    }
    public Double getRadius(){
        return radius;
    }

    public void updateAngle(){
        Double newangle = angle + (Math.PI * 2) / velocity;
        angle = newangle;
    }

}
