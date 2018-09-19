
   public class StudentRunner{

    public static void main(){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setStudNumber(795284);
        s1.setStudActive(true);
        s1.setStudGPA(4.0);
        s1.setStudName("Zephyr");
        
        s2.setStudNumber(795285);
        System.out.println(s1.getStudNumber());
        System.out.println(s1.getStuActive());
       
        System.out.println(s2.getStudNumber());
    }
}