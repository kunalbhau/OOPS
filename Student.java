public class Student
{
	String name;
	int id ;
	String college;
	long phno;
	
	public Student()
	{
	}
	public Student(String name, int id, String college, long phno)
	{
		super();
		this.name = name;
		this.id =id;
		this.college = college;
		this.phno =phno;
	}
	public String toString()
	{
		return "[name: "+name+", id: "+id+", college: "+college+", phno: "+phno+"]";
	}
	public boolean equals(Object i)
	{
		Student s = (Student )i;   // downcasting
		if(this.name == s.name && this.id== s.id && this.college == s.college && this.phno ==s.phno)
		{
return true;
		}
return false;
	}
}	