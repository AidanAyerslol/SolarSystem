import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {


    }


    public void createSolarSystem() {
        //indented to show relationships for clarity
        body Sun = new body();
            body Mercury = new body();
                //no moon
            body Venus = new body();
                //no moon
            body Earth = new body();
                body Moon = new body();
            body Mars = new body();
                body Phobos = new body();
                body Deimos = new body();
            body Jupiter = new body();
                //I cant bring myself to not include any of these moons because they're all so cool....
                body Io = new body(); //volcanically active, how scary!!
                body Europa = new body(); //icy surface, and believed to have a subsurface ocean
                body Ganymede = new body(); //larger than mercury, with its own magnetic field, practically a planet!
                body Callisto = new body(); //4 billion years old and covered in craters
            body Saturn = new body();
                //Fun Fact: saturn has 146 moons, with 8 major moons
                //The untracked moons are: Rhea, Iapetus, Dione, Tethys, Enceladus, Mimas, and Hyperion
                body Titan = new body(); //the largest moon, has a super dense atmosphere that experiences constant thunderstorms
            body Uranus = new body();
                //28 moons with 5 major moons, but they are ALL boring, so I am ignoring them
            body Neptune = new body();
                //16 moons all named after mythical sea gods or creatures to match Neptune
                body Triton = new body();

    }

    public void createOuterWilds(){
        body Sun = new body();
            //The ash and ember twin are coorbital, spiraling around a point in space between the two because they have similar mass
            body HourGlassTwinsOrbit = new body();
                body AshTwin = new body();
                body EmberTwin = new body();
            body TimberHearth = new body();
                body Attlerock = new body();
            //has a black hole within its crust, if you ignore the physics it looks really cool!
            body BrittleHollow =  new body();
                //based on Io, spews magma onto the surface of brittle hollow
                body HollowsLantern = new body();
            //ocean planet with a denser ocean beneath its ocean? we actually have similar things on Earth!
            body GiantsDeep =  new body();
                //an artificial satelite? no problem for my code!
                body ProbeCannon =  new body();
            body DarkBramble =  new body();
            //I don't think I can even explain this one, but it is SUPER cool
    }

}





//
//        // units: 1.0 per 100,000 km
//        // orbital velocity is the time for a body to complete an orbit of its center
//        body Sun = new body();
//        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 6.9634);
//        body Earth = new body();
//        Earth.createBody("Earth", Sun, 0.0, 1490.0, 365.0, 0.06378);
//        body Moon = new body();
//        Moon.createBody("Moon", Earth, 0.0, 3.844, 27.3, 0.0174);
//        Calc calc = new Calc();
//
//        try {
//            FileWriter earthwriter = new FileWriter("earthdata.csv");
//            FileWriter moonwriter = new FileWriter("moondata.csv");
//
//            Earth.createDataFile("earthdata.csv");
//            Moon.createDataFile("moondata.csv");
//            for (int i = 0; i<365; i++){
//                Earth.updateAngle();
//                Moon.updateAngle();
//                saveData(earthwriter, Earth, calc);
//                saveData(moonwriter, Moon, calc);
//            }
//
//        } catch (IOException ex) {System.out.println("Error creating data file");}
//
//    }
//
//    public static void saveData(FileWriter fw, body body, Calc calc){
//        try {fw.write(body.getDistance()+","+body.getAngle()+","+calc.findX(body)+","+calc.findY(body)+","+calc.findDistance(body)+"\n");}
//        catch (IOException ex) {System.out.println("Error writing to file for "+body.getName());}
//    }

