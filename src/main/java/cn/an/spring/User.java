package cn.an.spring;

public class User {

	private int id;
	private String name;
	private String pwd;
	private String from;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", from=" + from + ", age=" + age + "]";
	}
	
}
