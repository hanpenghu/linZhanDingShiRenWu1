update  prdt set formula='1;-1;-1;0;0;主单位数量/12;副单位数量*12'
where ut='pcs' and ut1='Dozens' and (formula IS NULL or formula='')