UPDATE A SET A.CK_DD=Datename(year,GetDate())+'-'+Datename(month,GetDate())+'-'+Datename(day,GetDate())
FROM TF_CK A,MF_CK_Z B,MF_CK C
WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NULL AND A.CK_NO=C.CK_NO AND C.SA_CLS_ID='F'
