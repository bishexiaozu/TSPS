package com.tsps.interceptor;

import com.alibaba.fastjson.JSON;
import com.tsps.common.Commons;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : YongBiao Liao
 * @date : 2020/5/2 21:31
 * @description:
 * @modified :
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        String url = httpServletRequest.getRequestURI();
        if( (url != null && url.startsWith(Commons.URL_START_WITH)) || Commons.URL.contains(url)){
            return true;
        }else if(session.getAttribute("user") != null){
            return true;
        }else {
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setContentType("application/json; charset=utf-8");

            Map<String, Object> map = new HashMap<>();
            map.put("status",-1);
            map.put("msg","当前用户未登录");

            PrintWriter writer = null;
            OutputStreamWriter outputStreamWriter = null;
            outputStreamWriter = new OutputStreamWriter(httpServletResponse.getOutputStream(), "UTF-8");
            writer = new PrintWriter(outputStreamWriter, true);
            String result = JSON.toJSONString(map);
            writer.write(result);
            writer.flush();
            writer.close();
            outputStreamWriter.close();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
