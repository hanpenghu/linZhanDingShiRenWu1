import java.sql.Connection;
import java.sql.PreparedStatement;

public class 吉祥会sql脚本 {

    public static void f(){
        Connection c = null;
        PreparedStatement p1 =null;
        try {
            c = DbCon.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //
        try {
            p1 = c.prepareStatement("ALTER TABLE luxclub_order ADD order_rem VARCHAR(1000) COMMENT '订单备注'");
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
        DbCon.closeAll(p1,null,c);
    }


    public static void main(String[]args){

            f();

    }

}
