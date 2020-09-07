import java.time.Duration;
import java.time.LocalDateTime;

class Ticket {
    private final LocalDateTime buyingTime;
    private final Duration ticketDuration;

    public Ticket(LocalDateTime buyingTime, Duration ticketDuration) {
        this.buyingTime = buyingTime;
        this.ticketDuration = ticketDuration;
    }

    public LocalDateTime getBuyingTime() {
        return buyingTime;
    }

    public Duration getTicketDuration() {
        return ticketDuration;
    }

    @Override
    public String toString() {
        return "Bilet kupiony " + buyingTime +
                " na " + ticketDuration +
                "minut";
    }
}
