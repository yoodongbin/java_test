package sChap10;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {


    @Override
    public boolean accept(File dir, String name) {
        if(name.endsWith(".txt")) return true;
        return false;
    }
}
