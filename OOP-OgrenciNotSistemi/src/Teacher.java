public class Teacher {
    String name;
    String mobileNo;
    String profession;

    Teacher(String name,String mobileNo,String profession){
        this.name = name;
        this.mobileNo = mobileNo;
        this.profession = profession;
    }
    public void print(){
        System.out.println("Adi : "+ this.name +"\nTel No : "+ this.mobileNo+"\nBransi : "+ this.profession);
    }
}
