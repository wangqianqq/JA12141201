package serialize.obj;

import java.io.Serializable;

/*
 * �������л������ڴ��ж��󱣴��ڴ��̡����紫��
 * ������-->ת��ƽ̨�޹صĶ�����-->���浽���̡�
 * ʵ�֣����������ķ���/  ������Կ����ʹ��
 * 
 * 
 * ���󶼿������л���----��ͨ����ô��ɿ����л�����
 * no
 * Serizlizable
 * Externallizable
 * 
 * ���л����ڴ����-->IO
 * �����л���IO��--->�����ڴ桿p.person  pagexiex
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
