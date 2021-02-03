import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriteData {
      private static List<Integer> list=new ArrayList<>();
    public static void readData() throws IOException{
        FileInputStream fileInputStream=new FileInputStream("TestText.txt");
        int deyer;
        while ((deyer=fileInputStream.read())!=-1){
            list.add(deyer);
        }


    }


    public static void kopyala(String fayAdi) throws IOException{
        FileOutputStream fileOutputStream=new FileOutputStream(fayAdi);
        for (int readData:list){
            fileOutputStream.write(readData);
        }



    }
    public static void main(String[] args) throws IOException {

        readData();
        kopyala("TestText.txt");













    }
}
