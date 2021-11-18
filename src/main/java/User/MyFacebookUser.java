package User;

import Facebook.FacebookUser;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class MyFacebookUser implements User {
    private FacebookUser user;

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public int getActiveTime() {
        return user.getUserActiveTime();
    }
}