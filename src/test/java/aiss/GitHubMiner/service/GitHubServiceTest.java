package aiss.GitHubMiner.service;

import aiss.GitHubMiner.model.issue.Issue;
import aiss.GitHubMiner.model.project.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GitHubServiceTest {
    String owner = "spring-projects";
    String repo = "spring-framework";
    @Autowired
    GitHubService gitHubService;
    @Test

    public void testGetProject(){
        Project project = gitHubService.getProject(owner, repo);
        assertNotNull(project);
        System.out.println(project);
    }

    @Test
    void getIssues() {
        Issue[] issues = gitHubService.getIssues(owner, repo,10,1);
        assertNotNull(issues);
        System.out.println("-------------------------------------------------");
        for(Issue issue : issues){
            System.out.println(
                    "Id:" + issue.getId() + "Title:" + issue.getTitle() + "Description: " + issue.getDescription()
            );
        }
        System.out.println(issues.length);
    }
}