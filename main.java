import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {
    public static void main(String[] args){

        // units: 1.0 per 100,000 km
        // orbital velocity is the time for a body to complete an orbit of its center
        body Sun = new body();
        Sun.createBody("Sun", null, 0.0, 0.0, 0.0, 6.9634);
        body Earth = new body();
        Earth.createBody("Earth", Sun, 0.0, 1490.0, 365.0, 0.06378);
        body Moon = new body();
        Moon.createBody("Moon", Earth, 0.0, 3.844, 27.3, 0.0174);
        Calc calc = new Calc();

        try {
            FileWriter earthwriter = new FileWriter("earthdata.csv");
            FileWriter moonwriter = new FileWriter("moondata.csv");

            Earth.createDataFile("earthdata.csv");
            Moon.createDataFile("moondata.csv");
            for (int i = 0; i<365; i++){
                Earth.updateAngle();
                Moon.updateAngle();
                saveData(earthwriter, Earth, calc);
                saveData(moonwriter, Moon, calc);
            }

        } catch (IOException ex) {System.out.println("Error creating data file");}

    }

    public static void saveData(FileWriter fw, body body, Calc calc){
        try {fw.write(body.getDistance()+","+body.getAngle()+","+calc.findX(body)+","+calc.findY(body)+","+calc.findDistance(body)+"\n");}
        catch (IOException ex) {System.out.println("Error writing to file for "+body.getName());}
    }

}
