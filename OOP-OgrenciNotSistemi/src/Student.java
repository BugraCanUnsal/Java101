public class Student {

    Course math;
    Course phy;
    Course che;

    String name;
    String stuNo;

    double average;
    boolean isPassed;

    public Student(Course math, Course phy, Course che, String name, String stuNo) {
        this.math = new Course(math);
        this.phy = new Course(phy);
        this.che = new Course(che);
        this.name = name;
        this.stuNo = stuNo;
    }

    public void addBulkExamNote(int phyExamNote, int matExamNote, int cheExamNote) {
        if (phyExamNote >= 0 && phyExamNote <= 100) {
            this.phy.examNote = phyExamNote * 0.8;
        }
        if (matExamNote >= 0 && matExamNote <= 100) {
            this.math.examNote = matExamNote * 0.8;
        }
        if (cheExamNote >= 0 && cheExamNote <= 100) {
            this.che.examNote = cheExamNote * 0.8;
        }
    }

    public void addBulkVerbalGrade(int phyVerbalGrade, int matVerbalGrade, int cheVerbalGrade) {
        if (phyVerbalGrade >= 0 && phyVerbalGrade <= 100) {
            this.phy.verbalGrade = phyVerbalGrade * 0.2;
        }
        if (matVerbalGrade >= 0 && matVerbalGrade <= 100) {
            this.math.verbalGrade = matVerbalGrade * 0.2;
        }
        if (cheVerbalGrade >= 0 && cheVerbalGrade <= 100) {
            this.che.verbalGrade = cheVerbalGrade * 0.2;
        }
    }

    public void calculateCourseAverageNote(){
        this.math.averageNote = this.math.examNote+this.math.verbalGrade;
        this.phy.averageNote = this.phy.examNote + this.phy.verbalGrade;
        this.che.averageNote = this.che.examNote + this.che.verbalGrade;
    }

    public void calculateAverage() {
        this.average = (this.math.averageNote+this.che.averageNote+this.phy.averageNote) / 3;
    }

    public boolean isCheckPassed() {
        calculateCourseAverageNote();
        calculateAverage();
        return this.average > 55;
    }

    public void isPassed() {
        isCheckPassed();
        if (this.math.averageNote == 0 || this.che.averageNote == 0 || this.phy.averageNote == 0){
            System.out.println("Notlar tam olarak girilmemis!");
        }else {
            this.isPassed = isCheckPassed();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPassed){
                System.out.println("Sinifi Gecti.");
            }else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }
    public void printNote(){
        System.out.println("----------------");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik notu : " + this.math.averageNote);
        System.out.println("Fizik notu : " + this.phy.averageNote);
        System.out.println("Kimya notu : " + this.che.averageNote);
    }


}
