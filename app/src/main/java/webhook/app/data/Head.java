package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Head {
	String label;
	String ref;
	String sha;
	User user;
	Repo repo;

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
}
