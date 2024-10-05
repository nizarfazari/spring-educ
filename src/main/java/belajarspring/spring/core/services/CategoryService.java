package belajarspring.spring.core.services;

import belajarspring.spring.core.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CategoryService {


    @Getter
    CategoryRepository categoryRepository;


    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

}
