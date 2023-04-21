import com.sun.org.apache.bcel.internal.generic.INEG;
import org.junit.Test;

import java.io.File;
import java.sql.Driver;

/**
 * @author justin-zhu
 * <p>
 * 2022年04月02日 15:19
 */

public class TestFileRec {

    static String  dirname = "src";
    static Integer count = 0;
    public static void isDirectory(String src){
        File f1 = new File(src);

        if (!f1.isDirectory()){
            System.out.println(src + " is  a file");
            count++;

        }else{
            System.out.println(src + " is a directory");
            count++;
            String s[] = f1.list();
            for (String ss : s){
                isDirectory(ss);
            }
        }
    }

    public static void main(String[] args) {

        isDirectory(dirname);
        System.out.println(count);
    }


    @Test
    public void printFile(){
        String src = "src";
        File file = new File(src);
        if (file.isDirectory()){
            System.out.println("Directory of : " + src);
            String s[] = file.list();
            for (String ss : s){

                File f = new File(ss);
                if (f.isDirectory()){
                    System.out.println(ss + " is a directory");
                }else if(f.isFile()){
                    System.out.println(ss + " is  a file");
                }else{
                    System.out.println(ss + " is not a directory");
                }
            }
        }
    }

}
