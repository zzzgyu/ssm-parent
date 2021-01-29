package com.allweing.mapper;

import com.allweing.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

     @Select("select * from user where id = #{id}")
     User findUserById(Long id);
}
