package customer;

import cafe.Category;

public class member {
	
	private String id;
	private String email;
	private String password;
	private String tel;
	private String nickName; 
	private int mid; // 회원번호
	
	public member() {}
	public member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public member(String id, String email, String password, String tel,
				  String nickName, int mid) {
		this.id=id;
		this.email=email;
		this.password=password;
		this.tel=tel;
		this.nickName=nickName;
		this.mid=mid;
	}
	
	@Override
	public String toString() {
		return id+" "+password;
	}
	@Override
	public boolean equals(Object o) {
		member tmp = (member)o;
		if( this.id.equals(tmp.id) ) { // 입력한 아이디와 일치한가? 
			return this.password.equals(tmp.password);// 입력한 비밀번호와 일치한가?
		}
		return false; // 아이디가 일치하지않으면 false 반환
	}
	
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
