-- 以前的
-- update prdt set chk_bat='T' where idx1 like '33%' and chk_bat='F'


-- 2018_10_30   weekday(2)   10:42:50  现在的

update prdt set chk_bat='T' where idx1 like '33%' and (chk_bat='F' or chk_bat IS NULL)