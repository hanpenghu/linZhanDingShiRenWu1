import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 吉祥会sql脚本 {
    private static String dbName="com.mysql.jdbc.Driver";
    //正式线
//        private static String dbUrl="jdbc:mysql://121.40.221.152:3306/luxclub?useUnicode=true&characterEncoding=utf-8";





//
//    private static String dbUrl="jdbc:mysql://127.0.0.1:3306/luxclub?useUnicode=true&characterEncoding=utf-8";
//    private static String usr="root";//
//    private static String pwd="root";//
    private static Connection getCon() throws SQLException, ClassNotFoundException {
        Class.forName(dbName);
        Connection conn= DriverManager.getConnection(dbUrl,usr,pwd);
        if(p.empty(conn)){
            return null;
        }else{
            return conn;
        }
    }
    public static void f(){
        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //订单备注会员不可见//其他要求reserve_require是会员可见
        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_order ADD order_rem VARCHAR(1000) COMMENT '订单备注(会员不可见)'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD order_rem VARCHAR(1000) COMMENT '订单备注'","执行成功"));
        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD order_rem VARCHAR(1000) COMMENT '订单备注'","已经存在"));
        }

        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_order ADD cut_money_time DATETIME comment '财务扣款时间'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD cut_money_time DATETIME comment '财务扣款时间'","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD cut_money_time DATETIME comment '财务扣款时间'","已经存在"));
        }


        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_order ADD order_confirm_man VARCHAR(26) comment '订单确认人'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD order_confirm_man VARCHAR(26) comment '订单确认人'","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_order ADD order_confirm_man VARCHAR(26) comment '订单确认人'","已经存在"));
        }
        try {
            p1 = c.prepareStatement("create table luxclub_mobile_token(loginName varchar(25) comment '登录名',token varchar(50) comment 'token验证标记')");
            boolean b = p1.execute();
            p.p(p.str2Log("create table luxclub_mobile_token(loginName varchar(25) comment '登录名',token varchar(50) comment 'token验证标记')","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("create table luxclub_mobile_token(loginName varchar(25) comment '登录名',token varchar(50) comment 'token验证标记')","已经存在"));
        }
        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_mobile_token ADD PRIMARY KEY ( loginName )");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_token ADD PRIMARY KEY ( loginName )","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_token ADD PRIMARY KEY ( loginName )","已经存在"));
        }

        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_mobile_steward_summary ADD huo_dong_hua_ti VARCHAR(500) comment '活动话题'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD huo_dong_hua_ti VARCHAR(500) comment '活动话题'","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD huo_dong_hua_ti VARCHAR(500) comment '活动话题'","已经存在"));
        }

        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_mobile_steward_summary ADD xi_hao VARCHAR(500) comment '喜好'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD xi_hao VARCHAR(500) comment '喜好'","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD xi_hao VARCHAR(500) comment '喜好'","已经存在"));
        }
        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_mobile_steward_summary ADD guan_xi VARCHAR(500) comment '关系'");
            boolean b = p1.execute();
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD guan_xi VARCHAR(500) comment '关系'","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("ALTER TABLE luxclub_mobile_steward_summary ADD guan_xi VARCHAR(500) comment '关系'","已经存在"));
        }

        try {
            p1 = c.prepareStatement("alter table luxclub_order modify column order_code varchar(300)");
            boolean b = p1.execute();
            p.p(p.str2Log("alter table luxclub_order modify column order_code varchar(300)","执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log("alter table luxclub_order modify column order_code varchar(300)","已经存在"));
        }



        String sql001="alter table luxclub_member_info modify column interest varchar(2000)";
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }


        //添加移动管家待接单时间
        sql001="alter table luxclub_order add  mobile_steward_receive_order_time datetime comment '移动管家已经接单时间'";
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }

        //添加移动管家已完成时间
        sql001="alter table luxclub_order add  mobile_steward_complete_order_time datetime comment '移动管家已完成时间'" ;
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }


        //消费成本
        sql001="alter table luxclub_order add  cheng_ben varchar(1000) comment '消费成本'" ;
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }


        //单据上传人
        sql001="alter table luxclub_order add  dan_ju_shang_chuan_ren varchar(55) comment '单据上传人(成本和消费是同时上传的)'" ;
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }

        //单据上传时间
        sql001="alter table luxclub_order add  dan_ju_shang_chuan_time datetime comment '单据上传时间(成本和消费是同时上传的)'" ;
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }

        //成本图片上传的url
        sql001="alter table luxclub_order add  cheng_ben_url varchar(1000) comment '成本图片上传后储存的url'" ;
        try {
            p1 = c.prepareStatement(sql001);
            boolean b = p1.execute();
            p.p(p.str2Log(sql001,"执行成功"));

        } catch (Exception e) {
            p.p(p.str2Log(sql001,"已经存在"));
        }






        DbCon.closeAll(p1,null,c);
    }



        private static String dbUrl="jdbc:mysql://127.0.0.1:3306/luxclub?useUnicode=true&characterEncoding=utf-8";
//    private static String dbUrl="jdbc:mysql://47.98.45.100:3306/luxclub?useUnicode=true&characterEncoding=utf-8";
//            private static String dbUrl="jdbc:mysql://121.40.221.152:3306/luxclub?useUnicode=true&characterEncoding=utf-8";

        private static String usr="juhe";//
//    private static String pwd="juheculture";//

//    private static String usr="juhe";//
    private static String pwd="root";//
    public static void main(String[]args){

            f();

    }

}
