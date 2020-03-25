package ourbusinessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Bootstrap {


    private InitializationService initializationService;

    public Bootstrap(InitializationService initializationService) {
        this.initializationService = initializationService;
    }
    @PostConstruct
    public void init() {
        try {
            initializationService.initProjects();
        } catch (RuntimeException err) {

        }
    }

    public InitializationService getInitializationService() {
        return initializationService;
    }
}