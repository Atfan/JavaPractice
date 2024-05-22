package com.company.MyFile;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws FileNotFoundException{
        File file1 = new File("Test1.txt");
        File file2 = new File("Test2.txt");
        //        if(!file1.exists()) {
        //            try {
        //                file1.createNewFile();
        //            } catch (IOException e) {
        //                System.out.println(e.getMessage());
        //            }
        //        }

        String str= "New string send to binary file!";
        byte[] bytes = str.getBytes();
        try (OutputStream os = new FileOutputStream(file1)){
            os.write(bytes);
            System.out.println("File write!");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(InputStream inputStream = new FileInputStream(file1)){
            int read = 0;
            byte[] buffer = new byte[10];
            while ((read = inputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, read));
            }
            System.out.println();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("+".repeat(50));

        String str2= "New string send to symbolic file!";
        try (Writer writer= new FileWriter(file2);
            Reader reader = new FileReader(file2);){
            writer.write(str2);
            System.out.println("File write!");
            writer.flush();

            List<String> buf = Files.readAllLines(file2.toPath());
            for (String s : buf) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        List<String> list= new ArrayList<>();
    }
}
