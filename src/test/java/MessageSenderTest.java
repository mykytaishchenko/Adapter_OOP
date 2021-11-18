import MessageSender.MessageSender;
import User.MyFacebookUser;
import Facebook.FacebookUser;
import User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    FacebookUser fb = new FacebookUser("super.student@ucu.edu.ua", "Ukraine", 10);
    User user;
    MessageSender messageSender = new MessageSender();

    @BeforeEach
    void setUp() {
        user = new MyFacebookUser(fb);
    }

    @Test
    void send() {
        assertTrue(messageSender.send("Some test text", user, "Ukraine"));
    }
}