package day44_rewiew;

import java.util.Random;

public class Post {
	public static void main(String[] args) {

		/*
		 * 1.Create class Post. Instance variables: body, likes, date, postID(int)
		 * Encapsulate all the instance variables and provide public getters and
		 * setters.* Create no argument constructor and generate integer between 0 to
		 * 3000 and set the random value to postID
		 * 
		 * 
		 */

	}

	private String body;
	private int likes;
	private String date;
	private int postId;

	/*
	 * Create no argument constructor and generate integer between 0 to 3000 and set
	 * the random value to postID
	 */

	public Post() {
		Random r = new Random();
		postId = r.nextInt(3000);
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPostId() {
		return postId;
	}

	/*
	 * 2. Create a method postInfo in Post class. Method should print out details in
	 * the format below: Body: %body Likes: %likes Date: %date
	 */

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public void postInfo() {

		System.out.println("Body :" + body);
		System.out.println("Likes: " + likes);
		System.out.println("Date: " + date);
	}

	/*
	 * 5. Create static method seeAllFacebookUsers. This method doesn’t accept
	 * anything. Simply prints out each facebook user’s information.
	 */
}

