package sChap10;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "C:\\Users\\user";
        long sum = sample.printFileSize(path);
        System.out.println(path+" 's total size="+sum);
    }
    private long printFileSize(String dirName) {
        File file = new File(dirName);
        long sizeFile = 0;
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp:files){
                if (temp.length() != 0) {
                    String fileByte = null;
                    fileByte = convertFileLength(temp.length());
                    System.out.println(temp.getName()+" 폴더의 총 사용 용량은 "+fileByte);
                    sizeFile += temp.length();
                }
            }
        }
        return sizeFile;
    }

    private String convertFileLength(long length) {
        DecimalFormat df = new DecimalFormat();
        if (length < 1024) {
            return length+" b";
        } else if (length < 1024*1024) {
            return length/1024+" kb";
        } else if (length < 1027*1024*1024) {
            return length/(1024*1024)+" mb";
        } else {
            return length/(1024*1024*1024)+" gb";
        }
    }
}
