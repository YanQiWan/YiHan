package Commonality;

@SuppressWarnings("serial")
public class UserComment implements java.io.Serializable{
	private String CommentContent;
	private String CommentTime;
	private String UserNickname;
	public UserComment(String CommentContent,String CommentTime,String UserNickname)
	{
		this.CommentContent=CommentContent;
		this.CommentTime=CommentTime;
		this.UserNickname=UserNickname;
	}
	public UserComment(){}
	public String getCommentContent() {
		return CommentContent;
	}
	public void setCommentContent(String commentContent) {
		CommentContent = commentContent;
	}
	public String getCommentTime() {
		return CommentTime;
	}
	public void setCommentTime(String commentTime) {
		CommentTime = commentTime;
	}
	public String getUserNickname() {
		return UserNickname;
	}
	public void setUserNickname(String userNickname) {
		UserNickname = userNickname;
	}
	
}
