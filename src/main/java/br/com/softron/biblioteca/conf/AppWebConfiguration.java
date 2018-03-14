package br.com.softron.biblioteca.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.softron.biblioteca.controllers.HomeController;
import br.com.softron.biblioteca.daos.LivroDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, LivroDAO.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter{   //estende de WebMvcConfigurerAdapter para permitir setar pasta de recursos
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

		// configurando a pasta de recursos (css)
		@Override
		public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

}
