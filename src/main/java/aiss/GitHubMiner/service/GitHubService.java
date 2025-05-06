package aiss.GitHubMiner.service;

import aiss.GitHubMiner.model.issue.Issue;
import aiss.GitHubMiner.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {
    @Autowired
    RestTemplate restTemplate;
    public Project getProject(String owner, String repo){
        String url = "https://api.github.com/repos/" + owner + "/" + repo;
        Project project = restTemplate.getForObject(url, Project.class);
        return project;
    }
    public Issue[] getIssues(String owner, String repo){
        String url = "https://api.github.com/repos/" + owner + "/" + repo + "/issues";
        Issue[] issues = restTemplate.getForObject(url, Issue[].class);
        return issues;
    }
}
