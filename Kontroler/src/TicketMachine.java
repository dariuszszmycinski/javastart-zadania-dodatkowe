import java.time.Duration;
import java.time.LocalDateTime;

class TicketMachine {
    public static void buyTicket(Passenger passenger, Duration duration){
        Ticket ticket = new Ticket(LocalDateTime.now(), duration);
        passenger.setTicket(ticket);
    }
}
