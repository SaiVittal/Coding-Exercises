import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime moment;
    
    public Gigasecond(LocalDate birthDate) {
        moment = birthDate.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds(1_000_000_000L);
    }
}
