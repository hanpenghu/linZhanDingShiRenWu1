UPDATE  A SET A.REM=B.SO_NO FROM MF_SQ A,TF_SQ B
WHERE A.CLS_ID='F' AND A.SQ_NO=B.SQ_NO AND B.ITM=1
AND (A.REM IS NULL or A.REM like '')
