package app;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Hello world!
 *
 */
@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class DemoController {
 
    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @RequestMapping(value="/createUser",method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        user.setId(001);
        user.setName("和舒骏");
        return user;
    }

}