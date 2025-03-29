package Simple_Example;

import java.time.LocalDate;
import java.util.Enumeration;

public class Application {

    public enum Type {SICK, PAID,PERSONAL, UNPAID, OTHER};
    private Type type;
    private LocalDate from;
    private LocalDate to;
    private int total_days;


    private Application(Builder builder) {
        this.type = builder.type;
        this.from = builder.from;
        this.to = builder.to;
        this.total_days = this.to.getDayOfMonth() - this.from.getDayOfMonth();
    }

    public Type getType() {
        return this.type;
    }


    public static class Builder {

        private Type type;

        private LocalDate from;
        private LocalDate to;


        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Builder from(LocalDate from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalDate to) {
            this.to = to;
            return this;
        }

        public Application build() {
            return new Application(this);
        }

    }
}
