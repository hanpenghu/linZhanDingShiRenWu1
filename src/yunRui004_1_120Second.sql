-- 004 修改货品税率、客户厂商税率 120秒
update prdt set spc_tax=16.00000000 where isnull(spc_tax,0)=0