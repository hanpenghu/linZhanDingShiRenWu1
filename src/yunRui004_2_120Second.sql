-- 004 修改货品税率、客户厂商税率 120秒


update cust set RTO_TAX=16.00000000 where isnull(RTO_TAX,0)=0