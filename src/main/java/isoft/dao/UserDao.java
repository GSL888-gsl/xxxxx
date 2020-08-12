package isoft.dao;

import isoft.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /*登录*/
    User login(@Param("name") String name,@Param("password") String password);


    User getById(@Param("id") Integer id);

    int updateById(User user) ;

    List<User> getUser(@Param("name") String name , @Param("status") String status );

    int insert(User user);

    User get(@Param("id") Integer id);

}
