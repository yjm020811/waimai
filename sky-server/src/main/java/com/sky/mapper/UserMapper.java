package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    /**
     * 根据openid获取当前用户
     *
     * @param openid
     * @return
     */
    User getByOpenId(@Param("openid") String openid);


    /**
     * 插入数据
     *
     * @param user
     */
    void insert(User user);
}
