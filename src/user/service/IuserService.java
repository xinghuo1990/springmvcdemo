package user.service;

import user.dto.UserDto;

import java.util.List;
import java.util.Map;

public interface IuserService {
    public void saveUser(UserDto userDto)throws Exception;

    public List<UserDto> queryUserByMap(Map map) throws Exception;

    public List<UserDto> queryUserByName(UserDto userDto) throws Exception;
}
