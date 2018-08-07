-- update  prdt set formula='1;0;0;4;4;主单位数量*0.9144;副单位数量/0.9144'
-- where ut='yards' and ut1='meters' and (formula IS NULL or formula='')

---011处理主副单位换算 以下按次序2秒执行一次
update prdt set formula='1;0;0;4;4;主单位数量*0.9144;副单位数量/0.9144'
where ut='yard' and ut1='meter' and (formula IS NULL or formula='')


