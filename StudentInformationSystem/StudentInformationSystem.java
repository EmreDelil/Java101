package StudentInformationSystem;

public class StudentInformationSystem {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Prof. Ali","EEM","0500");
		Teacher t2 = new Teacher("Prof. Mahmut","SST","0501");
		Teacher t3 = new Teacher("Prof. Nalan","CE","0502");
		
		Course c1 = new Course("Java","101","CE");
		c1.addTeacher(t3);
		
		Course c2 = new Course("Circle Theory","102","EEM");
		c2.addTeacher(t2);
		
		Course c3 = new Course("History","103","SST");
		c3.addTeacher(t2);
		
		Student s1 = new Student("Mahmut Lo","268","4",c1,c2,c3);
		s1.addBulkExamNote(76, 62, 54);
		s1.isPass();
		
		Student s2 = new Student("Jumbo Garides","426","3",c1,c2,c3);
		s2.addBulkExamNote(31, 42, 74);
		s2.isPass();
		
		Student s3 = new Student("Güdük Necmi", "653", "1",c1,c2,c3);
		s3.addBulkExamNote(64, 120, 16);
		s3.isPass();
		
	}

}
