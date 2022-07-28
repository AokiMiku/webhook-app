package webhook.app.data;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Author
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
