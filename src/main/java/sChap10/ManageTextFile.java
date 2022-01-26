package sChap10;

import java.io.*;
import java.util.Scanner;

public class ManageTextFile {

    public static void main(String[] args) {
        ManageTextFile manage = new ManageTextFile();
        int numberCount = 10;
        String fullPath = "C:\\Users\\user\\fileTest\\testFile.txt";

//        manage.writeFile(fullPath, numberCount);
        manage.readFile(fullPath);
    }

    private void readFile(String fullPath) {
        File file = new File(fullPath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("success !!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }

    private void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(int i=0; i<=numberCount; i++){
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.newLine();
            }
            System.out.println("success !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
