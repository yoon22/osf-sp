package com.osf.sp.ioc1;

public class Student {
	
	private Person p;
	//person 클래스 쓰려면 원래 항상 메모리 생성을 해야했자나
	//ioc.xml 이 앞으로 이걸 대신 해주기때문에 해줄일이 없어용. 
	public Student(Person p) {
		this.p = p;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Student [p=" + p + "]";
	}
}
