package sChap10;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "C:\\Users\\user\\fileTest";
        String testFile = "testFile.txt";
//        sample.checkPath(pathName);
//        sample.checkFile(pathName, testFile);
        sample.checkList(pathName);
    }

    private void checkList(String pathName) {
        File file;
        file=new File(pathName);
//        File[] mainFileList = file.listFiles();
        File[] mainFileList = file.listFiles(new JPGFilenameFilter());
        for(File temp : mainFileList) {
            System.out.println(temp.getName());
        }

    }

    private void checkFile(String pathName, String fileName){
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = "+file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        if(file.exists() == true) {
            System.out.println(pathName + " is exists? = " + file.exists());
        }else {
            System.out.println("Make "+pathName+" result = "+file.mkdir());
        }

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        System.out.println("last modified = "+new Date(file.lastModified()));

        file.delete();
    }
}
