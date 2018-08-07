-- update  prdt set formula='1;-1;-1;0;0;主单位数量/12;副单位数量*12'
-- where ut='pcs' and ut1='Dozens' and (formula IS NULL or formula='')


---011处理主副单位换算 以下按次序2秒执行一次
update prdt set formula='1;-1;-1;0;0;主单位数量/12;副单位数量*12'
where ut='pc' and ut1='Dozen' and (formula IS NULL or formula='')







