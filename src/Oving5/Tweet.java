package Oving5;

public class Tweet {
	
	TwitterAccount acc;
	String tekst;
	Tweet tweet;
	public int retweet;
	
	public Tweet(TwitterAccount acc, String tekst) {
		this.acc = acc;
		this.tekst = tekst;
	}
	
	public Tweet(TwitterAccount acc, Tweet tweet) {
		if(tweet.acc == this.acc) {
			throw new IllegalArgumentException("Kan ikke reetweete egen tweet");
		}else {
			this.acc = acc;
			this.tweet = tweet;
			retweet++;
		}
	}
	
	public String getText() {
		return this.tekst;
	}
	
	public TwitterAccount getOwner() {
		return this.acc;
	}
	
	public Tweet getOriginalTweet() {
		return this.tweet;
	}
	
	public int getRetweetCount() {
		return this.retweet;
	}
	

	public static void main(String[] args) {

	}

}
