package belajarspring.spring.core.bean;

import belajarspring.spring.core.bean.data.Foo;
import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.stream.Collectors;

@ComponentScan
public class MultiFoo {

    @Getter
    private List<Foo> fooList;


    public MultiFoo(ObjectProvider<Foo> objectProvider ){
        fooList = objectProvider.stream().collect(Collectors.toList());
    }
}
