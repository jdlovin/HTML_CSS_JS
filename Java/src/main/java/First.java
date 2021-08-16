import javax.servlet.*;
import java.io.IOException;

public class First implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Creating object....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Servicing...");
    }

    @Override
    public String getServletInfo() {
        return "this servlet created by admin";
    }

    @Override
    public void destroy() {
        System.out.println("Destroying object...");
    }
}
