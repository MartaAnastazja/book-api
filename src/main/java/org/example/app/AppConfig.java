package org.example.app;

import org.example.app.book.BookService;
import org.example.app.book.MemoryBookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//        import org.springframework.orm.jpa.JpaTransactionManager;
//        import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//        import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.example.app.Publisher.PublisherConverter;
//import javax.persistence.EntityManagerFactory;

@Configuration
@ComponentScan(basePackages = "org.example")
@EnableWebMvc
//@EnableTransactionManagement
public class AppConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Bean
//    public MemoryBookService bookService() {
//        return new MemoryBookService();
//    }
//    @Bean
//    public LocalEntityManagerFactoryBean entityManagerFactory() {
//        LocalEntityManagerFactoryBean entityManagerFactoryBean
//                = new LocalEntityManagerFactoryBean();
//        entityManagerFactoryBean.setPersistenceUnitName("bookstorePersistenceUnit");
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager jpaTransactionManager =
//                new JpaTransactionManager(entityManagerFactory);
//        return jpaTransactionManager;
//    }

//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(getPublisherConverter());
//    }
//
//    @Bean
//    public PublisherConverter getPublisherConverter() {
//        return new PublisherConverter();
//    }
}