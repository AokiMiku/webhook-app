package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Base {
	String label;
	String ref;
	String sha;
	User user;
	Repo repo;
	String action;
	int number;
	PullRequest pull_request;
	Repository repository;
	Sender sender;

	@JsonProperty ("label")
	public String getLabel () {
		return this.label;
	}

	public void setLabel (String label) {
		this.label = label;
	}

	@JsonProperty ("ref")
	public String getRef () {
		return this.ref;
	}

	public void setRef (String ref) {
		this.ref = ref;
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

	@JsonProperty ("repository")
	public Repository getRepository () {
		return this.repository;
	}

	public void setRepository (Repository repository) {
		this.repository = repository;
	}

	@JsonProperty ("sender")
	public Sender getSender () {
		return this.sender;
	}

	public void setSender (Sender sender) {
		this.sender = sender;
	}
}
