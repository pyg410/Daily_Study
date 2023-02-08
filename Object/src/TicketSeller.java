import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice=ticketOffice;
    }
    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }
}
