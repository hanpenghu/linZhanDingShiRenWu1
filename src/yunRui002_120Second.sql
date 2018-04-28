update b set b.os_id='SO',b.os_no=a.os_no,b.est_itm=c.est_itm,B.QTY_OS=B.QTY
from mf_ck a,tf_ck b,tf_pos c
where a.ck_no=b.ck_no and isnull(a.os_no,'')!=''
and isnull(b.os_no,'')='' and c.os_id='SO' and a.os_no=c.os_no
and b.prd_no=c.prd_no and b.prd_mark=c.prd_mark