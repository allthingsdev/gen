package mg.odg.gen.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan
public class MvcConfig implements WebMvcConfigurer {
	
	@Autowired
	ApplicationContext applicationContext;

	public void configureDefaultServletHandling() {
		
	}
	
	
	
	
}
























