package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.SysUser;
import com.imooc.pojo.TApiUser;
import com.imooc.service.ApiUserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/apiUser")
public class ApiUserController {

    @Autowired
    private ApiUserService apiUserService;

    @Autowired
    private Sid sid;

    @RequestMapping("/saveUser")
    public IMoocJSONResult saveUser() throws Exception {

        String userId = sid.nextShort();
        TApiUser user = new TApiUser();
        user.setApiPkid(1002l);
        user.setIsDelete(true);


        user.setCompanyName("我的小测试");
        user.setRemark(userId);

        apiUserService.saveUser(user);

        return IMoocJSONResult.ok("保存成功");
    }

    @RequestMapping("/queryUser")
    public IMoocJSONResult queryUser() throws Exception {

        String userId = sid.nextShort();

        TApiUser thisUser = new TApiUser();
        thisUser.setApiPkid(1001l);
        thisUser.setIsDelete(false);
        thisUser.setCompanyName("我的小测试");
        thisUser.setRemark("200114AKH345N9P0");
        List aa  = new ArrayList();
        String name ="sss";
        int age = 23;
        for (int i = 0; i < aa.size(); i++) {
            System.out.printf("name:%s    age:%d%n", name, age);

        }
        return IMoocJSONResult.ok( apiUserService.queryUserListPaged(thisUser,0,5));
    }

    @RequestMapping("/queryUserCustom")
    public IMoocJSONResult queryUserCustom(String qq) throws Exception {

        return IMoocJSONResult.ok( apiUserService.queryUserListCustom(qq,0,5));
    }
}
