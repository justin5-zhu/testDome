import org.junit.Test;

import java.io.File;

/**
 * @author justin-zhu
 * <p>
 * 2022年04月02日 15:19
 */

public class TestFile {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\betalpha-qa\\code\\testDome\\src";
        File f1 = new File(dirname);

        if (f1.isDirectory()){
            System.out.println("Directory of "+ dirname);
            String s[] = f1.list();
            for (String ss : s){
                File f = new File(ss);
                if (f.isDirectory()){
                    System.out.println(ss + " is a directory");
                }else if(f.isFile()){
                    System.out.println(ss + " is a file");
                }else{
                    System.out.println(ss + " is not a directory or file");
                }
            }
        }
//        else if(f1.isFile()){
//            System.out.println(dirname + " is  a file");
//        }else{
//            System.out.println(dirname + " is not a directory or file");
//        }
    }

    @Test
    public void testFileMethod(){
        String dirname = "src";
        File f1 = new File(dirname);
        System.out.println("getPath:" + f1.getPath());
        System.out.println("getName:" + f1.getName());
        System.out.println("getParent:" + f1.getParent());
        System.out.println("getAbsolutePath:" + f1.getAbsolutePath());
        File absoluteFile = f1.getAbsoluteFile();
        System.out.println("getAbsoluteFile:" + absoluteFile);
        System.out.println("length:" + f1.length());
        System.out.println("lastModified:" + f1.lastModified());
        System.out.println("canRead:" + f1.canRead());
        System.out.println("canWrite:" + f1.canWrite());

    }
}
