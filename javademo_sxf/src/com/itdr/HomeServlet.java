package com.itdr;

import javax.servlet.*;
import java.io.IOException;

public class HomeServlet implements Servlet {
    /**
     *  init初始化的方法
     * @param servletConfig
     * @throws
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化的方法执行了");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("处理请求的方法执行了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁的方法
     */
    @Override
    public void destroy() {
        System.out.println("销毁的方法执行了");
    }
}
