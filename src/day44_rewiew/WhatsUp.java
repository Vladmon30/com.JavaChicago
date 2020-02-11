package day44_rewiew;

public class WhatsUp {
public static void main(String[] args) {
	Post p1= new Post();
	System.out.println(p1.getPostId());
	p1.setBody("Today is a good day!!!");
	p1.setDate("November 11, 2018");
	p1.postInfo();
	FacebookUser user1= new FacebookUser("jamie32", "123");
	user1.post(p1);
    System.out.println(user1.posts.size());
}
}
