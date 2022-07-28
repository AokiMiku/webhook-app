package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statuses {
	String href;

	@JsonProperty ("href")
	public String getHref () {
		return this.href;
	}

	public void setHref (String href) {
		this.href = href;
	}
}
