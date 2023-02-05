package Lesson3.Task1;

public class ClassRoom {
    Pupil[] arrayPupil;

    ClassRoom(Pupil pupil1,Pupil pupil2){
        arrayPupil = new Pupil[]{pupil1,pupil2};
    }
    ClassRoom(Pupil pupil1,Pupil pupil2,Pupil pupil3){
        arrayPupil = new Pupil[]{pupil1,pupil2,pupil3};
    }
}
