package config;

import music.ClassicMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("music")
@PropertySource("classpath:beans.properties")
public class ApplicationConfig {

    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
}
