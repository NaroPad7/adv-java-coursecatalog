package lab2;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        SoftwareCourse course1 = new IntroJavaCourse("Intro to Java", "118");
        SoftwareCourse course2 = new IntroToProgrammingCourse("Intro to Programming", "119");
        SoftwareCourse course3 = new AdvancedJavaCourse("Advanced Java", "121");

        System.out.println(course3);
        System.out.println(course1);
        System.out.println(course2);
    }

}
