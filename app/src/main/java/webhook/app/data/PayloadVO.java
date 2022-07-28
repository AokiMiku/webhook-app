package webhook.app.data;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PayloadVO {
	String after;
	String before;
	ArrayList<Commit> commits;
	String compare;
	boolean created;
	boolean deleted;
	boolean forced;
	HeadCommit head_commit;
	Pusher pusher;
	String ref;
	Repository repository;
	String label;
	String sha;
	User user;
	Repo repo;
	String action;
	int number;
	PullRequest pull_request;
	Sender sender;

	@JsonProperty ("after")
	public String getAfter () {
		return this.after;
	}

	public void setAfter (String after) {
		this.after = after;
	}

	@JsonProperty ("before")
	public String getBefore () {
		return this.before;
	}

	public void setBefore (String before) {
		this.before = before;
	}

	@JsonProperty ("commits")
	public ArrayList<Commit> getCommits () {
		return this.commits;
	}

	public void setCommits (ArrayList<Commit> commits) {
		this.commits = commits;
	}

	@JsonProperty ("compare")
	public String getCompare () {
		return this.compare;
	}

	public void setCompare (String compare) {
		this.compare = compare;
	}

	@JsonProperty ("created")
	public boolean getCreated () {
		return this.created;
	}

	public void setCreated (boolean created) {
		this.created = created;
	}

	@JsonProperty ("deleted")
	public boolean getDeleted () {
		return this.deleted;
	}

	public void setDeleted (boolean deleted) {
		this.deleted = deleted;
	}

	@JsonProperty ("forced")
	public boolean getForced () {
		return this.forced;
	}

	public void setForced (boolean forced) {
		this.forced = forced;
	}

	@JsonProperty ("head_commit")
	public HeadCommit getHead_commit () {
		return this.head_commit;
	}

	public void setHead_commit (HeadCommit head_commit) {
		this.head_commit = head_commit;
	}

	@JsonProperty ("pusher")
	public Pusher getPusher () {
		return this.pusher;
	}

	public void setPusher (Pusher pusher) {
		this.pusher = pusher;
	}

	@JsonProperty ("ref")
	public String getRef () {
		return this.ref;
	}

	public void setRef (String ref) {
		this.ref = ref;
	}

	@JsonProperty ("repository")
	public Repository getRepository () {
		return this.repository;
	}

	public void setRepository (Repository repository) {
		this.repository = repository;
	}

	@JsonProperty ("label")
	public String getLabel () {
		return this.label;
	}

	public void setLabel (String label) {
		this.label = label;
	}

	@JsonProperty ("sha")
	public String getSha () {
		return this.sha;
	}

	public void setSha (String sha) {
		this.sha = sha;
	}

	@JsonProperty ("user")
	public User getUser () {
		return this.user;
	}

	public void setUser (User user) {
		this.user = user;
	}

	@JsonProperty ("repo")
	public Repo getRepo () {
		return this.repo;
	}

	public void setRepo (Repo repo) {
		this.repo = repo;
	}

	@JsonProperty ("action")
	public String getAction () {
		return this.action;
	}

	public void setAction (String action) {
		this.action = action;
	}

	@JsonProperty ("number")
	public int getNumber () {
		return this.number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	@JsonProperty ("pull_request")
	public PullRequest getPull_request () {
		return this.pull_request;
	}

	public void setPull_request (PullRequest pull_request) {
		this.pull_request = pull_request;
	}

	@JsonProperty ("sender")
	public Sender getSender () {
		return this.sender;
	}

	public void setSender (Sender sender) {
		this.sender = sender;
	}
}

