package cn.wlxu.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContorller {

    @Value("${wlxu.name}")
    private String name;
    @Value("&{wlxu.age}")
    private String age;

    @RequestMapping("/")
    public String getMember(){
        return name + age;
    }
}
