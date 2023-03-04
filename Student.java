class StudentData{
    int regId;
    String name;
    String course;
    String address;

    StudentData(){}
    StudentData(int regId, String name, String course, String address){
        this.regId=regId;
        this.name=name;
        this.course=course;
        this.address=address;
    }

    @Override
    public String toString(){
        return "Registration Id: "+regId+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n"+"Address: "+address;
    }
}
public class Student{
    public static void main(String[] args){
        StudentData stu1=new StudentData(101,"Aditya","CSE","Dhanbad, Jharkhand");

        System.out.println(stu1);
    }
}