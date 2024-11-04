package belajarspring.spring.core.services;


import belajarspring.spring.core.bean.data.User;
import belajarspring.spring.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if(isLoginSucess(username,password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return  true;
        }else {
            return  false;
        }
    }

    private boolean isLoginSucess(String username, String password) {
        return "nizar".equals(username) && "nizar".equals(password);
    }


}
