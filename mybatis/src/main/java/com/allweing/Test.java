package com.allweing;

import com.allweing.entity.User;
import com.allweing.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) throws IOException {
        String url = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(url);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(1l);
        System.out.println(userById);
       /* User findUserById = (User) sqlSession.selectOne("findUserById", 1l);
        System.out.println(findUserById);*/
    }
}
