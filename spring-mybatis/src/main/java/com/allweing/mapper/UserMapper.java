package com.allweing.mapper;

import com.allweing.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


     User findUserById(Long id);
}
