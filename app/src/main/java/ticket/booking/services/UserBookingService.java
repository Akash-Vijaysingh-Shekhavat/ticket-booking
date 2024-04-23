package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {
    private User user;//User can be accesed by anyone
    private static final String UserPath = "../localDb/users.json";
    private List<User> userList;//fetch users from localdb and store in these list
    private ObjectMapper objectMapper = new ObjectMapper();//to map the object valuse defined
    // in the user class we used jackson objectmapper

    //User constructor which is used to tell the users when it is login
    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(UserPath);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});



    }
}
