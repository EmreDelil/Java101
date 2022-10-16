package StudentInformationSystem;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			printTeacher();
		}else {
			System.out.println(teacher.name + "'s branch does not match the prefix of " + this.name);
			System.out.println();
			System.out.println("=====================================");
			System.out.println();
		}
	}
	
	void printTeacher() {
		System.out.println("Name of teacher \t: " + teacher.name);
		System.out.println("Branch of teacher\t: " + teacher.branch);
		System.out.println("Phone number of teacher\t: " + teacher.mobilePno);
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
	}
}
