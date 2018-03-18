update a set a.AMTN_CLS=b.amt,a.AMTN_CLS_RCV=b.amt from tc_mon a,mf_arp b
where  a.arp_no=b.arp_no and b.amt=b.amt_rcv and (b.amtn<>b.amtn_rcv)