package libraryextra.bean;

import java.io.Serializable;

public class Profile implements Serializable {

    private int status;

    private Data data;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return this.data == null ? new Data() : this.data;
    }

    public String getToken() {
        return this.data != null && this.data.remember_token != null ? this.data.remember_token : "";
    }


    public class Data implements Serializable {
        private String remember_token;

        private User user;

        public void setRemember_token(String remember_token) {
            this.remember_token = remember_token;
        }

        public String getRemember_token() {
            return this.remember_token;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public User getUser() {
            return this.user == null ? new User() : this.user;
        }

    }

    public class User implements Serializable {
        private int id;

        private String name;

        private String nick_name;

        private String avatar_url;

        private String ex_big_avatar_url;

        private String login_mobile;

        private String email;

        private ChatAccount chat_account;

        private String openid;


        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getLogin_mobile() {
            return login_mobile;
        }

        public void setLogin_mobile(String login_mobile) {
            this.login_mobile = login_mobile;
        }

        public String getEx_big_avatar_url() {
            return ex_big_avatar_url;
        }

        public void setEx_big_avatar_url(String ex_big_avatar_url) {
            this.ex_big_avatar_url = ex_big_avatar_url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ChatAccount getChat_account() {
            return chat_account;
        }

        public void setChat_account(ChatAccount chat_account) {
            this.chat_account = chat_account;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getNick_name() {
            return this.nick_name;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }
    }
}
