package domain;

public class User {

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public int getNickname() {
		return nickname;
	}
	public void setNickname(int nickname) {
		this.nickname = nickname;
	}
	public String getAuthorityguid() {
		return authorityguid;
	}
	public void setAuthorityguid(String authorityguid) {
		this.authorityguid = authorityguid;
	}
	private int uid;
	private String uname;
	private String upassword;
	private int nickname;
	private String authorityguid;
}
