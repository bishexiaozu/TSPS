package com.tsps.filter;

import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/13 12:58
 * @description:
 * @modified :
 */
public class CrossingFilter implements Filter {

    private boolean isCross = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String isCrossStr = filterConfig.getInitParameter("IsCross");
        isCross = isCrossStr.equals("true") ? true : false;
        System.out.println("跨域开启状态：" + isCrossStr);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (isCross) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            System.out.println("拦截请求: " + httpServletRequest.getServletPath());
            String origin = httpServletRequest.getHeader("Origin");
            if(origin == null) {
                origin = httpServletRequest.getHeader("Referer");
            }
            httpServletResponse.setHeader("Access-Control-Allow-Origin", origin);
            httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
            if(RequestMethod.OPTIONS.toString().equals(httpServletRequest.getMethod())) {
                httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
                httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
                httpServletResponse.setHeader("Access-Control-Allow-Headers", "token,Origin, X-Requested-With, Content-Type, Accept");
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        isCross = false;
    }
}
