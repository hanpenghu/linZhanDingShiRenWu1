update  tf_pos set wh='2000' where os_id='PO' and os_no in
(select os_no from mf_pos where cus_no='F031') and  wh != '2000'