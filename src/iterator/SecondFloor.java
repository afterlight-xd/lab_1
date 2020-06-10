package iterator;

import java.util.ArrayList;

public class SecondFloor {
    private ArrayList<Room> rooms;

    public SecondFloor() {
        rooms = new ArrayList<>();
        addRoom("Max, Alex, Nikola", 75, 2, false);
        addRoom("Marty, Jake", 70, 1, false);
        addRoom("Alice, Elizabeth", 100, 25, false);
        addRoom("Sean", 50, 9, true);
    }

    public void addRoom(String roomerNames, int area, int roomNumber, boolean isUnderConstruction){
        Room room = new Room(roomerNames, area, roomNumber, isUnderConstruction);
        rooms.add(room);
    }

    public Iterator createIterator(){
        return new SecondFloorIterator(rooms);
    }
}
