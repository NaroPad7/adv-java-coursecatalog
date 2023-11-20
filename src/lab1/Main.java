package lab1;

public class Main {
    public static void main(String[] args) {
        Course course1 = new AdvancedJavaCourse("Java", "117");
        Course course2 = new IntroJavaCourse("Intro to Java", "118");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "119");

        System.out.println( course1);
        System.out.println( course2);
        System.out.println( course3);
    }
}
