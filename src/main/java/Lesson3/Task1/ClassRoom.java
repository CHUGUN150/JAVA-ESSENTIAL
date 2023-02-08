package Lesson3.Task1;

public class ClassRoom {
    Pupil[] arrayPupil = new Pupil[4];

    ClassRoom(Pupil ... pupil){
        for(int i =0;i<pupil.length;i++){
            arrayPupil[i] = pupil[i];
        }
    }

    void print(){
        for (int i = 0; i < arrayPupil.length; i++) {
            if (arrayPupil[i] != null) {
                arrayPupil[i].study();
                arrayPupil[i].read();
                arrayPupil[i].write();
                arrayPupil[i].relax();
            }
            else {break;}
        }
    }
}
