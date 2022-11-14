package chapters.chapter_12.Listings12;

import java.net.URL;
import java.util.Scanner;

public class Listing12_17_ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        }
        catch (java.net.MalformedURLException ex){
            System.out.println("Invalid url!");
        }
        catch (java.io.IOException ex){
            System.out.println("I/O Errors: no such file!");
        }
    }
}
