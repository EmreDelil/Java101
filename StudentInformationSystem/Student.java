package StudentInformationSystem;

public class Student {
	Course c1;
	Course c2;
	Course c3;
	String name;
	String stuNo;
	String classes;
	double average;
	boolean isPass;
	
	Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.isPass = false;		
	}
	
	void addBulkExamNote(int note1,int note2,int note3) {
		if(note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
			System.out.println(c1.name + "'s note entry successful.");
		}else {
			this.c1.note = 0;
			System.out.println("Notes must be between 0 and 100.");
		}
		if(note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
			System.out.println(c2.name + "'s note entry successful.");
		}else {
			this.c2.note = 0;
			System.out.println("Notes must be between 0 and 100.");
		}
		if(note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
			System.out.println(c3.name + "'s note entry successful.");
		}else {
			this.c3.note = 0;
			System.out.println("Notes must be between 0 and 100.");
		}
		System.out.println();
		printNote();
	}
	
	void isPass() {
		calcAverage();
		System.out.println("Your average is : " + this.average);
		if(this.average >= 60) {
			System.out.println("You pass the class !");
		}else {
			System.out.println("Unfortunately you fail the class.");
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
	}
	
	void calcAverage() {
		this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
	}
	
	void printNote() {
		System.out.println(this.c1.name + "'s note is\t\t: " + this.c1.note);
		System.out.println(this.c2.name + "'s note is\t: " + this.c2.note);
		System.out.println(this.c3.name + "'s note is\t: " + this.c3.note);
		System.out.println();
	}
	
}
