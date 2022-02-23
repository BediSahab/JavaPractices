package javaIOStreams.serialization;

import java.io.Serializable;

public class Student2 implements Serializable{
	private int rollNo;
	private String name;
	private String dept;
	private float avg;
	public static int Data=10;
	public transient int t;
	
	public Student2()
	{}
	public Student2(int rollNo, String name, String dept, float avg)
	{
		this.rollNo=rollNo;
		this.name= name;
		this.dept= dept;
		this.avg= avg;
		
	}
	public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll: "+rollNo+
                "\nName: "+name+
                "\nAverage: "+avg+
                "\nDept: "+dept+
                "\nData: "+Data+
                "\nTransient: "+t+"\n";
    }
}
