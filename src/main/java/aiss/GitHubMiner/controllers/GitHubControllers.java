package aiss.GitHubMiner.controllers;

import aiss.GitHubMiner.model.issue.Issue;
import aiss.GitHubMiner.model.project.Project;
import aiss.GitHubMiner.service.GitHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/{owner}/{repoName}")
public class GitHubControllers {

    @Autowired
    GitHubService gitHubService;
    @PostMapping
    public Project getData(@PathVariable String owner, @PathVariable String repoName,
                         @RequestParam(required = false, defaultValue = "20") Integer sinceIssues,
                         @RequestParam(required = false, defaultValue = "2") Integer maxPages) {
        Project project = gitHubService.getProject(owner, repoName);
        System.out.println(project);
        Issue[] issues = gitHubService.getIssues(owner,repoName,sinceIssues,maxPages);
        List<Issue> issueList = new ArrayList<>();
        for(Issue issue : issues) {
            issueList.add(issue);
        }
        project.setIssues(issueList);
        return project;

    }

}
