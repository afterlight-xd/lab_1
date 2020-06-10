package iterator;

public class FirstFloor {
    static final int MAX_ROOMS = 10;
    private Room[] rooms;
    private int numberOfRooms;

    public FirstFloor() {
        rooms = new Room[MAX_ROOMS];
        addRoom("Marty, Jake", 70, 1, false);
        addRoom("Sean", 50, 9, true);
        addRoom("Max, Alex, Nikola", 75, 2, false);
        addRoom("Alice, Elizabeth", 100, 25, false);
    }

    public void addRoom(String roomerNames, int area, int roomNumber, boolean isUnderConstruction){
        Room room = new Room(roomerNames, area, roomNumber, isUnderConstruction);
        rooms[numberOfRooms]=room;
        numberOfRooms++;
    }

    public Iterator createIterator(){
        return new FirstFloorIterator(rooms);
    }
}
