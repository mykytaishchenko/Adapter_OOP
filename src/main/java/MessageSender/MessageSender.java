package MessageSender;

import Facebook.FacebookUser;
import Twitter.TwitterUser;

import User.User;

import User.MyFacebookUser;
import User.MyTwitterUser;

import java.util.Objects;


public class MessageSender {
    public boolean send(String text, User user, String country) {

        if (user instanceof MyFacebookUser &&
                Objects.equals(((MyFacebookUser) user).getUser().getCountry(), country)) {
            // Send code
            return true;
        } else if (user instanceof MyTwitterUser &&
                Objects.equals(((MyTwitterUser) user).getUser().getCountry(), country)) {
            // Send code
            return true;
        }
        return false;
    }
}