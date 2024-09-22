package belajarspring.spring.core;


import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;


@Configuration
@Slf4j
public class DependsOnConfiguration {
    @Bean
    /*
        Depends On digunakan untuk Bean dibuat saat setelah bean lain
        Jadi dibawah Bar akan dibuat terlebih dahulu daripada Foo
    */
    @DependsOn({
            "bar"
    })
    /*
    *   Dibuat ketika sudah diakses karena secara default itu dibuat semua terlebih dahulu
    * */
    @Lazy
    public Foo foo() {
        log.info("Create New Foo");
        return new Foo();
    }


    @Bean
    public Bar bar() {
        log.info("Create New Bar");
        return new Bar();

    }


}
