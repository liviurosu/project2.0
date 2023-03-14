package config;

import beans.Tiger;
import beans.TigerMaster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public TigerMaster tigerMaster(){           // relatie has a
       var tm = new TigerMaster();
       tm.setTiger(tiger());
       return tm;
    }
    @Bean
    public Tiger tiger(){
        return new Tiger();
    }
}
