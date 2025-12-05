class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {

        if (knightIsAwake == true) { //fast attack can be made
            return false;
        }
        
            return true;
            
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) { //if group can be spied upon
            return true;
        }

        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        if (archerIsAwake == false && prisonerIsAwake == true) {
            return true;
        }
        
        return false; 
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        if (archerIsAwake == false && petDogIsPresent == true) {
            return true;
        }

        if (petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake ==  false){
            return true;
        }

        return false;
    }
}
