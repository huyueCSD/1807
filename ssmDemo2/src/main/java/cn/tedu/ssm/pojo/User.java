package cn.tedu.ssm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private  Integer id;
	private String address;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
