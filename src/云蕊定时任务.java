import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class 云蕊定时任务 {

    //以下是60秒一次
    String sql1 = "";

    public 云蕊定时任务() {
        InputStream resourceAsStream = null;
        try {
            //一下是30秒一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui001.sql");
            sql1 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                resourceAsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public  void f1() {

        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = DbCon.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //
        try {
            p.p("-----------------yunRui001.sql--------------------------------------");
            p.p(sql1);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void f() {

        //60秒一次
        Runnable runnable1 = new Runnable() {
            public void run() {
                云蕊定时任务.this.f1();
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable1, 5, 60, TimeUnit.SECONDS);


    }

    public static void main(String[]args){
        //60秒一次
        try {
            new 云蕊定时任务().f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
