package Lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(new ExcellentPupil(),new GoodPupil());
        ClassRoom classRoom2 = new ClassRoom(new ExcellentPupil(),new GoodPupil(),new BadPupil());

        for(int i=0;i<classRoom1.arrayPupil.length;i++){
            classRoom1.arrayPupil[i].study();
            classRoom1.arrayPupil[i].read();
            classRoom1.arrayPupil[i].write();
            classRoom1.arrayPupil[i].relax();
        }
        System.out.println();
        for(int i=0;i<classRoom2.arrayPupil.length;i++){
            classRoom2.arrayPupil[i].study();
            classRoom2.arrayPupil[i].read();
            classRoom2.arrayPupil[i].write();
            classRoom2.arrayPupil[i].relax();
        }
    }
}
