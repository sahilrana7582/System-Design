/**
 * Represents a single delivery (ball) in a cricket match.
 */
public class Ball {

    private final String type;  // e.g., "fast", "spin", "yorker", etc.
    private final int speed;    // in km/h
    private final int run;      // runs scored on this ball
    private final int wicket;   // 1 if wicket fell, 0 otherwise
    private final int extra;    // extras: wide, no-ball, etc.
    private final int six;      // 1 if six scored
    private final int four;     // 1 if four scored

    private Ball(Builder builder) {
        this.type = builder.type;
        this.speed = builder.speed;
        this.run = builder.run;
        this.wicket = builder.wicket;
        this.extra = builder.extra;
        this.six = builder.six;
        this.four = builder.four;
    }

    public static class Builder {

        private String type = "standard";
        private int speed;
        private int run;
        private int wicket;
        private int extra;
        private int six;
        private int four;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder speed(int speed) {
            if (speed < 0) throw new IllegalArgumentException("Speed cannot be negative");
            this.speed = speed;
            return this;
        }

        public Builder run(int run) {
            if (run < 0) throw new IllegalArgumentException("Runs cannot be negative");
            this.run = run;
            return this;
        }

        public Builder wicket(int wicket) {
            if (wicket < 0 || wicket > 1)
                throw new IllegalArgumentException("Wicket must be 0 or 1");
            this.wicket = wicket;
            return this;
        }

        public Builder extra(int extra) {
            if (extra < 0) throw new IllegalArgumentException("Extras cannot be negative");
            this.extra = extra;
            return this;
        }

        public Builder six(int six) {
            if (six != 0 && six != 1)
                throw new IllegalArgumentException("Six must be 0 or 1");
            this.six = six;
            return this;
        }

        public Builder four(int four) {
            if (four != 0 && four != 1)
                throw new IllegalArgumentException("Four must be 0 or 1");
            this.four = four;
            return this;
        }

        public Ball build() {
            return new Ball(this);
        }
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRun() {
        return run;
    }

    public int getWicket() {
        return wicket;
    }

    public int getExtra() {
        return extra;
    }

    public int getSix() {
        return six;
    }

    public int getFour() {
        return four;
    }

    @Override
    public String toString() {
        return String.format("Ball[type=%s, speed=%dkm/h, run=%d, wicket=%d, extra=%d, six=%d, four=%d]",
                type, speed, run, wicket, extra, six, four);
    }
}
