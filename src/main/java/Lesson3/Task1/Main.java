package Lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(new ExcellentPupil(),new GoodPupil());
        ClassRoom classRoom2 = new ClassRoom(new ExcellentPupil(),new GoodPupil(),new BadPupil());
        ClassRoom classRoom3 = new ClassRoom(new ExcellentPupil(),new GoodPupil(),new BadPupil(),new GoodPupil());

        classRoom1.PrintAllPupilsInfo();
        System.out.println();
        classRoom2.PrintAllPupilsInfo();
        System.out.println();
        classRoom3.PrintAllPupilsInfo();
        System.out.println();
    }
}
