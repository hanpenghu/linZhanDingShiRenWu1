import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class 林展定时任务 {

    //以下是2分钟一次
    String sql1 = "";
    String sql2 = "";
    String sql3 = "";
//    String sql4 = "";
//    String sql5 = "";
    String sql6 = "";
    String sql7 = "";
    String sql8 = "";
    String sql9 = "";
    String sql10 = "";
    String sql11 = "";
    String sql12 = "";


    //一下是2秒钟一次

    String sql101 = "";
    String sql102 = "";
    String sql103 = "";
    String sql104 = "";
    String sql105 = "";
    String sql106 = "";
    String sql107 = "";
    String sql108 = "";
    String sql109 = "";
    String sql1010 = "";

    String sql1012 = "";
    String sql1013 = "";
    String sql1014 = "";


    //一下30秒一次
    String sql1011处理单独录入的采购单无币别的="";
    String sql13_30Second="";
    String sql14_30second="";//老郑的16


    String sql004_60Second="";
    String sql017_60Second="";
    public 林展定时任务() {
        InputStream resourceAsStream =null;
        try {




            //一下是30秒一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1.sql");
            sql1 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql2.sql");
            sql2 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql3.sql");
            sql3 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

//            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql4不用了.sql");
//            sql4 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
//
//            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql5不用了老郑.sql");
//            sql5= IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql6.sql");
            sql6 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql7.sql");
            sql7 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql8.sql");
            sql8 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql9.sql");
            sql9 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql10.sql");
            sql10 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql11.sql");
            sql11 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql12.sql");
            sql12 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql13_30Second.sql");
            sql13_30Second = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            //一下是2秒钟一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql101.sql");
            sql101 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql102.sql");
            sql102 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql103.sql");
            sql103 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql104.sql");
            sql104 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql105.sql");
            sql105 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql106.sql");
            sql106 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql107.sql");
            sql107 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql108.sql");
            sql108 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql109.sql");
            sql109 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1010.sql");
            sql1010 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1012.sql");
            sql1012 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1013.sql");
            sql1013 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1014.sql");
            sql1014 = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            //一下30秒一次
            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql1011.sql");
            sql1011处理单独录入的采购单无币别的= IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql14_30second.sql");
            sql14_30second=IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();


            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql004_60Second.sql");
            sql004_60Second = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();

            resourceAsStream = 林展定时任务.class.getResourceAsStream("sql017_60Second.sql");
            sql017_60Second = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8).trim();
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



    public  void a60秒一次() {

        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("------------------------------004 处理默认鸿运仓库 60秒----------------------------");
            p.p(sql004_60Second);//老郑的16
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql004_60Second);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        try {
            p.p("-------------------017.纱线货品批号管制自动打钩 以下按次序60秒执行一次--------------------------------------");
            p.p(sql017_60Second);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql017_60Second);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }





//2分钟一次
    public  void f1() {
        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //


        //
        try {
            p.p("-------------------------------------------------------");
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

        try {
            p.p("-------------------------------------------------------");
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
            p.p("-------------------------------------------------------");
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

//        try {
//            p.p("-------------------------------------------------------");
//            p.p(sql4);
//            p.p("-------------------------------------------------------");
//            p1 = c.prepareStatement(sql4);
//            int i = p1.executeUpdate();
//            p.p("-------------------------------------------------------");
//            p.p(i);
//            p.p("-------------------------------------------------------");
//            p.p(p.nStr("\n",3));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            p.p("-------------------------------------------------------");
//            p.p(sql5);
//            p.p("-------------------------------------------------------");
//            p1 = c.prepareStatement(sql5);
//            int i = p1.executeUpdate();
//            p.p("-------------------------------------------------------");
//            p.p(i);
//            p.p("-------------------------------------------------------");
//            p.p(p.nStr("\n",3));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql6);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql6);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql7);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql7);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            p.p("-------------------------------------------------------");
            p.p(sql8);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql8);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql9);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql9);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql10);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql10);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql11);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql11);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql12);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql12);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql13_30Second);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql13_30Second);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


        DbCon.closeAll(p1, null, c);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //   2秒执行一次
    public  void f2() {
        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //
        try {
            p.p("-------------------------------------------------------");
            p.p(sql101);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql101);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql102);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql102);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql103);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql103);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql104);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql104);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql105);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql105);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql106);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql106);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql107);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql107);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            p.p("-------------------------------------------------------");
            p.p(sql108);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql108);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql109);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql109);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql1010);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1010);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql11);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql11);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
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


        //  1012  1013  1014  2秒一次  2018_4_10   weekday(2)   14:21:17  add
        try {
            p.p("-------------------------------------------------------");
            p.p(sql1012);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1012);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            p.p("-------------------------------------------------------");
            p.p(sql1013);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1013);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            p.p("-------------------------------------------------------");
            p.p(sql1014);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1014);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        DbCon.closeAll(p1, null, c);
    }

    ////////////30秒一次//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void f3() {

        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = this.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            p.p("-------------------------------------------------------");
            p.p(sql14_30second);//老郑的16
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql14_30second);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        try {
            p.p("-----------------sql1011.sql--------------------------------------");
            p.p(sql1011处理单独录入的采购单无币别的);
            p.p("-------------------------------------------------------");
            p1 = c.prepareStatement(sql1011处理单独录入的采购单无币别的);
            int i = p1.executeUpdate();
            p.p("-------------------------------------------------------");
            p.p(i);
            p.p("-------------------------------------------------------");
            p.p(p.nStr("\n",3));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void f() {

        //a60秒一次()

        Runnable a60秒一次run = new Runnable() {
            public void run() {

                林展定时任务.this.a60秒一次();


            }
        };

        //2分钟一次
        Runnable runnable1 = new Runnable() {
            public void run() {

                林展定时任务.this.f1();


            }
        };

        //2秒一次
        Runnable runnable2 = new Runnable() {
            public void run() {
                // task to run goes here
                林展定时任务.this.f2();
            }
        };

        //30秒一次//
        Runnable runnable3 = new Runnable() {
            public void run() {
                // task to run goes here
                林展定时任务.this.f3();
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
        service.scheduleAtFixedRate(runnable1, 10, 120, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(runnable2, 5, 2, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(runnable3, 3, 30, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(a60秒一次run, 7, 60, TimeUnit.SECONDS);
    }



    public static void main(String[] args) {

        try {
            new 林展定时任务().f();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //com.microsoft.sqlserver.jdbc.SQLServerDriver
    private static String dbName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //    jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17
        private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17";//林展
//    private static String dbUrl="jdbc:sqlserver://127.0.0.1:7803;DatabaseName=DB_8";//云蕊
    private static String usr="sa";//林展
            private static String pwd="x3g5k8h!9+guanglan@";//林展
//    private static String pwd="c7k9r5H2w8+!@wuyishan";//云蕊
    /**
     *吉祥会
     * */
//    private static String dbName="com.mysql.jdbc.Driver";
//    jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17
//    private static String dbUrl="jdbc:mysql://121.40.221.152:3306/luxclub?useUnicode=true&characterEncoding=utf-8";
//    private static String usr="juhe";//
//    private static String pwd="juheculture";//

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

    public static void conClose(Connection c) throws SQLException {
        if(p.notEmpty(c)){
            c.close();
        }else{

        }

    }

    public static void resultSetClose(ResultSet c) throws SQLException {
        if(p.notEmpty(c)){
            c.close();
        }else{

        }

    }

    public static void preparedStatementClose(PreparedStatement c) throws SQLException {
        if(p.notEmpty(c)){
            c.close();
        }else{

        }

    }


    public static void closeAll(PreparedStatement p1,ResultSet r,Connection c){
        try {
            DbCon.preparedStatementClose(p1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DbCon.resultSetClose(r);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DbCon.conClose(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
