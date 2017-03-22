package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class RemedialClassDetailBean implements Serializable {

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

        private String subject;

        private String grade;

        private String teacher_name;

        private float price;

        private float current_price;

        private String chat_team_id;

        private int buy_tickets_count;

        private String status;

        private String description;

        private List<String> tag_list;

        private int lesson_count;

        private int preset_lesson_count;

        private int completed_lesson_count;

        private String live_start_time;

        private String live_end_time;

        private String publicize;

        private List<Lessons> lessons;

        private Chat_team chat_team;

        private String camera_pull_stream;

        private String board_pull_stream;

        private Teacher teacher;

        private boolean is_tasting;

        private boolean is_bought;

        private boolean tasted;
        /**
         * taste_count : 0
         */

        private int taste_count;

        public List<String> getTag_list() {
            return tag_list;
        }

        public void setTag_list(List<String> tag_list) {
            this.tag_list = tag_list;
        }

        public boolean isTasted() {
            return tasted;
        }

        public void setTasted(boolean tasted) {
            this.tasted = tasted;
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

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getSubject() {
            return this.subject;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return this.grade;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public String getTeacher_name() {
            return this.teacher_name;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public float getPrice() {
            return this.price;
        }

        public float getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(float current_price) {
            this.current_price = current_price;
        }

        public String getChat_team_id() {
            return chat_team_id;
        }

        public void setChat_team_id(String chat_team_id) {
            this.chat_team_id = chat_team_id;
        }

        public void setBuy_tickets_count(int buy_tickets_count) {
            this.buy_tickets_count = buy_tickets_count;
        }

        public int getBuy_tickets_count() {
            return this.buy_tickets_count;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

        public void setLesson_count(int lesson_count) {
            this.lesson_count = lesson_count;
        }

        public int getLesson_count() {
            return this.lesson_count;
        }

        public void setPreset_lesson_count(int preset_lesson_count) {
            this.preset_lesson_count = preset_lesson_count;
        }

        public int getPreset_lesson_count() {
            return this.preset_lesson_count;
        }

        public void setCompleted_lesson_count(int completed_lesson_count) {
            this.completed_lesson_count = completed_lesson_count;
        }

        public int getCompleted_lesson_count() {
            return this.completed_lesson_count;
        }

        public void setLive_start_time(String live_start_time) {
            this.live_start_time = live_start_time;
        }

        public String getLive_start_time() {
            return this.live_start_time;
        }

        public void setLive_end_time(String live_end_time) {
            this.live_end_time = live_end_time;
        }

        public String getLive_end_time() {
            return this.live_end_time;
        }

        public void setPublicize(String publicize) {
            this.publicize = publicize;
        }

        public String getPublicize() {
            return this.publicize;
        }

        public void setLessons(List<Lessons> lessons) {
            this.lessons = lessons;
        }

        public List<Lessons> getLessons() {
            return this.lessons;
        }

        public void setChat_team(Chat_team chat_team) {
            this.chat_team = chat_team;
        }

        public Chat_team getChat_team() {
            return this.chat_team;
        }

        public String getCamera() {
            return camera_pull_stream;
        }

        public String getBoard() {
            return board_pull_stream;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        public Teacher getTeacher() {
            return this.teacher;
        }

        public void setIs_tasting(boolean is_tasting) {
            this.is_tasting = is_tasting;
        }

        public boolean getIs_tasting() {
            return this.is_tasting;
        }

        public void setIs_bought(boolean is_bought) {
            this.is_bought = is_bought;
        }

        public boolean getIs_bought() {
            return this.is_bought;
        }

        public int getTaste_count() {
            return taste_count;
        }

        public void setTaste_count(int taste_count) {
            this.taste_count = taste_count;
        }
    }


    public static class Lessons implements Serializable {
        private int id;

        private String name;

        private String status;

        private String class_date;

        private String live_time;

        private boolean replayable;

        private int left_replay_times;

        public boolean isReplayable() {
            return replayable;
        }

        public void setReplayable(boolean replayable) {
            this.replayable = replayable;
        }

        public int getLeft_replay_times() {
            return left_replay_times;
        }

        public void setLeft_replay_times(int left_replay_times) {
            this.left_replay_times = left_replay_times;
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

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }

        public void setClass_date(String class_date) {
            this.class_date = class_date;
        }

        public String getClass_date() {
            return this.class_date;
        }

        public void setLive_time(String live_time) {
            this.live_time = live_time;
        }

        public String getLive_time() {
            return this.live_time;
        }

    }


    public class Teacher implements Serializable {
        private int id;

        private String name;

        private String nick_name;

        private String avatar_url;

        private String teaching_years;

        private String subject;

        private List<String> grade_range;

        private String gender;

        private String birthday;

        private String province;

        private String city;

        private int school;

        private String desc;

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

        public void setTeaching_years(String teaching_years) {
            this.teaching_years = teaching_years;
        }

        public String getTeaching_years() {
            return this.teaching_years;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getSubject() {
            return this.subject;
        }

        public void setGrade_range(List<String> grade_range) {
            this.grade_range = grade_range;
        }

        public List<String> getGrade_range() {
            return this.grade_range;
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

    public static class Accounts implements Serializable {
        private String accid;

        private String firstLetter;

        private String name;

        private String icon;

        public String getFirstLetter() {
            return firstLetter;
        }

        public void setFirstLetter(String firstLetter) {
            this.firstLetter = firstLetter;
        }

        public void setAccid(String accid) {
            this.accid = accid;
        }

        public String getAccid() {
            return this.accid;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getIcon() {
            return this.icon;
        }

    }

    public class Chat_team implements Serializable {
        private String announcement;

        private List<Team_announcements> team_announcements;

        private List<Accounts> accounts;

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public String getAnnouncement() {
            return this.announcement;
        }

        public void setTeam_announcements(List<Team_announcements> team_announcements) {
            this.team_announcements = team_announcements;
        }

        public List<Team_announcements> getTeam_announcements() {
            return this.team_announcements;
        }

        public void setAccounts(List<Accounts> accounts) {
            this.accounts = accounts;
        }

        public List<Accounts> getAccounts() {
            return this.accounts;
        }
    }

    public class Team_announcements implements Serializable {
        private String announcement;

        private String edit_at;

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public String getAnnouncement() {
            return this.announcement;
        }

        public void setEdit_at(String edit_at) {
            this.edit_at = edit_at;
        }

        public String getEdit_at() {
            return this.edit_at;
        }
    }
}
