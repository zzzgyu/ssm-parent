package com.allweing.mapper;

import com.allweing.entity.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

     @Select(" select * from user where id=#{id}")
     User findUserById(Long id);
}
