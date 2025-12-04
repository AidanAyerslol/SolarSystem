import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class System {

    private Node sun = new Node();
    File systemcoords;

    //do not forget to create a file when making a system, a smarter man than me would idiot-proof this. Alas, a smarter man I am not
    public void createFile(String directory){
        systemcoords= new File(directory);
    }

    public void walkList(Call call){
        walkList(call, sun);
    }
    private void walkList(Call call, Node root){
        call.action(root.getBody());
        walkList(call, root.next);
    }

    public void printSystemCoords(){
        printSystemCoords(sun);
    }
    private void printSystemCoords(Node root){

        //will print something along the lines of "Sun, 0, 0, Mercury, 1, 0, Venus, 2, 0, Earth, 3, 0, \n" into a csv file
        //use columns of x and y values over time to create graphs

        XCall x = new XCall();
        YCall y = new YCall();
        try {
            FileWriter fw = new FileWriter(systemcoords);
            fw.write(root.getBody().getName()+","+x.action(root.getBody())+","+y.action(root.getBody()));
            if (root.next() != null){
                printSystemCoords(root.next());
            }
            else {
                fw.write("\n");
            }

        } catch (IOException ex) {System.out.println("IO Exception");}
    }




    private class Node {
        private body body;
        private Node next;

        private void fillNode(body addedbody){
            body = addedbody;
            next = new Node();
        }

        public body getBody(){
            return body;
        }
        public Node next(){
            return next;
        }

        public boolean addtoList(Node root, body addedbody){
            if (root.getBody() == null) {
                root.fillNode(addedbody);
                return true;
            }
            else {
                addtoList(root.next(), addedbody);
                return false;
            }

            }
        }

    }
