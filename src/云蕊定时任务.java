import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class 云蕊定时任务 {
    //com.microsoft.sqlserver.jdbc.SQLServerDriver
    private static String dbName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //    jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17
//        private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17";//林展
    private static String dbUrl="jdbc:sqlserver://127.0.0.1:7803;DatabaseName=DB_8";//云蕊
    private static String usr="sa";//林展
    //        private static String pwd="x3g5k8h!9+guanglan@";//林展
    private static String pwd="c7k9r5H2w8+!@wuyishan";//云蕊
    public static Connection  getCon() throws ClassNotFoundException, SQLException {

        //未打包之前读这个,因为没有打包,所以srcPath是可以读到的,打了包就读不到jar包里面了
//        Properties pr = p.readProp(p.srcPath()+"DBConfig.properties");
        //打包后用这个,然后把DBConfig.properties放在jar包外面,因为这样就直接读到了classpath路径下面的东西
        /*Properties pr = p.readProp("DBConfig.properties");
        p.p(p.str2Log(pr.getProperty("dbName")));
        dbName=pr.getProperty("dbName");
        dbUrl=pr.getProperty("dbUrl");
        usr=pr.getProperty("userName");
        pwd=pr.getProperty("pwd");*/
        Class.forName(dbName);
//        String url="jdbc:sqlserver://61.177.44.218:1433;DatabaseName=DB_LZ17";
//        String url=dbUrl;
//        //mydb为数据库
//        String user=usr;//"sa";
//        String password=pwd;//"x3g5k8h!9+guanglan@";
        Connection conn= DriverManager.getConnection(dbUrl,usr,pwd);
        if(p.empty(conn)){
            return null;
        }else{
            return conn;
        }
    }


    //以下是60秒一次
    String sql01 = "";
    String sql02 = "";

    //120秒一次
    String sql2="";
    String sql3="";

    String sql004_1="";
    String sql004_2="";

    public 云蕊定时任务() {
        InputStream resourceAsStream = null;
        try {

            //60秒一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui001_60Second.sql");
            sql01 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui002_60Second.sql");
            sql02 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            //120秒一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui002_120Second.sql");
            sql2 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui003_120Second.sql");
            sql3 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui004_1_120Second.sql");
            sql004_1 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("yunRui004_2_120Second.sql");
            sql004_2 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


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


    //60秒一次
    public  void f1() {

        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //
        try {
            p.p("-----------------yunRui001_60Second.sql--------------------------------------");
            p.p(sql01);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql01);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-----------------yunRui002_60Second.sql--------------------------------------");
            p.p(sql02);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql02);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            c.close();
            p1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //120秒一次
    public  void f120Second() {

        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //
        try {
            p.p("-----------------yunRui002_120Second.sql--------------------------------------");
            p.p(sql2);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql2);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-----------------yunRui003_120Second.sql--------------------------------------");
            p.p(sql3);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql3);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-----------------yunRui003_120Second.sql--------------------------------------");
            p.p(sql004_1);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql004_1);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-----------------yunRui003_120Second.sql--------------------------------------");
            p.p(sql004_2);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql004_2);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            c.close();
            p1.close();
        } catch (SQLException e) {
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

        //120秒一次
        Runnable runnable120Second = new Runnable() {
            public void run() {
                云蕊定时任务.this.f120Second();
            }
        };


        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable1, 5, 60, TimeUnit.SECONDS);
        //120秒一次
        service.scheduleAtFixedRate(runnable120Second, 2, 120, TimeUnit.SECONDS);


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
