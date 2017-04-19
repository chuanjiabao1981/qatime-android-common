package libraryextra.bean;

import java.io.Serializable;

public class ChatAccount implements Serializable {
    /**
     * user_id : 406
     * accid : c51d5109228be3a04dc2e5e7d37aacb0
     * token : 6104d5a046db568df4447d3019008a94
     * name : 寻常巷陌
     * icon : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg
     */

    private int user_id;
    private String accid;
    private String token;
    private String name;
    private String icon;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}