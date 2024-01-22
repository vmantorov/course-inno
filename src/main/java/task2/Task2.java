package task2;

public class Task2 {
    public static void main(String[] args) {
        Room livingroom_1 = new Room (15,5,2,1);
        Room bedroom_1 = new Room(20,5,4,1);
        Room kitchen_1 = new Room(18,4,6,2);
        Room bathroom_1 = new Room(10,3,3,0);
        Room study_1 = new Room(13, 2,4,1);

        System.out.println(bathroom_1.sqare + "" + bathroom_1.length + "" + bathroom_1.width + "" + bathroom_1.numberOfWindow);
    }
}
