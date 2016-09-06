package libraryextra.bean;

import java.io.Serializable;

/**
 * @author luntify
 * @date 2016/8/11 20:06
 * @Description 个人信息
 */
public class PersonalInformationBean implements Serializable {

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
        return this.data;
    }


    public class Data implements Serializable {
        private int id;

        private String name;

        private String nick_name;

        private String avatar_url;

        private String parent_phone;

        private String login_mobile;

        private Profile.Chat_account chat_account;

        private String email;

        private String gender;

        private String birthday;

        private String grade;

        private String province;

        private String city;

        private int school;

        private String desc;

        public Profile.Chat_account getChat_account() {
            return chat_account;
        }

        public void setChat_account(Profile.Chat_account chat_account) {
            this.chat_account = chat_account;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLogin_mobile() {
            return login_mobile;
        }

        public void setLogin_mobile(String login_mobile) {
            this.login_mobile = login_mobile;
        }

        public String getParent_phone() {
            return parent_phone;
        }

        public void setParent_phone(String parent_phone) {
            this.parent_phone = parent_phone;
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

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getAvatar_url() {
            return this.avatar_url;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return this.gender;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getBirthday() {
            return this.birthday;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return this.grade;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

        public void setSchool(int school) {
            this.school = school;
        }

        public int getSchool() {
            return this.school;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }
    }
}
