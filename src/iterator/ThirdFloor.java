package iterator;

import java.util.Hashtable;

public class ThirdFloor {
    private Hashtable<Integer, Room> rooms;
    private int numberOfRooms = 0;

    public ThirdFloor() {
        rooms = new Hashtable<>();
        addRoom("Sean", 50, 9, true);
        addRoom("Alice, Elizabeth", 100, 25, false);
        addRoom("Marty, Jake", 70, 1, false);
        addRoom("Max, Alex, Nikola", 75, 2, false);
    }

    public void addRoom(String roomerNames, int area, int roomNumber, boolean isUnderConstruction){
        Room room = new Room(roomerNames, area, roomNumber, isUnderConstruction);
        rooms.put(numberOfRooms, room);
        numberOfRooms++;
    }

    public Iterator createIterator(){
        return new ThirdFloorIterator(rooms);
    }
}
