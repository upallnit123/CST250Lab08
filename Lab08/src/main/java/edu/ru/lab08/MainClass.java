package edu.ru.lab08;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author upall
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        ArrayList<Camera> cameras = new ArrayList();
        
        try{
           
            File myFile = new File("C:\\Users\\upall\\CST250Lab08\\Lab08\\src\\main\\java\\edu\\ru\\lab08\\data.txt");
            Scanner fileScanner = new Scanner(myFile);
            while(fileScanner.hasNextLine()) {
                String cameraRow = fileScanner.nextLine();
                String[] cameraProperties = cameraRow.split(",");
                cameras.add(
                        new Camera(
                                cameraProperties[0], 
                                cameraProperties[1], 
                                cameraProperties[2], 
                                cameraProperties[3], 
                                Double.parseDouble(cameraProperties[4]), 
                                Double.parseDouble(cameraProperties[5])));
            }
        }catch(Exception e){
            System.out.println("Error occurred...");
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    System.out.println(cameras.get(10).getDistanceTo(41.938253305553516, -87.66846320182256));    
    }
    
}
