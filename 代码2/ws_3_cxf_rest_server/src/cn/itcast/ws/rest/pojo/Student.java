package cn.itcast.ws.rest.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * <p>Title: Student.java</p>
 * <p>Description:学生实体类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日下午3:00:17
 * @version 1.0
 */
@XmlRootElement(name="student")//@XmlRootElement可以实现对象和XML数据之间的转换
public class Student {

	private long id;
	
	private String name;
	
	private Date birthday;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
