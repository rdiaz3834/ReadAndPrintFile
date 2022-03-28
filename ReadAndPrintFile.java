import java.io.*;
import java.util.Scanner;

public class ReadAndPrintFile {
	
	public static void main(String[] args) throws Exception {
	   
       Scanner scnr = new Scanner(System.in);
      
       while(true) {
    	   
           System.out.println("What is the name of your file?");
           String fileName = scnr.next();
           File file = new File("D::\\Eclipse\\workstation\\Homework 6-1\\src\\ReadAndPrintFile" + fileName);
      
               if(!file.exists()) {
            	   
                   System.out.println("file not found " + fileName);
               
               } else {
                   
            	   BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                   String userInput = " ";
                   while ((userInput = bufferedReader.readLine()) != null) {
                	   System.out.println(userInput);
                   
                   }
                 
               }
           }
   }
      
}