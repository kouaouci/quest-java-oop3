public class Eagle extends Bird {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
 
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s He glides into the air.%n", this.getName());
        }
    }

    
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf(" %s flying downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s fly upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s is on the floor.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }

	public void glide() {
		System.out.printf("He glides into the air");
	}
}
