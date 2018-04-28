update b set b.qty_ic=NULL
from mf_pos a,tf_pos b
where a.os_id='SO' and a.os_no=b.os_no
and isnull(a.cls_id,'')!='T'
and isnull(b.qty_ic,0)<>0 and b.qty-isnull(b.qty_ps,0)>0