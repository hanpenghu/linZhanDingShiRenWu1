import java.sql.*;

public class DbCon {
    public static Connection  getCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://61.177.44.218:1433;DatabaseName=DB_LZ17";
        //mydb为数据库
        String user="sa";
        String password="x3g5k8h!9+guanglan@";
        Connection conn= DriverManager.getConnection(url,user,password);
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
