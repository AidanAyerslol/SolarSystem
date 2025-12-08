import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

// trace solar system
//        StarSystem solarsystem = new StarSystem();
//        createSolarSystem(solarsystem);
//        Simulation simulation = new Simulation();
//        simulation.startSimulationTimed(solarsystem, 10000);

// trace outer wilds
//        StarSystem outerwilds = new StarSystem();
//        createOuterWilds(outerwilds);
//        Simulation simulation = new Simulation();
//        simulation.startSimulationTimed(outerwilds, 1320);

// find distance between Earth and Europa, per request of Jonathan Southard
//        Simulation simulation = new Simulation();
//        body Sun = new body();
//        body Earth = new body();
//        body Jupiter = new body();
//        body Europa = new body();
//
//        Earth.createBody("Earth", Sun, 0.0, 14900.0, 365.0, 0.6378);
//        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 69.634);
//        Jupiter.createBody("Jupiter", Sun, 0.0, 77800.0, 4333.0, 7.1492);
//        Europa.createBody("Europa", Jupiter, 0.0, 67.1, 3.55, 0.156);
//        simulation.startSimulationDistance(Earth, Europa, 5000);

// find how long it tastes jupiter to align with Earth
//        Simulation simulation = new Simulation();
//        body Sun = new body();
//        body Earth = new body();
//        body Moon = new body();
//
//        Earth.createBody("Earth", Sun, 0.0, 14900.0, 365.0, 0.6378);
//        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 69.634);
//        Moon.createBody("Moon", Earth, 0.0, 38.44, 27.3, 0.174);
//        simulation.startSimulationEclipse(Earth, Moon);

    }


    public static void createSolarSystem(StarSystem solarsystem) {
        //indented to show relationships for clarity
        solarsystem.createFile("solarsystem.csv");
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

                //Measurements are in 10's of thousands of kilometers (1:10,000)
                // orbital velocity is the time in days for a body to complete an orbit of its center
        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 69.634);
        Mercury.createBody("Mercury", Sun, 0.0, 5790.0, 88.0, 0.244);
        Venus.createBody("Venus", Sun, 0.0, 10800.0, 225.0, 0.60518);
        Earth.createBody("Earth", Sun, 0.0, 14900.0, 365.0, 0.6378);
        Moon.createBody("Moon", Earth, 0.0, 38.44, 27.3, 0.174);
        Mars.createBody("Mars", Sun, 0.0, 22800.0, 687.0, 0.3390);
        Phobos.createBody("Phobos", Mars, 0.0, 0.9376, 0.319, 0.00111 );
        Deimos.createBody("Deimos", Mars, 0.0, 2.346, 1.26, 0.00062);
        Jupiter.createBody("Jupiter", Sun, 0.0, 77800.0, 4333.0, 7.1492);
        Io.createBody("Io", Jupiter, 0.0, 42.17, 1.77, 0.18213);
        Europa.createBody("Europa", Jupiter, 0.0, 67.1, 3.55, 0.156);
        Ganymede.createBody("Ganymede", Jupiter, 0.0, 107.0, 7.15, 0.2631);
        Callisto.createBody("Callisto", Jupiter, 0.0, 188.27, 16.7, 0.24103);
        Saturn.createBody("Saturn", Sun, 0.0, 142480.0, 10759.0, 6.0268); //saturn spins so fast it got flattened a bit, so Im using the equatorial radius
        Titan.createBody("Titan", Saturn, 0.0, 122.187, 15.945, 0.2575);
        Uranus.createBody("Uranus",Sun, 0.0, 291540.0, 30687.0, 2.5362); //same as saturn, to a lesser degree
        Neptune.createBody("Neptune", Sun, 0.0, 447040.0, 60190.0, 2.4622);
        Triton.createBody("Triton", Neptune, 0.0, 35.48, 5.88, 0.135);
        solarsystem.addBody(Sun);
        solarsystem.addBody(Mercury);
        solarsystem.addBody(Venus);
        solarsystem.addBody(Earth);
        solarsystem.addBody(Moon);
        solarsystem.addBody(Mars);
        solarsystem.addBody(Phobos);
        solarsystem.addBody(Deimos);
        solarsystem.addBody(Jupiter);
        solarsystem.addBody(Europa);
        solarsystem.addBody(Callisto);
        solarsystem.addBody(Saturn);
        solarsystem.addBody(Titan);
        solarsystem.addBody(Uranus);
        solarsystem.addBody(Neptune);
        solarsystem.addBody(Triton);
    }

    public static void createOuterWilds(StarSystem outerwilds){
        outerwilds.createFile("outerwilds.csv");
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

        //Measurements are in meters (1:1) because the solar system is very scaled down
        //orbital velocity is the time in seconds (1:1) using a universal time scale instead of a planet specific one since you will likely be travelling planets frequently in the game
        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 2000.0);
        HourGlassTwinsOrbit.createBody("HourGlassTwinsOrbit", Sun, 0.0, 5000.0, 110.76, 0.0);
        AshTwin.createBody("AshTwin", HourGlassTwinsOrbit, 0.0, 250.0, 55.0, 169.0);
        EmberTwin.createBody("EmberTwin", HourGlassTwinsOrbit, 3.1415, 250.0, 55.0, 170.0); //angle should be opposite the center so it doesnt overlap the other twin
        TimberHearth.createBody("TimberHearth", Sun, 0.0, 8593.086, 250.25, 254.0);
        Attlerock.createBody("Attlerock", TimberHearth, 0.0, 900.0, 105.0, 80.0);
        BrittleHollow.createBody("BrittleHollow", Sun, 0.0, 11690.891, 397.94, 272.0);
        HollowsLantern.createBody("HollowsLantern", BrittleHollow, 0.0, 1000.0, 115.0, 97.3);
        GiantsDeep.createBody("GiantsDeep", Sun, 0.0, 16457.587, 650.0, 500.0);
        ProbeCannon.createBody("ProbeCannon", GiantsDeep, 0.0, 1000.0, 50.0, 15.0);
        DarkBramble.createBody("DarkBramble", Sun, 0.0, 20000.0, 875.16, 203.3);
        outerwilds.addBody(Sun);
        outerwilds.addBody(HourGlassTwinsOrbit);
        outerwilds.addBody(AshTwin);
        outerwilds.addBody(EmberTwin);
        outerwilds.addBody(TimberHearth);
        outerwilds.addBody(Attlerock);
        outerwilds.addBody(BrittleHollow);
        outerwilds.addBody(HollowsLantern);
        outerwilds.addBody(GiantsDeep);
        outerwilds.addBody(ProbeCannon);
        outerwilds.addBody(DarkBramble);


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

