package iterator;

import java.util.Hashtable;

public class ThirdFloorIterator implements Iterator {
    private Hashtable<Integer, Room> rooms;
    private int pos = 0;

    public ThirdFloorIterator(Hashtable<Integer, Room> rooms) {
        this.rooms = rooms;
    }

    public boolean hasNext() {
        return pos < rooms.size();
    }

    public Object next() {
        Room room = rooms.get(pos);
        pos++;
        return room;
    }
}
