package chapters.chapter_12.Listings12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Listing12_18_WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an URL: ");
        String url = input.nextLine();
        crawler(url);// Traverse the Web from the starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(startingURL);
        while (!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100) {
            String urlString = listOfPendingUrls.remove(0);
            if (!listOfTraversedUrls.contains(urlString)) {
                listOfTraversedUrls.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedUrls.contains(s)) {
                        listOfPendingUrls.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {// Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
}
