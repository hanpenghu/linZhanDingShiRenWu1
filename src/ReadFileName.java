import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ReadFileName {
    public static void main(String[]args){
            File file=new File("./src/");
        List<File> files = Arrays.asList(file.listFiles());
        files.forEach(v->{
           if(v.getName().contains(".jar")){
               System.out.println(v.getName());
           }

        });
    }
}
