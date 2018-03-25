import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test读取jar外部文件 {

    public static void main(String[]args){

//        String s1 =  "./"+"1.txt";
//        String 实验读取jar外文本 = p.str2Log(p.readAllTxt(s1), "实验读取jar外文本");
//        p.p(实验读取jar外文本);
        Properties pr=new Properties();
        try {
            pr.load(new FileReader("./DBConfig.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        pr.get("pwd");
        p.p(p.str2Log((String)pr.get("pwd"),"测试jar文件外面读取properties文件"));

    }

}


