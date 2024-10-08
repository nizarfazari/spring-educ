package belajarspring.spring.core;

import belajarspring.spring.core.bean.data.Bar;
import belajarspring.spring.core.bean.data.Foo;
import belajarspring.spring.core.bean.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepedencyIjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependecyInjectionConfiguration.class);
    }

    @Test
    void testNoDI() {
        var foo = new Foo();
        var bar = new Bar();


        var fooBar = new FooBar(foo, bar);


        Assertions.assertSame(foo,  fooBar.getFoo());
        Assertions.assertSame(bar,  fooBar.getBar());
    }

    @Test
    void TestDI() {

        Foo foo = applicationContext.getBean( "fooSecond" , Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}


