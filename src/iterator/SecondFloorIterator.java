package iterator;

import java.util.ArrayList;

public class SecondFloorIterator implements Iterator {
    private ArrayList<Room> rooms;
    private int pos = 0;

    public SecondFloorIterator(ArrayList<Room> rooms) {
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
