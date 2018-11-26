package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.dto.UserDto;
import user.service.IuserService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private IuserService iuserService;

    @RequestMapping(value = "/save")
    public void save(UserDto userDto){
        System.out.println("開始保存");
        try {
            System.out.println("保存中……");
            iuserService.saveUser(userDto);
            Map<String,UserDto> map = new HashMap<>();
            userDto.setName("1");
            map.put("dto",userDto);
            List<UserDto> userDtoList = iuserService.queryUserByName(userDto);
            System.out.println(userDtoList.get(0).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("保存结束");
    }
}
