package Oving5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class TwitterAccount {

	
	String brukerNavn;
	private Collection<TwitterAccount> follows = new ArrayList<TwitterAccount>();
	private Collection<TwitterAccount> followers = new ArrayList<TwitterAccount>();
	
	private List<Tweet> tweets = new ArrayList<Tweet>();
	
	
	public TwitterAccount(String brukerNavn) {
		this.brukerNavn = brukerNavn;
	}
	
	public String getUserName() {
		return this.brukerNavn;
	}
	
	public void follow(TwitterAccount acc) {
		if(this == acc) {
			throw new IllegalArgumentException("Kan ikke følge seg selv");
			}
		if(acc.followers.contains(this)) {
			throw new IllegalArgumentException("Du følger brukeren allerede");
		}else {
			acc.followers.add(this);
			this.follows.add(acc);
			
			for(TwitterAccount bruker: acc.followers) {
				System.out.println("Brukeren blir nå fulgt av: " + bruker );
			}
		}
	}
	
	
	public void unFollow(TwitterAccount acc) {
		if(this == acc) {
			throw new IllegalArgumentException("Kan ikke unfollowe seg selv");
		}
		
		if(!acc.followers.contains(this)) {
			throw new IllegalArgumentException("Du følger ikke brukeren");
		}else {
			acc.followers.remove(this);
			this.follows.remove(acc);
		}
	}
	
	public boolean isFollowing(TwitterAccount acc) {
		return this.follows.contains(acc);
		}
	
	public boolean isFollowedBy(TwitterAccount acc) {
		return this.followers.contains(acc);
	}
	
	public void tweet(String tekst) {
		Tweet newTweet = new Tweet(this, tekst);
		tweets.add(newTweet);
	}
	
	public void retweet(Tweet tweet) {
		if(tweet.acc == this) {
			throw new IllegalArgumentException("Kan ikke retweete egen tweet");
		}else {
			Tweet newReTweet = new Tweet(this, tweet);
			tweets.add(newReTweet);
		}
	}
	
	public Tweet getTweet(int i) {
		return tweets.get(tweets.size() - 1);
	}
	
	public int getTweetCount() {
		return tweets.size();
	}
	
	public int getRetweetCount() {
		int count = 0;
		for(Tweet tweet : tweets) {
			count += tweet.getRetweetCount();
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		TwitterAccount t1 = new TwitterAccount("Per");
		TwitterAccount t2 = new TwitterAccount("Emma");
		t1.follow(t2);
		//t1.follow(t2);
		System.out.println(t1.isFollowing(t2));
		System.out.println(t2.isFollowedBy(t1));
	}
	
	
	
}
