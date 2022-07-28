package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
	Self self;
	Html html;
	Issue issue;
	Comments comments;
	ReviewComments review_comments;
	ReviewComment review_comment;
	Commits commits;
	Statuses statuses;

	@JsonProperty ("self")
	public Self getSelf () {
		return this.self;
	}

	public void setSelf (Self self) {
		this.self = self;
	}

	@JsonProperty ("html")
	public Html getHtml () {
		return this.html;
	}

	public void setHtml (Html html) {
		this.html = html;
	}

	@JsonProperty ("issue")
	public Issue getIssue () {
		return this.issue;
	}

	public void setIssue (Issue issue) {
		this.issue = issue;
	}

	@JsonProperty ("comments")
	public Comments getComments () {
		return this.comments;
	}

	public void setComments (Comments comments) {
		this.comments = comments;
	}

	@JsonProperty ("review_comments")
	public ReviewComments getReview_comments () {
		return this.review_comments;
	}

	public void setReview_comments (ReviewComments review_comments) {
		this.review_comments = review_comments;
	}

	@JsonProperty ("review_comment")
	public ReviewComment getReview_comment () {
		return this.review_comment;
	}

	public void setReview_comment (ReviewComment review_comment) {
		this.review_comment = review_comment;
	}

	@JsonProperty ("commits")
	public Commits getCommits () {
		return this.commits;
	}

	public void setCommits (Commits commits) {
		this.commits = commits;
	}

	@JsonProperty ("statuses")
	public Statuses getStatuses () {
		return this.statuses;
	}

	public void setStatuses (Statuses statuses) {
		this.statuses = statuses;
	}
}
