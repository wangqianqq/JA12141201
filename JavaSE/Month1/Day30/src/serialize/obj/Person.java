package serialize.obj;

import java.io.Serializable;

/*
 * 对象序列化：把内存中对象保存在磁盘、网络传输
 * 【对象-->转成平台无关的二进制-->保存到磁盘】
 * 实现：对象与程序的分离/  对象可以跨程序使用
 * 
 * 
 * 对象都可以序列化吗？----普通类怎么变成可序列化的类
 * no
 * Serizlizable
 * Externallizable
 * 
 * 序列化：内存对象-->IO
 * 反序列化：IO流--->对象【内存】p.person  pagexiex
 * 
 * */
public class Person implements Serializable{

	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
