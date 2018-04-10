update  prdt set formula='1;0;0;4;4;主单位数量/0.9144;副单位数量*0.9144'
where ut='meters' and ut1='yards' and (formula IS NULL or formula='')