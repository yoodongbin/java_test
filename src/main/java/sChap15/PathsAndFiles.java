package sChap15;

import jdk.swing.interop.SwingInterOpUtils;
import sChap6.SetSample;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PathsAndFiles {
    public static void main(String[] args) {
        PathsAndFiles sample = new PathsAndFiles();
        String dir = "C:\\seven\\src\\main\\java\\com\\seven\\team01\\service";
//        sample.checkPath(dir);
        String dir2="C:\\seven";
        sample.checkPath(dir, dir2);
        sample.getContents();

        String fileName = "About This Book.txt";
        Path fromPath = sample.writeAndRead(fileName);

        sample.copyMoveDelete(fromPath, fileName);

    }
    private void checkPath(String dir1, String dir2) {
        Path path = Paths.get(dir1);
        Path path2 = Paths.get(dir2);

        Path relatibized = path.relativize(path2);
        System.out.println("relativized path = "+relatibized);


        Path absolute = relatibized.toAbsolutePath();
        System.out.println("toAbsolutePath path = "+absolute);
        Path normalized = absolute.normalize();
        System.out.println("normalized path = "+normalized);

        Path resolved = path.resolve("basicjava");
        System.out.println("resolved path = "+resolved);
    }

//    private void checkPath(String dir) {
//        Path path = Paths.get(dir);
//        System.out.println(path.toString());
//        System.out.println("getFileName() : " + path.getFileName());
//        System.out.println("getNameCount() : " + path.getNameCount());
//        System.out.println("getParent() : " + path.getParent());
//        System.out.println("getRoot() : " + path.getRoot());
//    }

    public ArrayList<String> getContents() {
        ArrayList<String> contents = new ArrayList<String>();
        contents.add("오늘부터 소식할거야 !");
        contents.add("소식은 어렵고 폭식은 쉬워 !");
        contents.add("근데 많이 먹을 거면 운동을 왜 하니 !?");
        contents.add("혹독하게 해보자고 ~ ");
        contents.add(""+new Date());
        return contents;
    }

    public Path writeFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        ArrayList<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path,contents,charset,openOption);
    }

    public void readFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("Path ="+path);
        List<String> fileContents = Files.readAllLines(path, charset);
        for (String tempContents : fileContents) {
            System.out.println(tempContents);
        }
        System.out.println();
    }

    public Path writeAndRead(String fileName) {
        Path returnPath = null;
        try {
            Path path = Paths.get(fileName);
            returnPath = writeFile(path);
            System.out.println("=====================");
            readFile(returnPath);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return returnPath;
    }

    public void copyMoveDelete(Path fromPath, String fileName) {
        try {
            Path toPath = fromPath.toAbsolutePath().getParent();

            Path copyPath = toPath.resolve("copied");
            if(!Files.exists(copyPath)) {
                Files.createDirectories(copyPath);
            }
            //copy
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;

            Files.copy(fromPath, copiedFilePath, copyOption);

            //read
            System.out.println("-----------copied file contents---------------");
            readFile(copiedFilePath);

            Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"),copyOption);

            //delete
            Files.delete(movedFilePath);
            Files.delete(copyPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
