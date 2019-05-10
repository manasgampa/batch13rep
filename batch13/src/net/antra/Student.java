package net.antra;

public class Student{
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		
		Student st1=(Student)obj;
		if(st1.id==this.id && st1.name.equals(this.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	/*public int hashCode() {
		
		return 123;
	}*/
	
	/*public String toString() {
		
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
	//static int marks=54;
	
	
	/*public void m2() {
		
		System.out.println("in m2:"+id);
	}*/

}
