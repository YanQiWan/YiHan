package Commonality;

public class User implements java.io.Serializable{
	private String UserNumber;
	private String PassWord;
	private String UserSchool;
	private String UserMajor;
	private String UserNickname;
	public String getUserNickname() {
		return UserNickname;
	}
	public void setUserNickname(String userNickname) {
		UserNickname = userNickname;
	}
	public String getUserSchool() {
		return UserSchool;
	}
	public void setUserSchool(String userSchool) {
		UserSchool = userSchool;
	}
	public String getUserMajor() {
		return UserMajor;
	}
	public void setUserMajor(String userMajor) {
		UserMajor = userMajor;
	}
	public String getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(String userNumber) {
		UserNumber = userNumber;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public User(String UserNumber,String PassWord)
	{
		this.UserNumber=UserNumber;
		this.PassWord=PassWord;
	}
}
