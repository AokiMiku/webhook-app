package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class PullRequest {
	String url;
	int id;
	String node_id;
	String html_url;
	String diff_url;
	String patch_url;
	String issue_url;
	int number;
	String state;
	boolean locked;
	String title;
	User user;
	Object body;
	Date created_at;
	Date updated_at;
	Object closed_at;
	Object merged_at;
	Object merge_commit_sha;
	Object assignee;
	ArrayList<Object> assignees;
	ArrayList<Object> requested_reviewers;
	ArrayList<Object> requested_teams;
	ArrayList<Object> labels;
	Object milestone;
	boolean draft;
	String commits_url;
	String review_comments_url;
	String review_comment_url;
	String comments_url;
	String statuses_url;
	Head head;
	Base base;
	Links _links;
	String author_association;
	Object auto_merge;
	Object active_lock_reason;
	boolean merged;
	Object mergeable;
	Object rebaseable;
	String mergeable_state;
	Object merged_by;
	int comments;
	int review_comments;
	boolean maintainer_can_modify;
	int commits;
	int additions;
	int deletions;
	int changed_files;

	@JsonProperty ("url")
	public String getUrl () {
		return this.url;
	}

	public void setUrl (String url) {
		this.url = url;
	}

	@JsonProperty ("id")
	public int getId () {
		return this.id;
	}

	public void setId (int id) {
		this.id = id;
	}

	@JsonProperty ("node_id")
	public String getNode_id () {
		return this.node_id;
	}

	public void setNode_id (String node_id) {
		this.node_id = node_id;
	}

	@JsonProperty ("html_url")
	public String getHtml_url () {
		return this.html_url;
	}

	public void setHtml_url (String html_url) {
		this.html_url = html_url;
	}

	@JsonProperty ("diff_url")
	public String getDiff_url () {
		return this.diff_url;
	}

	public void setDiff_url (String diff_url) {
		this.diff_url = diff_url;
	}

	@JsonProperty ("patch_url")
	public String getPatch_url () {
		return this.patch_url;
	}

	public void setPatch_url (String patch_url) {
		this.patch_url = patch_url;
	}

	@JsonProperty ("issue_url")
	public String getIssue_url () {
		return this.issue_url;
	}

	public void setIssue_url (String issue_url) {
		this.issue_url = issue_url;
	}

	@JsonProperty ("number")
	public int getNumber () {
		return this.number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	@JsonProperty ("state")
	public String getState () {
		return this.state;
	}

	public void setState (String state) {
		this.state = state;
	}

	@JsonProperty ("locked")
	public boolean getLocked () {
		return this.locked;
	}

	public void setLocked (boolean locked) {
		this.locked = locked;
	}

	@JsonProperty ("title")
	public String getTitle () {
		return this.title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	@JsonProperty ("user")
	public User getUser () {
		return this.user;
	}

	public void setUser (User user) {
		this.user = user;
	}

	@JsonProperty ("body")
	public Object getBody () {
		return this.body;
	}

	public void setBody (Object body) {
		this.body = body;
	}

	@JsonProperty ("created_at")
	public Date getCreated_at () {
		return this.created_at;
	}

	public void setCreated_at (Date created_at) {
		this.created_at = created_at;
	}

	@JsonProperty ("updated_at")
	public Date getUpdated_at () {
		return this.updated_at;
	}

	public void setUpdated_at (Date updated_at) {
		this.updated_at = updated_at;
	}

	@JsonProperty ("closed_at")
	public Object getClosed_at () {
		return this.closed_at;
	}

	public void setClosed_at (Object closed_at) {
		this.closed_at = closed_at;
	}

	@JsonProperty ("merged_at")
	public Object getMerged_at () {
		return this.merged_at;
	}

	public void setMerged_at (Object merged_at) {
		this.merged_at = merged_at;
	}

	@JsonProperty ("merge_commit_sha")
	public Object getMerge_commit_sha () {
		return this.merge_commit_sha;
	}

	public void setMerge_commit_sha (Object merge_commit_sha) {
		this.merge_commit_sha = merge_commit_sha;
	}

	@JsonProperty ("assignee")
	public Object getAssignee () {
		return this.assignee;
	}

	public void setAssignee (Object assignee) {
		this.assignee = assignee;
	}

	@JsonProperty ("assignees")
	public ArrayList<Object> getAssignees () {
		return this.assignees;
	}

	public void setAssignees (ArrayList<Object> assignees) {
		this.assignees = assignees;
	}

	@JsonProperty ("requested_reviewers")
	public ArrayList<Object> getRequested_reviewers () {
		return this.requested_reviewers;
	}

	public void setRequested_reviewers (ArrayList<Object> requested_reviewers) {
		this.requested_reviewers = requested_reviewers;
	}

	@JsonProperty ("requested_teams")
	public ArrayList<Object> getRequested_teams () {
		return this.requested_teams;
	}

	public void setRequested_teams (ArrayList<Object> requested_teams) {
		this.requested_teams = requested_teams;
	}

	@JsonProperty ("labels")
	public ArrayList<Object> getLabels () {
		return this.labels;
	}

	public void setLabels (ArrayList<Object> labels) {
		this.labels = labels;
	}

	@JsonProperty ("milestone")
	public Object getMilestone () {
		return this.milestone;
	}

	public void setMilestone (Object milestone) {
		this.milestone = milestone;
	}

	@JsonProperty ("draft")
	public boolean getDraft () {
		return this.draft;
	}

	public void setDraft (boolean draft) {
		this.draft = draft;
	}

	@JsonProperty ("commits_url")
	public String getCommits_url () {
		return this.commits_url;
	}

	public void setCommits_url (String commits_url) {
		this.commits_url = commits_url;
	}

	@JsonProperty ("review_comments_url")
	public String getReview_comments_url () {
		return this.review_comments_url;
	}

	public void setReview_comments_url (String review_comments_url) {
		this.review_comments_url = review_comments_url;
	}

	@JsonProperty ("review_comment_url")
	public String getReview_comment_url () {
		return this.review_comment_url;
	}

	public void setReview_comment_url (String review_comment_url) {
		this.review_comment_url = review_comment_url;
	}

	@JsonProperty ("comments_url")
	public String getComments_url () {
		return this.comments_url;
	}

	public void setComments_url (String comments_url) {
		this.comments_url = comments_url;
	}

	@JsonProperty ("statuses_url")
	public String getStatuses_url () {
		return this.statuses_url;
	}

	public void setStatuses_url (String statuses_url) {
		this.statuses_url = statuses_url;
	}

	@JsonProperty ("head")
	public Head getHead () {
		return this.head;
	}

	public void setHead (Head head) {
		this.head = head;
	}

	@JsonProperty ("base")
	public Base getBase () {
		return this.base;
	}

	public void setBase (Base base) {
		this.base = base;
	}

	@JsonProperty ("_links")
	public Links get_links () {
		return this._links;
	}

	public void set_links (Links _links) {
		this._links = _links;
	}

	@JsonProperty ("author_association")
	public String getAuthor_association () {
		return this.author_association;
	}

	public void setAuthor_association (String author_association) {
		this.author_association = author_association;
	}

	@JsonProperty ("auto_merge")
	public Object getAuto_merge () {
		return this.auto_merge;
	}

	public void setAuto_merge (Object auto_merge) {
		this.auto_merge = auto_merge;
	}

	@JsonProperty ("active_lock_reason")
	public Object getActive_lock_reason () {
		return this.active_lock_reason;
	}

	public void setActive_lock_reason (Object active_lock_reason) {
		this.active_lock_reason = active_lock_reason;
	}

	@JsonProperty ("merged")
	public boolean getMerged () {
		return this.merged;
	}

	public void setMerged (boolean merged) {
		this.merged = merged;
	}

	@JsonProperty ("mergeable")
	public Object getMergeable () {
		return this.mergeable;
	}

	public void setMergeable (Object mergeable) {
		this.mergeable = mergeable;
	}

	@JsonProperty ("rebaseable")
	public Object getRebaseable () {
		return this.rebaseable;
	}

	public void setRebaseable (Object rebaseable) {
		this.rebaseable = rebaseable;
	}

	@JsonProperty ("mergeable_state")
	public String getMergeable_state () {
		return this.mergeable_state;
	}

	public void setMergeable_state (String mergeable_state) {
		this.mergeable_state = mergeable_state;
	}

	@JsonProperty ("merged_by")
	public Object getMerged_by () {
		return this.merged_by;
	}

	public void setMerged_by (Object merged_by) {
		this.merged_by = merged_by;
	}

	@JsonProperty ("comments")
	public int getComments () {
		return this.comments;
	}

	public void setComments (int comments) {
		this.comments = comments;
	}

	@JsonProperty ("review_comments")
	public int getReview_comments () {
		return this.review_comments;
	}

	public void setReview_comments (int review_comments) {
		this.review_comments = review_comments;
	}

	@JsonProperty ("maintainer_can_modify")
	public boolean getMaintainer_can_modify () {
		return this.maintainer_can_modify;
	}

	public void setMaintainer_can_modify (boolean maintainer_can_modify) {
		this.maintainer_can_modify = maintainer_can_modify;
	}

	@JsonProperty ("commits")
	public int getCommits () {
		return this.commits;
	}

	public void setCommits (int commits) {
		this.commits = commits;
	}

	@JsonProperty ("additions")
	public int getAdditions () {
		return this.additions;
	}

	public void setAdditions (int additions) {
		this.additions = additions;
	}

	@JsonProperty ("deletions")
	public int getDeletions () {
		return this.deletions;
	}

	public void setDeletions (int deletions) {
		this.deletions = deletions;
	}

	@JsonProperty ("changed_files")
	public int getChanged_files () {
		return this.changed_files;
	}

	public void setChanged_files (int changed_files) {
		this.changed_files = changed_files;
	}
}
