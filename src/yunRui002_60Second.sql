UPDATE A SET A.UP=B.UP_IN,A.AMT=A.QTY*B.UP_IN
,A.TAX=round((A.QTY*B.UP_IN/1.17)*0.17,2)
,A.AMTN_NET=A.QTY*B.UP_IN-round((A.QTY*B.UP_IN/1.17)*0.17,2),
A.ORIGIN='T' FROM TF_PSS A,TF_IZ B,MF_PSS C
WHERE A.PS_ID='SA' AND A.OS_NO=B.IZ_NO
AND A.PRD_NO=B.PRD_NO AND A.EST_ITM=B.ITM
AND A.PS_DD>='2018-2-1' and A.PS_NO=C.PS_NO and C.tax_id=2
and (A.ORIGIN IS NULL or isNULL(A.UP,0)<>isNULL(B.UP_IN,0))