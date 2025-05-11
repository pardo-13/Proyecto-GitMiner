package aiss.GitMiner.Controllers;

import aiss.GitMiner.Exceptions.NotFoundExceptionIssue;
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
            if(commit != null){
                Commit newCommit = commitRepository.save(commit);
                commits.add(newCommit);
            }
        }
        for(Issue issue : project.getIssues()) {
            List<Comment> comments = new ArrayList<>();
            Optional<User> OpAuthor = userRepository.findById(Integer.parseInt(issue.getAuthor().getId()));
            Optional<User> OpAssignee = userRepository.findById(Integer.parseInt(issue.getAssignee().getId()));
            User assignee = null;
            User author = null;
            if(OpAuthor.isPresent()){
                author = OpAuthor.get();
            }else{
                author = userRepository.save(issue.getAuthor());
            }
            if(OpAssignee.isPresent()){
                assignee = OpAssignee.get();
            }else{
                assignee = userRepository.save(issue.getAssignee());
            }

            if(issue.getComments().size() > 0) {
                for (Comment comment : issue.getComments()) {
                    Optional<User> OpComment = userRepository.findById(Integer.parseInt(comment.getAuthor().getId()));
                    User commentAuthor = null;
                    if(OpComment.isPresent()){
                        commentAuthor = OpComment.get();
                    }else{
                        commentAuthor = userRepository.save(comment.getAuthor());
                    }
                    comment.setAuthor(commentAuthor);
                    Comment newComment = commentRepository.save(comment);
                    comments.add(newComment);
                }
            }

            issue.setAssignee(assignee);
            issue.setAuthor(author);
            issue.setComments(comments);
            Issue newIssue = issueRepository.save(issue);
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

    @GetMapping("comment/{id}")
    public Comment getCommentById(@PathVariable int id) throws NotFoundException, NotFoundExceptionComment {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new NotFoundExceptionComment();
        }
        return comment.get();
    }

    @GetMapping("/comment")
    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    @GetMapping("/issue")
    public List<Issue> getAllIssues(){
        return issueRepository.findAll();
    }

    @GetMapping("/issue/{id}")
    public Issue getIssueById(@PathVariable int id) throws NotFoundException, NotFoundExceptionIssue {
        Optional<Issue> issue = issueRepository.findById(id);
        if (!issue.isPresent()) {
            throw new NotFoundExceptionIssue();
        }
        return issue.get();
    }

}
