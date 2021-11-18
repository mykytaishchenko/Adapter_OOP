package User;

import lombok.Getter;

import Twitter.TwitterUser;

@Getter
public class MyTwitterUser implements User {
    private TwitterUser user;

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public int getActiveTime() {
        return user.getLastActiveTime();
    }
}