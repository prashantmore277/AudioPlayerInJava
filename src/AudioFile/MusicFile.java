//Package
package AudioFile;

// Imports
import java.util.*;
import java.io.File;
import java.io.*;
import javax.sound.sampled.*;

// Main Class
public class MusicFile {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner sc = new Scanner(System.in);

        File file = new File("musicFriends.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();

        clip.open(audioStream);

        String responce = "";

        while(!responce.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset ,Q = Quit");
            System.out.println("Enter Your Choice");

            responce = sc.next();
            responce = responce.toUpperCase();

            switch (responce){
                case ("P"):clip.start();
                break;
                case ("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("Q"):clip.close();
                break;
                default:
                    System.out.println("Not a Valid Response, Please Give the Correct Response");

            }
        }
        System.out.println();
        System.out.println("Byeee, See you soon!!!!");
    }
}
