UPDATE A SET A.CK_DD=Datename(year,GetDate())+'-'+Datename(month,GetDate())+'-'+Datename(day,GetDate())
FROM MF_CK A,MF_CK_Z B
WHERE A.CK_NO=B.CK_NO AND  B.FHRQ is NULL  AND A.SA_CLS_ID='F'