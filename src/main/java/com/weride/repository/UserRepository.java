package com.weride.repository;

import org.apache.ibatis.annotations.Mapper;
import com.weride.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {

    @Select("select * from user where first_name = #{user.firstName} and password = #{user.password}")
    public List<User> login(@Param("user") User user);

    @Insert("insert into user(firstName,password) values(#{user.firstName},#{user.password})")
    public void register(@Param("user") User user);

    @Select("select * from user")
    public List<User> test();
}
