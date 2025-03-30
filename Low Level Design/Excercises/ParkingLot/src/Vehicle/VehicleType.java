package Vehicle;

import Parking_Spot.SpotType;

public enum VehicleType {

    BIKE {
        public boolean canFitInSpot(SpotType spotType) {
            return spotType == SpotType.TWO_WHEELER || spotType == SpotType.COMPACT;
        }
    },
    CAR {
        public boolean canFitInSpot(SpotType spotType) {
            return spotType == SpotType.FOUR_WHEELER || spotType == SpotType.LARGE;
        }
    },
    TRUCK {
        public boolean canFitInSpot(SpotType spotType) {
            return spotType == SpotType.LARGE;
        }
    },
    ELECTRIC {
        public boolean canFitInSpot(SpotType spotType) {
            return spotType == SpotType.ElECTRIC;
        }
    },
    HANDICAPPED {
        public boolean canFitInSpot(SpotType spotType) {
            return spotType == SpotType.HANDICAPPED;
        }
    };


    public abstract boolean canFitInSpot(SpotType spotType);


}
