package com.imooc.oa.global;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//登录拦截器
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String url = httpServletRequest.getRequestURI();//获得请求路径
        if(url.toLowerCase().indexOf("login")>=0){//如果有login关键字
            return true;//放行，不拦截
        }

        //判断有没有登录
        HttpSession session = httpServletRequest.getSession();//获得session
        if(session.getAttribute("employee")!=null){//表示已经有session（即已经登陆过）
            return true;//放行，不拦截
        }

        //去登录
        httpServletResponse.sendRedirect("/to_login");
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
