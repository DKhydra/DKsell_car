package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);

    /**
     * 根据手机号查询用户id
     * @param mobile
     * @return
     */
    Long selectIdByMobile(Long mobile);

    /**
     * 根据mobile和密码查询
     * @param mobile
     * @param password
     * @return
     */
    Login selectByMobileAndPassword(@Param("mobile") Long mobile, @Param("password") String password);
}