package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class RemedialClassDetailBean implements Serializable {

    /**
     * status : 1
     * data : {"id":30,"name":"初中历史","subject":"历史","grade":"初二","teacher_name":"史晓军","price":100,"current_price":50,"chat_team_id":"25190613","chat_team_owner":"c51d5109228be3a04dc2e5e7d37aacb0","buy_tickets_count":2,"status":"completed","description":"讲述中国近现代史的基本历程和线索，建立完善的知识网络，强化专题模块，讲练结合，提高归纳和分析能力。","tag_list":[],"lesson_count":2,"lessons_count":2,"preset_lesson_count":2,"completed_lesson_count":2,"taste_count":0,"completed_lessons_count":2,"closed_lessons_count":1,"live_start_time":"2016-08-17 10:57","live_end_time":"2016-08-17 12:00","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/app_info_5d2596291925b23459895f063f5958fc.jpg","lessons":[{"id":78,"name":"初中历史","status":"completed","class_date":"2016-08-17","live_time":"10:00-12:00","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":null,"replayable":false,"left_replay_times":0},{"id":79,"name":"第一单元  侵略和反抗","status":"missed","class_date":"2016-08-17","live_time":"11:00-12:00","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":null,"replayable":false,"left_replay_times":0}],"chat_team":{"announcement":null,"team_announcements":[],"accounts":[{"accid":"c51d5109228be3a04dc2e5e7d37aacb0","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"},{"accid":"c44acc93c89dd408a36b2bab4915cb74","name":"怎么不可以重复","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_cde6f9af79f6b0d9bb023759786ee83f.png"}]},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":null,"preview_time":"2016-08-17 11:00","teacher":{"id":406,"name":"史晓军","nick_name":"寻常巷陌","avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg","login_mobile":"15333037493","email":"1240366505@qq.com","chat_account":{"user_id":406,"accid":"c51d5109228be3a04dc2e5e7d37aacb0","token":"6104d5a046db568df4447d3019008a94","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"},"openid":"o9PoBwc7y_2zUXwfFbPJ5M0f5V9g","teaching_years":"within_three_years","category":"初中","subject":"历史","grade_range":[],"gender":null,"birthday":null,"province":1,"city":1,"school":14,"desc":""},"is_tasting":true,"is_bought":false,"tasted":false,"current_lesson_name":"全部课程已完成"}
     */

    private int status;
    private Data data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        /**
         * id : 30
         * name : 初中历史
         * subject : 历史
         * grade : 初二
         * teacher_name : 史晓军
         * price : 100
         * current_price : 50
         * chat_team_id : 25190613
         * chat_team_owner : c51d5109228be3a04dc2e5e7d37aacb0
         * buy_tickets_count : 2
         * status : completed
         * description : 讲述中国近现代史的基本历程和线索，建立完善的知识网络，强化专题模块，讲练结合，提高归纳和分析能力。
         * tag_list : []
         * lesson_count : 2
         * lessons_count : 2
         * preset_lesson_count : 2
         * completed_lesson_count : 2
         * taste_count : 0
         * completed_lessons_count : 2
         * closed_lessons_count : 1
         * live_start_time : 2016-08-17 10:57
         * live_end_time : 2016-08-17 12:00
         * objective : null
         * suit_crowd : null
         * publicize : http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/app_info_5d2596291925b23459895f063f5958fc.jpg
         * lessons : [{"id":78,"name":"初中历史","status":"completed","class_date":"2016-08-17","live_time":"10:00-12:00","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":null,"replayable":false,"left_replay_times":0},{"id":79,"name":"第一单元  侵略和反抗","status":"missed","class_date":"2016-08-17","live_time":"11:00-12:00","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":null,"replayable":false,"left_replay_times":0}]
         * chat_team : {"announcement":null,"team_announcements":[],"accounts":[{"accid":"c51d5109228be3a04dc2e5e7d37aacb0","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"},{"accid":"c44acc93c89dd408a36b2bab4915cb74","name":"怎么不可以重复","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_cde6f9af79f6b0d9bb023759786ee83f.png"}]}
         * pull_address : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * board_pull_stream : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * camera_pull_stream : null
         * preview_time : 2016-08-17 11:00
         * teacher : {"id":406,"name":"史晓军","nick_name":"寻常巷陌","avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_797d14c0c9237ebd866a3284f0789102.jpg","login_mobile":"15333037493","email":"1240366505@qq.com","chat_account":{"user_id":406,"accid":"c51d5109228be3a04dc2e5e7d37aacb0","token":"6104d5a046db568df4447d3019008a94","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"},"openid":"o9PoBwc7y_2zUXwfFbPJ5M0f5V9g","teaching_years":"within_three_years","category":"初中","subject":"历史","grade_range":[],"gender":null,"birthday":null,"province":1,"city":1,"school":14,"desc":""}
         * is_tasting : true
         * is_bought : false
         * tasted : false
         * current_lesson_name : 全部课程已完成
         */

        private int id;
        private String name;
        private String subject;
        private String grade;
        private String teacher_name;
        private float price;
        private float current_price;
        private String chat_team_id;
        private String chat_team_owner;
        private int buy_tickets_count;
        private String status;
        private String description;
        private int lesson_count;
        private int lessons_count;
        private int preset_lesson_count;
        private int taste_count;
        private int closed_lessons_count;
        private String live_start_time;
        private String live_end_time;
        private String objective;
        private String suit_crowd;
        private String publicize;
        private ChatTeam chat_team;
        private String pull_address;
        private String board_pull_stream;
        private String camera_pull_stream;
        private String preview_time;
        private Teacher teacher;
        private boolean is_tasting;
        private boolean is_bought;
        private boolean tasted;
        private String current_lesson_name;
        private List<String> tag_list;
        private List<Lessons> lessons;
        private Icons icons;

        public Icons getIcons() {
            return icons;
        }

        public void setIcons(Icons icons) {
            this.icons = icons;
        }

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

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getTeacher_name() {
            return teacher_name;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
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

        public String getChat_team_owner() {
            return chat_team_owner;
        }

        public void setChat_team_owner(String chat_team_owner) {
            this.chat_team_owner = chat_team_owner;
        }

        public int getBuy_tickets_count() {
            return buy_tickets_count;
        }

        public void setBuy_tickets_count(int buy_tickets_count) {
            this.buy_tickets_count = buy_tickets_count;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getLesson_count() {
            return lesson_count;
        }

        public void setLesson_count(int lesson_count) {
            this.lesson_count = lesson_count;
        }

        public int getLessons_count() {
            return lessons_count;
        }

        public void setLessons_count(int lessons_count) {
            this.lessons_count = lessons_count;
        }

        public int getPreset_lesson_count() {
            return preset_lesson_count;
        }

        public void setPreset_lesson_count(int preset_lesson_count) {
            this.preset_lesson_count = preset_lesson_count;
        }



        public int getTaste_count() {
            return taste_count;
        }

        public void setTaste_count(int taste_count) {
            this.taste_count = taste_count;
        }


        public int getClosed_lessons_count() {
            return closed_lessons_count;
        }

        public void setClosed_lessons_count(int closed_lessons_count) {
            this.closed_lessons_count = closed_lessons_count;
        }

        public String getLive_start_time() {
            return live_start_time;
        }

        public void setLive_start_time(String live_start_time) {
            this.live_start_time = live_start_time;
        }

        public String getLive_end_time() {
            return live_end_time;
        }

        public void setLive_end_time(String live_end_time) {
            this.live_end_time = live_end_time;
        }

        public String getObjective() {
            return objective;
        }

        public void setObjective(String objective) {
            this.objective = objective;
        }

        public String getSuit_crowd() {
            return suit_crowd;
        }

        public void setSuit_crowd(String suit_crowd) {
            this.suit_crowd = suit_crowd;
        }

        public String getPublicize() {
            return publicize;
        }

        public void setPublicize(String publicize) {
            this.publicize = publicize;
        }

        public ChatTeam getChat_team() {
            return chat_team;
        }

        public void setChat_team(ChatTeam chat_team) {
            this.chat_team = chat_team;
        }

        public String getPull_address() {
            return pull_address;
        }

        public void setPull_address(String pull_address) {
            this.pull_address = pull_address;
        }

        public String getBoard() {
            return board_pull_stream;
        }

        public void setBoard_pull_stream(String board_pull_stream) {
            this.board_pull_stream = board_pull_stream;
        }

        public String getCamera() {
            return camera_pull_stream;
        }

        public void setCamera_pull_stream(String camera_pull_stream) {
            this.camera_pull_stream = camera_pull_stream;
        }

        public String getPreview_time() {
            return preview_time;
        }

        public void setPreview_time(String preview_time) {
            this.preview_time = preview_time;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        public boolean getIs_tasting() {
            return is_tasting;
        }

        public void setIs_tasting(boolean is_tasting) {
            this.is_tasting = is_tasting;
        }

        public boolean getIs_bought() {
            return is_bought;
        }

        public void setIs_bought(boolean is_bought) {
            this.is_bought = is_bought;
        }

        public boolean isTasted() {
            return tasted;
        }

        public void setTasted(boolean tasted) {
            this.tasted = tasted;
        }

        public String getCurrent_lesson_name() {
            return current_lesson_name;
        }

        public void setCurrent_lesson_name(String current_lesson_name) {
            this.current_lesson_name = current_lesson_name;
        }

        public List<String> getTag_list() {
            return tag_list;
        }

        public void setTag_list(List<String> tag_list) {
            this.tag_list = tag_list;
        }

        public List<Lessons> getLessons() {
            return lessons;
        }

        public void setLessons(List<Lessons> lessons) {
            this.lessons = lessons;
        }

        public static class Icons {
            private boolean refund_any_time;
            private boolean coupon_free;
            private boolean join_cheap;
            private boolean free_taste;

            public boolean isRefund_any_time() {
                return refund_any_time;
            }

            public void setRefund_any_time(boolean refund_any_time) {
                this.refund_any_time = refund_any_time;
            }

            public boolean isCoupon_free() {
                return coupon_free;
            }

            public void setCoupon_free(boolean coupon_free) {
                this.coupon_free = coupon_free;
            }

            public boolean isJoin_cheap() {
                return join_cheap;
            }

            public void setJoin_cheap(boolean join_cheap) {
                this.join_cheap = join_cheap;
            }

            public boolean isFree_taste() {
                return free_taste;
            }

            public void setFree_taste(boolean free_taste) {
                this.free_taste = free_taste;
            }
        }
    }

    public static class ChatTeam {
        /**
         * announcement : null
         * team_announcements : []
         * accounts : [{"accid":"c51d5109228be3a04dc2e5e7d37aacb0","name":"寻常巷陌","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg"},{"accid":"c44acc93c89dd408a36b2bab4915cb74","name":"怎么不可以重复","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_cde6f9af79f6b0d9bb023759786ee83f.png"}]
         */

        private String announcement;
        private List<String> team_announcements;
        private List<Accounts> accounts;

        public String getAnnouncement() {
            return announcement;
        }

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public List<?> getTeam_announcements() {
            return team_announcements;
        }

        public void setTeam_announcements(List<String> team_announcements) {
            this.team_announcements = team_announcements;
        }

        public List<Accounts> getAccounts() {
            return accounts;
        }

        public void setAccounts(List<Accounts> accounts) {
            this.accounts = accounts;
        }

        public static class Accounts {
            /**
             * accid : c51d5109228be3a04dc2e5e7d37aacb0
             * name : 寻常巷陌
             * icon : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_797d14c0c9237ebd866a3284f0789102.jpg
             */

            private String accid;
            private String name;
            private String icon;

            public String getAccid() {
                return accid;
            }

            public void setAccid(String accid) {
                this.accid = accid;
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
    }

    public static class Teacher {
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

        public static class ChatAccount {
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
    }

    public static class Lessons {
        /**
         * id : 78
         * name : 初中历史
         * status : completed
         * class_date : 2016-08-17
         * live_time : 10:00-12:00
         * board_pull_stream : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * camera_pull_stream : null
         * replayable : false
         * left_replay_times : 0
         */

        private int id;
        private String name;
        private String status;
        private String class_date;
        private String live_time;
        private String board_pull_stream;
        private String camera_pull_stream;
        private boolean replayable;
        private int left_replay_times;

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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getClass_date() {
            return class_date;
        }

        public void setClass_date(String class_date) {
            this.class_date = class_date;
        }

        public String getLive_time() {
            return live_time;
        }

        public void setLive_time(String live_time) {
            this.live_time = live_time;
        }

        public String getBoard_pull_stream() {
            return board_pull_stream;
        }

        public void setBoard_pull_stream(String board_pull_stream) {
            this.board_pull_stream = board_pull_stream;
        }

        public String getCamera_pull_stream() {
            return camera_pull_stream;
        }

        public void setCamera_pull_stream(String camera_pull_stream) {
            this.camera_pull_stream = camera_pull_stream;
        }

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
    }
}
