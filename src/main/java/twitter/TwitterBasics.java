package twitter;

public class TwitterBasics {
	
	public String propertiesFileLocation() {
		String location = "C:\\Users\\satya\\Desktop\\Eclipse Workspace\\Framework57\\environment.properties";
		return location;
	}
	
	public String twitterBaseURI() {
		String baseuri = "https://api.twitter.com/1.1/statuses";
		return baseuri;
	}
	
	public String twitterFollowersURI() {
		String baseuri = "https://api.twitter.com/1.1/followers";
		return baseuri;
	}
	
	public String twitterFriendsURI() {
		String baseuri = "https://api.twitter.com/1.1/friends";
		return baseuri;
	}
	
}
