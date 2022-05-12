package com.czg.controller;

import com.czg.pojo.VipUser;
import com.czg.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/12 - 05 - 12 - 2:43
 * @Description: com.czg.controller
 * @version: 1.0
 */

@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    @RequestMapping("showVip")
    public String showVip(Map<String,Object> map){

        List<VipUser> vipUserList = vipService.findAll();
        map.put("vipuserlist",vipUserList);
        return "showVip";
    }

}
