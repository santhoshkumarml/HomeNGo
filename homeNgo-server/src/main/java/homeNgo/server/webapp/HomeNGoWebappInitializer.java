package homeNgo.server.webapp;

import homeNgo.server.app.beans.web.WebappConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class HomeNGoWebappInitializer implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebappConfig.class);
		ctx.setServletContext(servletContext);

		ServletRegistration.Dynamic dispatcher =
				servletContext.addServlet("dispatcher",
						new DispatcherServlet(ctx));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}

}
