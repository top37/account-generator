package com.sq.account.generator.dao;

import com.sq.account.generator.model.AccountCd;
import com.sq.account.generator.model.AccountCdExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCdMapper {

    List<AccountCd> queryAll();

    int countByExample(AccountCdExample example);

    int deleteByExample(AccountCdExample example);

    int deleteByPrimaryKey(Long a);

    int insert(AccountCd record);

    int insertSelective(AccountCd record);

    List<AccountCd> selectByExample(AccountCdExample example);

    AccountCd selectByPrimaryKey(Long a);

    int updateByExampleSelective(@Param("record") AccountCd record, @Param("example") AccountCdExample example);

    int updateByExample(@Param("record") AccountCd record, @Param("example") AccountCdExample example);

    int updateByPrimaryKeySelective(AccountCd record);

    int updateByPrimaryKey(AccountCd record);
}