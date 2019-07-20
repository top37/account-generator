package com.sq.account.generator.dao;

import com.sq.account.generator.model.AccountIn;
import com.sq.account.generator.model.AccountInExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInMapper {

    List<AccountIn> queryAll();
    int countByExample(AccountInExample example);

    int deleteByExample(AccountInExample example);

    int deleteByPrimaryKey(Long a);

    int insert(AccountIn record);

    int insertSelective(AccountIn record);

    List<AccountIn> selectByExample(AccountInExample example);

    AccountIn selectByPrimaryKey(Long a);

    int updateByExampleSelective(@Param("record") AccountIn record, @Param("example") AccountInExample example);

    int updateByExample(@Param("record") AccountIn record, @Param("example") AccountInExample example);

    int updateByPrimaryKeySelective(AccountIn record);

    int updateByPrimaryKey(AccountIn record);
}