package cn.wlxu.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class freemarkerIndex {
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String, Object> result, HttpServletRequest request) {
        result.put("name", "wlxu");
        result.put("sex", "0");
        result.put("age", 22);
        ArrayList<String> userlist = new ArrayList<>();
        userlist.add("wlxu");
        userlist.add("wei");
        userlist.add("wei");
        result.put("userList",userlist);
        return "freemarkerIndex";
    }
}
