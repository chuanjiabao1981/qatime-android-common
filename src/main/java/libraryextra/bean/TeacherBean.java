package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class TeacherBean implements Serializable {
    /**
     * id : 406
     * name : 史晓军
     * nick_name : 寻常巷陌
     * avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg
     * ex_big_avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg
     * login_mobile : 15333037493
     * email : 1240366505@qq.com
     * chat_account : {"user_id":406,"accid":"c51d5109228be3a04dc2e5e7d37aacb0","token":"6104d5a046db568df4447d3019008a94","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"}
     * openid : o9PoBwc7y_2zUXwfFbPJ5M0f5V9g
     * teaching_years : within_three_years
     * category : 初中
     * subject : 历史
     * grade_range : []
     * gender : null
     * birthday : null
     * province : 1
     * city : 1
     * school : 14
     * desc :
     */


    private int id;
    private String name;
    private String nick_name;
    private String avatar_url;
    private String ex_big_avatar_url;
    private String login_mobile;
    private String email;
    private ChatAccount chat_account;
    private String openid;
    private String teaching_years;
    private String category;
    private String subject;
    private String gender;
    private String birthday;
    private int province;
    private int city;
    private int school;
    private String desc;
    private List<String> grade_range;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getEx_big_avatar_url() {
        return ex_big_avatar_url;
    }

    public void setEx_big_avatar_url(String ex_big_avatar_url) {
        this.ex_big_avatar_url = ex_big_avatar_url;
    }

    public String getLogin_mobile() {
        return login_mobile;
    }

    public void setLogin_mobile(String login_mobile) {
        this.login_mobile = login_mobile;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTeaching_years() {
        return teaching_years;
    }

    public void setTeaching_years(String teaching_years) {
        this.teaching_years = teaching_years;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getGrade_range() {
        return grade_range;
    }

    public void setGrade_range(List<String> grade_range) {
        this.grade_range = grade_range;
    }


}