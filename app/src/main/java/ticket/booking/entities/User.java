package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User(String name,String password, String hasedPassword,List<Ticket>ticketsBooked,String userId){
        this.name = name;
        this.password = password;
        this.hashedPassword = hasedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }




}
