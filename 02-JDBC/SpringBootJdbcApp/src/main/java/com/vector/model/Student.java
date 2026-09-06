package com.vector.model;

public class Student {

	private int sid;
	private String sname;
	private int sage;
	private Double cgpa;

	public Student() {
		super();
	}

	public Student(int sid, String sname, int sage, double cgpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.cgpa = cgpa;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", cgpa=" + cgpa + "]";
	}

}
