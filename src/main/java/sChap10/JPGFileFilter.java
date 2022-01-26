package sChap10;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {
    /*
        Accept
        파일 객체가 디렉터리가 아닌지 확인
        파일이름이 .jpg로 끝나면 ture를 리턴함 !
    */
    @Override
    public boolean accept(File pathname) {
        System.out.println("여기까지오냐");
        if (pathname.isFile() == true) {
            System.out.println("들어오냐");
            String fileName = pathname.getName();
            System.out.println(fileName);
            if(fileName.endsWith(".txt")) return true;
        }
        return false;
    }
}
