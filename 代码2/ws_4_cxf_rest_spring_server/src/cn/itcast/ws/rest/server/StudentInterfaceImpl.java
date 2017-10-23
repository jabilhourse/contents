package cn.itcast.ws.rest.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.itcast.ws.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentInterfaceImpl.java</p>
 * <p>Description:学生的实现类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日下午3:12:54
 * @version 1.0
 */
public class StudentInterfaceImpl implements StudentInterface {

	@Override
	public Student query(long id) {
		Student st = new Student();
		st.setId(110);
		st.setName("张三");
		st.setBirthday(new Date());
		return st;
	}

	@Override
	public List<Student> queryList(String name) {
		
		Student st = new Student();
		st.setId(110);
		st.setName("张三");
		st.setBirthday(new Date());
		
		Student st2 = new Student();
		st2.setId(120);
		st2.setName("李四");
		st2.setBirthday(new Date());
		
		List<Student> list = new ArrayList<Student>();
		list.add(st);
		list.add(st2);
		return list;
	}

}
