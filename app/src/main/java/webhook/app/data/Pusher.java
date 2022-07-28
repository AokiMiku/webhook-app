package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pusher
{
	String email;
	String name;

	@JsonProperty ("email")
	public String getEmail ()
	{
		return this.email;
	}

	public void setEmail (String email)
	{
		this.email = email;
	}

	@JsonProperty ("name")
	public String getName ()
	{
		return this.name;
	}

	public void setName (String name)
	{
		this.name = name;
	}
}
