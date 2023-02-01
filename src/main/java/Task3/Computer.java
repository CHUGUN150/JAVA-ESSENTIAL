package Task3;

public class Computer {
    int RAM;
    String VideoAdapter;

    Computer(int RAM,String VideoAdapter){
        this.RAM = RAM;this.VideoAdapter = VideoAdapter;
    }
    public void Show(){
        System.out.println("RAM: "+RAM +" VideoAdapter: "+VideoAdapter);
    }
}
