package easy;

class ParkingLot {
    boolean[] bigs;
    boolean[] mediums;
    boolean[] smalls;

    public ParkingLot(int big, int medium, int small) {
        this.bigs = new boolean[big];
        this.mediums = new boolean[medium];
        this.smalls = new boolean[small];
    }

    public boolean addCar(int carType) {
        //check what kind of car it is
        if(carType == 1){ //big
            for(int i=0;i<bigs.length;++i){ //iterate through the array of cars of the given size
                if(bigs[i] == false){ //if there is no car in a space(false)
                    bigs[i] = true; //add the car to the lot
                    return true; //exit with true b/c a car can fit
                }
            } return false; //else return false if there are no spaces

            //same comments apply for the other sizes of cars...
        } else if(carType == 2){ //medium
            for(int i=0;i<mediums.length;++i){
                if(mediums[i] == false){
                    mediums[i] = true;
                    return true;
                }
            } return false;
        } else if(carType == 3){ //small
            for(int i=0;i<smalls.length;++i){
                if(smalls[i] == false){
                    smalls[i] = true;
                    return true;
                }
            } return false;
        } else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */