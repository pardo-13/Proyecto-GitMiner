
package aiss.GitHubMiner.model.issue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "repository_url",
    "labels_url",
    "comments_url",
    "events_url",
    "html_url",
    "id",
    "node_id",
    "number",
    "title",
    "user",
    "labels",
    "state",
    "locked",
    "assignee",
    "assignees",
    "milestone",
    "comments",
    "created_at",
    "updated_at",
    "closed_at",
    "author_association",
    "type",
    "active_lock_reason",
    "draft",
    "pull_request",
    "body",
    "closed_by",
    "timeline_url",
    "performed_via_github_app",
    "state_reason"
})

public class Issue {

    @JsonProperty("url")
    private String url;
    @JsonProperty("repository_url")
    private String repositoryUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("title")
    private String title;
    @JsonProperty("user")
    private User user;
    @JsonProperty("labels")
    private List<Label> labels;
    @JsonProperty("state")
    private String state;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("assignee")
    private Object assignee;
    @JsonProperty("assignees")
    private List<Object> assignees;
    @JsonProperty("milestone")
    private Milestone milestone;
    @JsonProperty("comments")
    private Integer comments;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("author_association")
    private String authorAssociation;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("active_lock_reason")
    private Object activeLockReason;
    @JsonProperty("draft")
    private Boolean draft;
    @JsonProperty("pull_request")
    private PullRequest pullRequest;
    @JsonProperty("body")
    private String body;
    @JsonProperty("closed_by")
    private Object closedBy;
    @JsonProperty("timeline_url")
    private String timelineUrl;
    @JsonProperty("performed_via_github_app")
    private Object performedViaGithubApp;
    @JsonProperty("state_reason")
    private Object stateReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Issue withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @JsonProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Issue withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Issue withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Issue withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Issue withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Issue withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Issue withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Issue withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Issue withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Issue withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public Issue withUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public Issue withLabels(List<Label> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Issue withState(String state) {
        this.state = state;
        return this;
    }

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Issue withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Issue withAssignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    @JsonProperty("assignees")
    public List<Object> getAssignees() {
        return assignees;
    }

    @JsonProperty("assignees")
    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public Issue withAssignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    @JsonProperty("milestone")
    public Milestone getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Issue withMilestone(Milestone milestone) {
        this.milestone = milestone;
        return this;
    }

    @JsonProperty("comments")
    public Integer getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Issue withComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Issue withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Issue withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public Issue withClosedAt(Object closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @JsonProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public Issue withAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Issue withType(Object type) {
        this.type = type;
        return this;
    }

    @JsonProperty("active_lock_reason")
    public Object getActiveLockReason() {
        return activeLockReason;
    }

    @JsonProperty("active_lock_reason")
    public void setActiveLockReason(Object activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public Issue withActiveLockReason(Object activeLockReason) {
        this.activeLockReason = activeLockReason;
        return this;
    }

    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    @JsonProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public Issue withDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    @JsonProperty("pull_request")
    public PullRequest getPullRequest() {
        return pullRequest;
    }

    @JsonProperty("pull_request")
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public Issue withPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    public Issue withBody(String body) {
        this.body = body;
        return this;
    }

    @JsonProperty("closed_by")
    public Object getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(Object closedBy) {
        this.closedBy = closedBy;
    }

    public Issue withClosedBy(Object closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    @JsonProperty("timeline_url")
    public String getTimelineUrl() {
        return timelineUrl;
    }

    @JsonProperty("timeline_url")
    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    public Issue withTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
        return this;
    }

    @JsonProperty("performed_via_github_app")
    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    @JsonProperty("performed_via_github_app")
    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Issue withPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    @JsonProperty("state_reason")
    public Object getStateReason() {
        return stateReason;
    }

    @JsonProperty("state_reason")
    public void setStateReason(Object stateReason) {
        this.stateReason = stateReason;
    }

    public Issue withStateReason(Object stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Issue withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("repositoryUrl");
        sb.append('=');
        sb.append(((this.repositoryUrl == null)?"<null>":this.repositoryUrl));
        sb.append(',');
        sb.append("labelsUrl");
        sb.append('=');
        sb.append(((this.labelsUrl == null)?"<null>":this.labelsUrl));
        sb.append(',');
        sb.append("commentsUrl");
        sb.append('=');
        sb.append(((this.commentsUrl == null)?"<null>":this.commentsUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("locked");
        sb.append('=');
        sb.append(((this.locked == null)?"<null>":this.locked));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("authorAssociation");
        sb.append('=');
        sb.append(((this.authorAssociation == null)?"<null>":this.authorAssociation));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("activeLockReason");
        sb.append('=');
        sb.append(((this.activeLockReason == null)?"<null>":this.activeLockReason));
        sb.append(',');
        sb.append("draft");
        sb.append('=');
        sb.append(((this.draft == null)?"<null>":this.draft));
        sb.append(',');
        sb.append("pullRequest");
        sb.append('=');
        sb.append(((this.pullRequest == null)?"<null>":this.pullRequest));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("timelineUrl");
        sb.append('=');
        sb.append(((this.timelineUrl == null)?"<null>":this.timelineUrl));
        sb.append(',');
        sb.append("performedViaGithubApp");
        sb.append('=');
        sb.append(((this.performedViaGithubApp == null)?"<null>":this.performedViaGithubApp));
        sb.append(',');
        sb.append("stateReason");
        sb.append('=');
        sb.append(((this.stateReason == null)?"<null>":this.stateReason));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
