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

    public User(){}

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;

    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }


    public String getHashedPassword(){
        return hashedPassword;
    }
    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }


    public String getUserId(){
        return userId;
    }
    public void setUserId(){
        this.userId = userId;
    }


    public void printTickets(){
        for(int i=0;i<ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }





}
