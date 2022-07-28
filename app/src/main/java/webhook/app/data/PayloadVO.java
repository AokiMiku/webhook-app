package webhook.app.data;


import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

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

}

