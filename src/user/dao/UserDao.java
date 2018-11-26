package user.dao;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import user.dto.UserDto;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao{


    public void saveUser(UserDto userDto)throws Exception ;

//    @Select(value = "select * from user_test u where u.user_name= #{dto.name}")
    public List<UserDto> queryUserByMap(Map map) throws Exception;

    @Select(value = "select * from user_test u where u.user_name= #{name}")
    @Results({
            @Result(property = "name",  column = "user_name", javaType = String.class),
            @Result(property = "sex",  column = "user_sex", javaType = String.class)
    })
    public List<UserDto> queryUserByName(UserDto userDto) throws Exception;
}
