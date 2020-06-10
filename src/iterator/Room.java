package iterator;

public class Room {
    private String roomerNames;
    private int area;
    private int roomNumber;
    private boolean isUnderConstruction;

    public Room(String roomerNames, int area, int roomNumber, boolean isUnderConstruction) {
        this.roomerNames = roomerNames;
        this.area = area;
        this.roomNumber = roomNumber;
        this.isUnderConstruction = isUnderConstruction;
    }

    public String getRoomerNames() {
        return roomerNames;
    }

    public int getArea() {
        return area;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isUnderConstruction() {
        return isUnderConstruction;
    }
}
