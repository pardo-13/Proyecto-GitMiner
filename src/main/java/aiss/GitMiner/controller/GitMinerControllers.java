package aiss.gitminer.controller;

import aiss.gitminer.exceptions.NotFoundExceptionIssue;
import aiss.gitminer.model.*;
import aiss.gitminer.repository.*;
import aiss.gitminer.exceptions.NotFoundException;
import aiss.gitminer.exceptions.NotFoundExceptionComment;
import aiss.gitminer.exceptions.NotFoundExceptionCommit;
import aiss.gitminer.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gitminer")
public class GitMinerControllers {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private CommitRepository commitRepository;
    @Autowired
    private IssueRepository issueRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommentRepository commentRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/projects")
    public Project createProject(@Valid @RequestBody Project project) {
       return projectRepository.save(new Project(project.getId(), project.getName(), project.getWebUrl(),
               project.getCommits(), project.getIssues()));
    }

    @GetMapping("/commits/{id}")
    public Commit getCommitById(@PathVariable String id) throws NotFoundException, NotFoundExceptionCommit {
        Optional<Commit> commit = commitRepository.findById(id);
        if (!commit.isPresent()) {
            throw new NotFoundExceptionCommit();
        }
        return commit.get();
    }

    @GetMapping("/commits")
    public List<Commit> getAllCommits(){
        return commitRepository.findAll();
        }

    @GetMapping("/comments/{id}")
    public Comment getCommentById(@PathVariable String id) throws NotFoundException, NotFoundExceptionComment {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new NotFoundExceptionComment();
        }
        return comment.get();
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    @GetMapping("/issues")
    public List<Issue> getAllIssues(){
        return issueRepository.findAll();
    }

    @GetMapping("/issues/{id}")
    public Issue getIssueById(@PathVariable String id) throws NotFoundException, NotFoundExceptionIssue {
        Optional<Issue> issue = issueRepository.findById(id);
        if (!issue.isPresent()) {
            throw new NotFoundExceptionIssue();
        }
        return issue.get();
    }

}
