import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16.
 */
public class 林展格式化打样确认时间 {

    public static void main(String[]args) throws ParseException, SQLException, ClassNotFoundException {
           new 林展格式化打样确认时间().f();
    }


    public void f() throws SQLException, ClassNotFoundException, ParseException {
        Connection con = getCon();
        String sql="SELECT id  FROM prdt_samp WHERE isconfirm=1";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<String> ids=new LinkedList<String>();
        while(resultSet.next()){
            ids.add(resultSet.getString(1));
        }

        for(String id:ids){
            if(p.notEmpty(id)){
                sql="SELECT top 1 confirmtimeStr FROM prdt_samp WHERE id=?";
                PreparedStatement preparedStatement1 = con.prepareStatement(sql);
                preparedStatement1.setString(1,id);
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                String confirmtimeStr="";
                while(resultSet1.next()){
                    confirmtimeStr=resultSet1.getString(1);
                }
                p.p("------------------------------confirmtimeStr-------------------------");
                p.p(confirmtimeStr);
                p.p("-------------------------------------------------------");
                if(p.notEmpty(confirmtimeStr)&&confirmtimeStr.length()==17){
                    Date parse = new SimpleDateFormat("yyyy-M-dd hh:s:mm").parse(confirmtimeStr);
                    String format = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm").format(parse);
                    sql="UPDATE prdt_samp SET confirmtimeStr=? where id =?";
                    PreparedStatement preparedStatement2 = con.prepareStatement(sql);
                    preparedStatement2.setString(1,format);
                    preparedStatement2.setString(2,id);
                    int i = preparedStatement2.executeUpdate();
                    preparedStatement.close();
                    resultSet.close();
                    preparedStatement1.close();
                    resultSet1.close();
                    preparedStatement2.close();

                }


            }
        }
        con.close();

    }

    public  void g() throws ParseException {
        String timeStr="2018-5-11 10:3:41";
        Date parse = new SimpleDateFormat("yyyy-M-dd hh:s:mm").parse(timeStr);
        p.p("-------------------------------------------------------");
        p.p(new SimpleDateFormat("yyyy-MM-dd hh:ss:mm").format(parse));
        p.p("-------------------------------------------------------");
    }
    //com.microsoft.sqlserver.jdbc.SQLServerDriver
    private static String dbName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //    jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17
        private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=DB_LZ17";//林展
//    private static String dbUrl="jdbc:sqlserver://127.0.0.1:7803;DatabaseName=DB_8";//云蕊
    private static String usr="sa";//林展
            private static String pwd="x3g5k8h!9+guanglan@";//林展
//private static String pwd="root";//林展
//    private static String pwd="c7k9r5H2w8+!@wuyishan";//云蕊
    public static Connection getCon() throws ClassNotFoundException, SQLException {

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
}
