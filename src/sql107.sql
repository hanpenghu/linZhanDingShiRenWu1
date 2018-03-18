update  a set a.sup_prd_no=b.sup_prd_no from  tf_sq a,tf_pos b,mf_bom c,tf_bom d
where
a.so_no=b.os_no and b.prd_no=c.prd_no and c.bom_no=d.bom_no and a.prd_no=d.prd_no
and (a.sup_prd_no IS NULL) and b.os_dd>='2017-10-1' and (b.sup_prd_no IS NOT NULL)