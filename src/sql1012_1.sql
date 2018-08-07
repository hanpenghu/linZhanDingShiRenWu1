-- update  prdt set formula='1;0;0;4;4;主单位数量/0.9144;副单位数量*0.9144'
-- where ut='meters' and ut1='yards' and (formula IS NULL or formula='')

-- 011处理主副单位换算 以下按次序2秒执行一次
update prdt set ut='pc',ut1='Dozen'  where idx1 like '9%' and (ut1='' or ut1 is NULL)









