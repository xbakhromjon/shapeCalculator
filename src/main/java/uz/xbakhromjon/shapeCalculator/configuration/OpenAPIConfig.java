package uz.xbakhromjon.shapeCalculator.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Shape Calculator API",
                version = "1.0.0",
                contact = @Contact(
                        name = "ProDevs", email = "xbakhromjon@gmail.com", url = "https://www.xbakhromjon.uz"
                )
        ),
        servers = @Server(url = "http://localhost:8080/api"))
public class OpenAPIConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/*.html")
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
                .resourceChain(false)
                .addResolver(new WebJarsResourceResolver())
                .addResolver(new PathResourceResolver());
    }

    @Bean
    public GroupedOpenApi perimeterGroup() {
        return GroupedOpenApi
                .builder()
                .group("Perimeter")
                .pathsToMatch("/**" + "/calculator/perimeter" + "/**")
                .build();
    }

    @Bean
    public GroupedOpenApi areaGroup() {
        return GroupedOpenApi
                .builder()
                .group("Area")
                .pathsToMatch("/**" + "/calculator/area" + "/**")
                .build();
    }


    @Bean
    public GroupedOpenApi volumeGroup() {
        return GroupedOpenApi
                .builder()
                .group("Volume")
                .pathsToMatch("/**" + "/calculator/volume" + "/**")
                .build();
    }

}

