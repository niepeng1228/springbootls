package cn.com.djin.springboot.mapper;

import cn.com.djin.springboot.entity.User;
import java.util.List;

/**
 *  mapper代理对象
 */
public interface UserMapper {

    //查询所有用户
    List<User> selAllUser() throws Exception;
}
