package ourbusinessproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private EnterpriseProjectService enterpriseProjectService;
    public ProjectController(EnterpriseProjectService enterpriseProjectService) {
        this.enterpriseProjectService = enterpriseProjectService;
    }

    @JsonIgnore
    @RequestMapping("/projectsWithEnterprises")
    @ResponseBody
    public List<Project> findAllProjectsWithEnterprises() {
        
        List<Project>projects = enterpriseProjectService.findAllProjects();

        return projects;
    }
}
