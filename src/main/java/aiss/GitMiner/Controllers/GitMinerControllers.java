package aiss.GitMiner.Controllers;

import aiss.GitMiner.Models.*;
import aiss.GitMiner.Repository.*;
import aiss.GitMiner.Exceptions.NotFoundException;
import aiss.GitMiner.Exceptions.NotFoundExceptionComment;
import aiss.GitMiner.Exceptions.NotFoundExceptionCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("gitminer/projects")
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
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        List<Commit> commits = new ArrayList<>();
        List<Issue> issues = new ArrayList<>();
        for (Commit commit : project.getCommits()) {
            Commit newCommit = commitRepository.save(commit);
            commits.add(newCommit);
        }
        for(Issue issue : project.getIssues()) {
            List<Comment> comments = new ArrayList<>();
            User assignee = userRepository.save(issue.getAssignee());
            User author = userRepository.save(issue.getAuthor());
            if(issue.getComments().size() > 0) {
                for (Comment comment : issue.getComments()) {
                    User commentAuthor = userRepository.save(comment.getAuthor());
                    Comment newComment = commentRepository.save(comment);
                    newComment.setAuthor(commentAuthor);
                    comments.add(newComment);
                }
            }
            Issue newIssue = issueRepository.save(issue);
            newIssue.setAssignee(assignee);
            newIssue.setAuthor(author);
            newIssue.setComments(comments);
            issues.add(newIssue);
        }

        Project newProject = new Project();
        newProject.setName(project.getName());
        newProject.setId(project.getId());
        newProject.setCommits(commits);
        newProject.setIssues(issues);
        newProject.setWebUrl(project.getWebUrl());
        return newProject;
    }

    @GetMapping("/{id}")
    public Commit getCommitById(@PathVariable int id) throws NotFoundException, NotFoundExceptionCommit {
        Optional<Commit> commit = commitRepository.findById(id);
        if (!commit.isPresent()) {
            throw new NotFoundExceptionCommit();
        }
        return commit.get();
    }

    @GetMapping
    public List<Commit> getAllCommits(){
        return commitRepository.findAll();
        }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable int id) throws NotFoundException, NotFoundExceptionComment {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new NotFoundExceptionComment();
        }
        return comment.get();
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }


}
