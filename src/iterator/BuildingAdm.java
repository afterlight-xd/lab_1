package iterator;

public class BuildingAdm {
    FirstFloor firstFloor;
    SecondFloor secondFloor;
    ThirdFloor thirdFloor;

    public BuildingAdm(FirstFloor firstFloor, SecondFloor secondFloor, ThirdFloor thirdFloor) {
        this.firstFloor = firstFloor;
        this.secondFloor = secondFloor;
        this.thirdFloor = thirdFloor;
    }

    public void printBuildingInfo(){
        Iterator firstIterator = firstFloor.createIterator();
        Iterator secondIterator = secondFloor.createIterator();
        Iterator thirdIterator = thirdFloor.createIterator();
        System.out.println("BUILDING INFO\n\n--------\n\nFIRST FLOOR");
        printFloorInfo(firstIterator);
        System.out.println("\n\nSECOND FLOOR");
        printFloorInfo(secondIterator);
        System.out.println("\n\nTHIRD FLOOR");
        printFloorInfo(thirdIterator);
    }

    private void printFloorInfo(Iterator iterator){
        while (iterator.hasNext()){
            Room room = (Room)iterator.next();
            System.out.println("In room number "+ room.getRoomNumber()+" with area of "+room.getArea()+"m^2 lives "+room.getRoomerNames()+"\n");
        }
    }
}
