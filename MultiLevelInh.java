class Teacher
{
    private int age;
    private String name;
    public void setage(int a){
        age=a;
    }
    public void setname(String n){
        name=n;
    }
    public int getage(){
        return(age);
    }
    public String getname(){
        return(name);
    }
}
class Student extends Teacher
{
    private int rollno;
    public void setrollno(int r){
        rollno=r;
    }
    public int getrollno(){
        return(rollno);
    }
}
class MultiLevelInh
{
    public static void main(String []args)
    {
        Student obj=new Student();
        obj.setrollno(25);
        obj.setage(21);
        obj.setname("Raju");
        System.out.println("Students Rollno is" +" "+obj.getrollno());
        System.out.println("Students Age is" +" "+obj.getage());
        System.out.println("Students Name is" +" "+obj.getname());
    }
}