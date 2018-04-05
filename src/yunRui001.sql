UPDATE A SET A.UP=B.UP,A.AMT=A.QTY*B.UP,A.TAX=round((A.QTY*B.UP/1.17)*0.17,2),A.AMTN_NET=A.QTY*B.UP-round((A.QTY*B.UP/1.17)*0.17,2)
FROM TF_PSS A,TF_IZ B
WHERE A.PS_ID='SA' AND A.OS_NO=B.IZ_NO AND A.PRD_NO=B.PRD_NO AND A.EST_ITM=B.ITM
AND A.PS_DD=Datename(year,GetDate())+'-'+Datename(month,GetDate())+'-'+Datename(day,GetDate())