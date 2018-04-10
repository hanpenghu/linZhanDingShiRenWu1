import javax.xml.bind.helpers.DefaultValidationEventHandler;
import java.sql.*;
import java.util.Properties;

public class DbCon {
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
