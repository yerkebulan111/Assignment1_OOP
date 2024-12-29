public class Main {
    public static void main(String[] args) {
        // Students:
        Student student1 = new Student("Harry", "Potter", 21, true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);

        Student student2 = new Student("Ron", "Qeasley", 20, true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);

        Student student3 = new Student("Hermione", "Granger", 19, false);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        student3.addGrade(100);
        student3.addGrade(96);
        student3.addGrade(97);

        Student student4 = new Student("Luna", "Lovegood", 20, false);
        student3.addGrade(46);
        student3.addGrade(87);
        student3.addGrade(67);
        student3.addGrade(79);
        student3.addGrade(96);
        student3.addGrade(58);
        student3.addGrade(83);

        Student student5 = new Student("Draco", "Malfoy", 19, true);
        student3.addGrade(21);
        student3.addGrade(45);
        student3.addGrade(0);
        student3.addGrade(9);
        student3.addGrade(51);
        student3.addGrade(43);

        // Teachers:
        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math" ,7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva","McGonagall",62, false, "Sociology", 17, 1100000);
        Teacher teacher4 = new Teacher("Bellatrix"," Lestrange", 35,false,"Programming", 3, 570000);
        Teacher teacher5 = new Teacher("Sirius", "Black", 49, true,"Physics" ,9, 750000);

        // prints of students
        System.out.println(student1.toString());
        System.out.println("GPA: " + student1.calculateGPA());
        System.out.println(student2.toString());
        System.out.println("GPA: " + student2.calculateGPA());
        System.out.println(student3.toString());
        System.out.println("GPA: " + student3.calculateGPA());
        System.out.println(student4.toString());
        System.out.println("GPA: " + student4.calculateGPA());
        System.out.println(student5.toString());
        System.out.println("GPA: " + student5.calculateGPA());

        //prints of teachers
        System.out.println(teacher1.toString());
        teacher1.giveRaise(5);
        System.out.println("After raise: " + teacher1.toString());

        System.out.println(teacher2.toString());
        teacher2.giveRaise(5);
        System.out.println("After raise: " + teacher2.toString());

        System.out.println(teacher3.toString());
        teacher3.giveRaise(5);
        System.out.println("After raise: " + teacher3.toString());

        System.out.println(teacher4.toString());
        teacher4.giveRaise(5);
        System.out.println("After raise: " + teacher4.toString());

        System.out.println(teacher5.toString());
        teacher5.giveRaise(5);
        System.out.println("After raise: " + teacher5.toString());

        // add students and teachers
        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);

        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);

        // print all members of the school
        System.out.println("\nAll members of the school:");
        System.out.println(school.toString());
    }
}
