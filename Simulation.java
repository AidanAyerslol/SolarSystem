import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Simulation {

    private int currentday = 0;

    public void startSimulationTimed(StarSystem system, int finaldays){
        UpdateCall updater = new UpdateCall();
        try {
        FileWriter fw = new FileWriter(system.returnFile());
        for (int i = 1; i <= finaldays; i++) {
            system.printSystemCoords(fw);
            system.walkList(updater);
        }
        fw.close();
        } catch (IOException ex) {System.out.println("IOException");}
    }

    public void startSimulationEclipse(body body1, body body2){
        String filename = body1.getName()+body2.getName()+"eclipse.csv";
        File file = new File(filename);
        Calc calc = new Calc();
        try {
            FileWriter fw = new FileWriter(file);
            //both bodies start in-line, so update them out of line before simulating
            body1.updateAngle();
            body2.updateAngle();
            currentday++;
            //while both bodies remain not in-line, write their angles to a csv and iterate time
            while (body1.getAngle() != body2.getAngle()) {
                fw.write((int) (body1.getAngle()+body2.getAngle()));
                fw.write("\n");
                body1.updateAngle();
                body2.updateAngle();
                currentday++;
            }
            //record both bodies angles one more time, should be in-line, then close the writer
            fw.write((int) (body1.getAngle()+body2.getAngle()));
            fw.write("\n"+"Days taken to eclipse:,"+currentday);
            fw.close();
            System.out.println(currentday);



        } catch (IOException e) {System.out.println("bro.... io exception....");}
    }

    public void startSimulationDistance(body body1, body body2, int finaldays){
        String filename = body1.getName()+body2.getName()+"distance.csv";
        File file = new File(filename);
        Calc calc = new Calc();
        try{
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < finaldays; i++) {
                int distance = calc.findDistance(body1, body2).intValue();
                fw.write(distance);
                fw.write("\n");
                body1.updateAngle();
                body2.updateAngle();
            }
        } catch (IOException ex) {System.out.println("IOException: Error creating file");}
    }

}
