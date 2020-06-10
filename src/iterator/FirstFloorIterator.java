package iterator;

public class FirstFloorIterator implements Iterator {
    private Room[] rooms;
    private int pos = 0;

    public FirstFloorIterator(Room[] rooms) {
        this.rooms = rooms;
    }

    public boolean hasNext() {
        return pos < rooms.length && rooms[pos] != null;
    }

    public Object next() {
        Room room = rooms[pos];
        pos++;
        return room;
    }
}
