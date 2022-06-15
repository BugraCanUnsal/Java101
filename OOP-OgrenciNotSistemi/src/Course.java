public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double averageNote;
    double examNote;
    double verbalGrade;


    public  Course(Course course){
        this.name = course.name;
        this.code = course.code;
        this.prefix = course.prefix;
        this.examNote = 0;
        this.verbalGrade = 0;
        this.averageNote = 0;
    }

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalGrade = 0;
        this.averageNote = 0;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.profession.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Ogretmenin uzmanligi bu ders ile uyusmuyor!");
        }
    }
    public void printTeacher(){
        this.teacher.print();
    }




}
