package belajarspring.spring.core.listener;

import belajarspring.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class LoginSuccessListeners implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Succes login for user", event.getUser());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}
