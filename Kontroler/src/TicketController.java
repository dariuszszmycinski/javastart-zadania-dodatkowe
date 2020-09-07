import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketController {
    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Jan", "Kowalski"));
        TicketMachine.buyTicket(passengers.get(0), Duration.ofMinutes(30));
        passengers.add(new Passenger("Karol", "Nowak", new Ticket(LocalDateTime.now().minus(Duration.ofMinutes(60)), Duration.ofMinutes(30))));
        passengers.add(new Passenger("Ewa", "Sobierajska"));

        List<Passenger> payTicket = checkTickets(passengers);
        System.out.println("Mandaty:");
        for (Passenger p: payTicket) {
            System.out.println(p);
        }

    }

    static List<Passenger> checkTickets(List<Passenger> passengers){
        List<Passenger> payTicket = new ArrayList<>();
        for (Passenger p :passengers) {
            if (p.getTicket()==null){
                payTicket.add(p);
            }else if (p.getTicket().getBuyingTime().plus(p.getTicket().getTicketDuration()).isAfter(LocalDateTime.now())){
                System.out.println("Bilet ok");
            }else{
                payTicket.add(p);
            }
        }
        return payTicket;
    }
}
