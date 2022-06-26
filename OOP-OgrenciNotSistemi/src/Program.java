public class Program {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ayse","+905555555555","CHE");
        Teacher t2 = new Teacher("Murat","+905555555554","MAT");
        Teacher t3 = new Teacher("Mustafa","+905555555454","PHY");
        Course math101 = new Course("MATH 101","101","MAT");
        Course che101 = new Course("CHEMISTRY 101","101","CHE");
        Course phy101 = new Course("PHYSIC 101","101","PHY");

        math101.addTeacher(t2);
        che101.addTeacher(t1);
        phy101.addTeacher(t3);

        Student s1 = new Student(math101,phy101,che101,"Mehmet","000001");
        Student s2 = new Student(math101,phy101,che101,"Ali","000002");
        Student s3 = new Student(math101,phy101,che101,"Yasemin","000003");

        s1.addBulkExamNote(50,50,50);
        s2.addBulkExamNote(100,95,30);
        s3.addBulkExamNote(20,45,34);

        s1.addBulkVerbalGrade(45,77,80);
        s2.addBulkVerbalGrade(79,85,100);
        s3.addBulkVerbalGrade(100,100,100);

        s1.isPassed();
        s2.isPassed();
        s3.isPassed();





    }
}
