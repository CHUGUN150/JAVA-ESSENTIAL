package Lesson3.Task1;

class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Im study Bad");
    }

    @Override
    void read() {
        System.out.println("Im read Bad");
    }

    @Override
    void write() {
        System.out.println("Im write Bad");
    }

    @Override
    void relax() {
        System.out.println("Im relax Bad");
    }
}
