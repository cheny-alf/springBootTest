package cheny;

import cheny.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 声明我们的入口类 并且声明当前这个类是入口类
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class application {

    public static void  main(String[] args){
        SpringApplication.run(application.class,args);
    }

}
