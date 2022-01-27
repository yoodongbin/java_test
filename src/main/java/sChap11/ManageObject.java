package sChap11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manageObject = new ManageObject();
        String fullPath = "C:\\"+"Users"+separator+"user"+separator+"fileTest"+separator+"serial.obj";
        SerialDTO dto = new SerialDTO("javabook",1,true,100);
        manageObject.saveObject(fullPath,dto);
//        manageObject.loadObject(fullPath);
    }

    private void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            SerialDTO dto =(SerialDTO)obj;
            System.out.println(dto);
            System.out.println("read success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ois != null) {
                try {
                    fis.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("write success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("너라도 나와 !");
            } finally {
                if(oos != null) {
                    try {
                        fos.close();
                    }catch (Exception e) {
                        System.out.println("안쪽에러");
                        e.printStackTrace();
                    }
                }
        }
    }
}
