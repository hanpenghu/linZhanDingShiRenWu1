-- 001_1带出受订单-->物料采购（请购）分析-->请购批次转采购的备注
-- update a set a.REMARK=substring(b.rem,1,100) from tf_sq a,tf_pos b where
-- a.so_no=b.os_no
-- and a.EST_ITM_SO=b.est_itm
-- and (b.rem is NOT NULL and b.rem != '')  and (a.REMARK is NULL and a.REMARK='')


-- UPDATE  A SET A.REM=B.REM FROM TF_POS A,TF_POS B,TF_SQ C
-- WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.REM IS NULL or A.rem='') AND
-- B.os_id='SO' AND (B.REM IS NOT NULL AND B.rem != '') AND A.SQ_NO=C.SQ_NO AND
-- A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM

UPDATE  A SET A.REM=B.REM FROM TF_POS A,TF_POS B,TF_SQ C 
WHERE A.os_id='PO' AND A.qt_no like 'SQ%' AND (A.REM IS NULL or A.rem='') AND 
B.os_id='SO' AND (B.REM IS NOT NULL AND B.rem != '') AND A.SQ_NO=C.SQ_NO AND
A.OTH_ITM=C.ITM AND C.SO_NO=B.OS_NO AND C.EST_ITM=B.ITM