package com.sq.account.generator.dao;

import com.sq.account.generator.model.AccountNew;
import com.sq.account.generator.model.AccountNewExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountNewMapper {
    int countByExample(AccountNewExample example);

    int deleteByExample(AccountNewExample example);

    int insert(AccountNew record);

    int insertSelective(AccountNew record);

    List<AccountNew> selectByExample(AccountNewExample example);

    int updateByExampleSelective(@Param("record") AccountNew record, @Param("example") AccountNewExample example);

    int updateByExample(@Param("record") AccountNew record, @Param("example") AccountNewExample example);
}