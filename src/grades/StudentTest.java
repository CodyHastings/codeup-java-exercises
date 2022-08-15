package grades;

public class StudentTest  {




    public static void main(String[] args) {
        Student bosch = new Student("Bosch");
        System.out.println("bosch.getName() = " + bosch.getName());
        bosch.addGrade(50);
        bosch.addGrade(100);
        bosch.addGrade(100);
        bosch.addGrade(100);
        for (Integer grade : bosch.getGrades()) {
            System.out.println(grade);
        }
        System.out.println("bosch.getGradeAverage() = " + bosch.getGradeAverage());
    }
}
