import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//@Configuration используется для обозначения блока инициализации
@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }


    //В классе AppConfig, по аналогии, создайте бин с именем “cat”.
    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat сat = new Cat();
        сat.setMessage("ЪУЪ");
        return сat;
    }




}