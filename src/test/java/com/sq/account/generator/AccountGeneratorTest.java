package com.sq.account.generator;

import com.sq.account.generator.dao.AccountCdMapper;
import com.sq.account.generator.dao.AccountInMapper;
import com.sq.account.generator.dao.AccountNewMapper;
import com.sq.account.generator.ias.AbsAccountGenerator;
import com.sq.account.generator.ias.IdataStore;
import com.sq.account.generator.model.AccountNew;
import com.sq.account.generator.utils.ServiceUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountGeneratorTest extends AbsAccountGenerator implements IdataStore {
	private static final Logger log = LoggerFactory.getLogger(AccountGeneratorTest.class);

	@Autowired
	private AccountInMapper accountInMapper;

	@Autowired
	private AccountCdMapper accountcdMapper;

	@Autowired
	private AccountNewMapper accountNewMapper;

	@Before
	public  void cache(){
		lstAcd = accountcdMapper.queryAll();
		accountCodeForKJ(lstAcd,am); log.info("压缩后："+am);
		removeDup(am,am1); log.info("去重后："+am1);

		log.info("---------------------------------------------");
		lstAcc = accountInMapper.queryAll();
		accountXQForKJ(lstAcc,m,m2); log.info("压缩后："+m);
		removeDup(m,m1); log.info("去重后："+m1.size());
	}

	@Test
	public void generator() {
		log.info("---------------------start------------------------");

		doService(m1,m2,am1);
		log.debug("j =======>"+j);

		pkgRecord(ServiceUtils.m,chm);

		for(AccountNew ann : chm.values()){
			accountNewMapper.insertSelective(ann);
		}

		log.info("---------------------end------------------------");
	}

	@After
	public void tearDown(){
		//统计
		showDiff(chm,am);

		m.clear();
		m1.clear();
		m2.clear();
		am.clear();
		am1.clear();
		chm.clear();
	}

}
