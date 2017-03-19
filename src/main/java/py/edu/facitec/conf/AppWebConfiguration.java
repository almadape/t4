package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
import py.edu.facitec.ejemplo2017.dao.ClienteDao;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ClienteDao.class})

public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	
	@Bean
	public FormattingConversionService mvcConversionService() 
	{ 
	 	DefaultFormattingConversionService conversionService =  	new DefaultFormattingConversionService(true);
	 	DateFormatterRegistrar registrar = new DateFormatterRegistrar(); 
	 	registrar.setFormatter(new DateFormatter("yyyy-MM-dd"));  
	 	registrar.registerFormatters(conversionService); 
	 	return conversionService; 
	 	} 

	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/static/");
		resolver.setSuffix(".html");
		
		resolver.setCache(false);
		return resolver;
	}
	
	
	//HABILITA EL ACCESO A RECURSOOS ESTATICOS
	//COMO JACSCRIPT CSS Y MUESTRA PROPIAS PAGINAS HTML
	
	//EN LE CASO DE ESTAR EN LA CARPETA WEB-INF NO ES NECESARIO ESTA CONFIGURACION
	//SOLO SE HABILITA LA PAGINA JPS EN EL CONTROLLER
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}