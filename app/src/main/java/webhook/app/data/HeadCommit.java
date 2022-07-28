package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class HeadCommit {
	ArrayList<String> added;
	Author author;
	Committer committer;
	boolean distinct;
	String id;
	String message;
	ArrayList<Object> modified;
	ArrayList<Object> removed;
	Date timestamp;
	String url;

	@JsonProperty ("added")
	public ArrayList<String> getAdded () {
		return this.added;
	}

	public void setAdded (ArrayList<String> added) {
		this.added = added;
	}

	@JsonProperty ("author")
	public Author getAuthor () {
		return this.author;
	}

	public void setAuthor (Author author) {
		this.author = author;
	}

	@JsonProperty ("committer")
	public Committer getCommitter () {
		return this.committer;
	}

	public void setCommitter (Committer committer) {
		this.committer = committer;
	}

	@JsonProperty ("distinct")
	public boolean getDistinct () {
		return this.distinct;
	}

	public void setDistinct (boolean distinct) {
		this.distinct = distinct;
	}

	@JsonProperty ("id")
	public String getId () {
		return this.id;
	}

	public void setId (String id) {
		this.id = id;
	}

	@JsonProperty ("message")
	public String getMessage () {
		return this.message;
	}

	public void setMessage (String message) {
		this.message = message;
	}

	@JsonProperty ("modified")
	public ArrayList<Object> getModified () {
		return this.modified;
	}

	public void setModified (ArrayList<Object> modified) {
		this.modified = modified;
	}

	@JsonProperty ("removed")
	public ArrayList<Object> getRemoved () {
		return this.removed;
	}

	public void setRemoved (ArrayList<Object> removed) {
		this.removed = removed;
	}

	@JsonProperty ("timestamp")
	public Date getTimestamp () {
		return this.timestamp;
	}

	public void setTimestamp (Date timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty ("url")
	public String getUrl () {
		return this.url;
	}

	public void setUrl (String url) {
		this.url = url;
	}
}
