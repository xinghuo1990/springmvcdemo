package user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.dao.UserDao;
import user.dto.UserDto;
import user.service.IuserService;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IuserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(UserDto userDto)throws Exception {
        userDao.saveUser(userDto);
    }

    @Override
    public List<UserDto> queryUserByMap(Map map) throws Exception{
        List<UserDto> userDtoList = userDao.queryUserByMap(map);
        return userDtoList;
    }

    @Override
    public List<UserDto> queryUserByName(UserDto userDto) throws Exception {
        List<UserDto> userDtoList = userDao.queryUserByName(userDto);
        return userDtoList;
    }
}
