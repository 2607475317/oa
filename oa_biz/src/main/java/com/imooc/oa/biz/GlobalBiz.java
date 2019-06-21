package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;
//个人中心操作
public interface GlobalBiz {
    //登录
    Employee login(String sn,String password);
    //修改密码
    void changePassword(Employee employee);
}
