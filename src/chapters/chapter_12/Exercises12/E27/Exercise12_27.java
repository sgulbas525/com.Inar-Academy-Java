package chapters.chapter_12.Exercises12.E27;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_27 {
    public static void main(String[] args) throws Exception{
        ArrayList<File> directories = new ArrayList<>();
        for (String s : args) {
            File file = new File(s);
            if (file.exists()) {
                if (file.isDirectory()) {
                    directories.add(new File(s));
                } else {
                    insert0(file);
                }
            }


            while (!directories.isEmpty()) {
                file = directories.remove(0);
                if (file.isDirectory()) {
                    File[] files = file.listFiles();
                    for (int i = 0; i < files.length; i++) {
                        if (files[i].isDirectory()) {
                            directories.add(files[i]);
                        }
                    }
                } else {
                    insert0(file);
                }
            }


        }
    }

    private static void insert0(File file) throws IOException {
       String s ;
       StringBuilder sb1 = new StringBuilder();
        try(
                Scanner input = new Scanner(file)
        ){while (input.hasNext()){
            s = input.nextLine() + "\n";
           // There is smt wrong!
            if (s.matches("Exercise\\d_\\d")){
                sb1.append(s.replaceAll("Exercise\\d_\\d", "Exercise0\\d_0\\d"));
            } else if ((s.contains("Exercise\\d_\\d+"))) {
                sb1.append(s.replaceAll("Exercise\\d_\\d+", "Exercise0\\d_\\d"));
            } else if ((s.contains("Exercise\\d+_\\d"))) {
                sb1.append(s.replaceAll("Exercise\\d+_\\d", "Exercise\\d_0\\d"));
            }
        }
        }

        try(
                PrintWriter output = new PrintWriter(file)
                ){
            output.print(sb1);
        }
    }
}
