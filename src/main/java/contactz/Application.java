package contactz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Maciej Cebula on 15.04.2017.
 */
@ComponentScan
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
