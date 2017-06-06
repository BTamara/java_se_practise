package jukeBox;

import java.util.UUID;

/**
 * Created by btamara on 2017.06.06..
 */
public class User {
    String userId;
    String nickName;
    Song song;

    public User(String nickName) {
        this.userId = UUID.randomUUID().toString();
        this.nickName = nickName;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        userId = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Song getSong(){
        return song;
    }
}
