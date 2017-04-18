package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/15 10:03
 * @Description
 */
public class MyVideoClassBean implements Serializable {

    /**
     * data : [{"buy_tickets_count":2,"chat_team":{"accounts":[{"accid":"861dd65933ee54fc8d366e1840b97685","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_37b4709b6c9534b066522ac9fefedc4a.jpg","name":"辛帅锋"},{"accid":"06fca71991be76996df0d6c766c75c02","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_a57625a40335e787cb825f51da1a6667.jpg","name":"11"}],"team_announcements":[],"team_id":"31975075"},"chat_team_id":"31975075","chat_team_owner":"07b7c43a854ed44d36c2941f1fc5ad00","closed_lessons_count":0,"completed_lesson_count":0,"completed_lessons_count":0,"current_price":300,"description":"<p>初中考试1初中考试1初中考试1初中考试1初中考试1<br><\/p>","grade":"初一","id":3,"is_bought":false,"is_tasting":false,"lesson_count":2,"name":"初中考试1","preset_lesson_count":2,"price":300,"publicize":"/assets/video_courses/list_default-d30bb0d64e2d9ea1d59d5214f7b4613a.png","sell_type":"charge","status":"published","subject":"化学","tag_list":[],"taste_count":0,"tasted":false,"teacher":{"avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/8dba956b321d278c40f6b4eb84f05543.jpg","birthday":"1991-06-11","category":"小学","city":1,"desc":"请注意 ，这是开发人员的测试账号！","email":"wchtest001@163.com","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_8dba956b321d278c40f6b4eb84f05543.jpg","gender":"male","grade_range":["二年级","三年级","四年级","五年级","六年级",""],"id":2489,"login_mobile":"13121249326","name":"王志成","nick_name":"luke测试","province":1,"school":3,"subject":"化学","teaching_years":"more_than_twenty_years"},"teacher_name":"王志成","total_duration":0,"video_lessons":[{"id":4,"name":"第一学时","pos":1,"real_time":0,"status":"init","video":{"capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg","duration":2,"format_tmp_duration":"00:00:02","id":7767,"name_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/5f89cfbf304841a1ea8c15b2451e306a.mp4","tmp_duration":2,"token":"1492157139451","video_type":"mp4"},"video_course_id":3},{"id":5,"name":"第二学时","pos":2,"real_time":0,"status":"init","video":{"capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/b574edcbab5c0c9ce60035847b1d11f7.jpg","duration":2,"format_tmp_duration":"00:00:02","id":7768,"name_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/24e4490546fc753cd51eb9da30d2bb92.mp4","tmp_duration":2,"token":"1492157167944","video_type":"mp4"},"video_course_id":3}],"video_lessons_count":2}]
     * status : 1
     */

    private int status;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * buy_tickets_count : 2
         * chat_team : {"accounts":[{"accid":"861dd65933ee54fc8d366e1840b97685","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_37b4709b6c9534b066522ac9fefedc4a.jpg","name":"辛帅锋"},{"accid":"06fca71991be76996df0d6c766c75c02","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_a57625a40335e787cb825f51da1a6667.jpg","name":"11"}],"team_announcements":[],"team_id":"31975075"}
         * chat_team_id : 31975075
         * chat_team_owner : 07b7c43a854ed44d36c2941f1fc5ad00
         * closed_lessons_count : 0
         * completed_lesson_count : 0
         * completed_lessons_count : 0
         * current_price : 300
         * description : <p>初中考试1初中考试1初中考试1初中考试1初中考试1<br></p>
         * grade : 初一
         * id : 3
         * is_bought : false
         * is_tasting : false
         * lesson_count : 2
         * name : 初中考试1
         * preset_lesson_count : 2
         * price : 300
         * publicize : /assets/video_courses/list_default-d30bb0d64e2d9ea1d59d5214f7b4613a.png
         * sell_type : charge
         * status : published
         * subject : 化学
         * tag_list : []
         * taste_count : 0
         * tasted : false
         * teacher : {"avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/8dba956b321d278c40f6b4eb84f05543.jpg","birthday":"1991-06-11","category":"小学","city":1,"desc":"请注意 ，这是开发人员的测试账号！","email":"wchtest001@163.com","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_8dba956b321d278c40f6b4eb84f05543.jpg","gender":"male","grade_range":["二年级","三年级","四年级","五年级","六年级",""],"id":2489,"login_mobile":"13121249326","name":"王志成","nick_name":"luke测试","province":1,"school":3,"subject":"化学","teaching_years":"more_than_twenty_years"}
         * teacher_name : 王志成
         * total_duration : 0
         * video_lessons : [{"id":4,"name":"第一学时","pos":1,"real_time":0,"status":"init","video":{"capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg","duration":2,"format_tmp_duration":"00:00:02","id":7767,"name_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/5f89cfbf304841a1ea8c15b2451e306a.mp4","tmp_duration":2,"token":"1492157139451","video_type":"mp4"},"video_course_id":3},{"id":5,"name":"第二学时","pos":2,"real_time":0,"status":"init","video":{"capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/b574edcbab5c0c9ce60035847b1d11f7.jpg","duration":2,"format_tmp_duration":"00:00:02","id":7768,"name_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/24e4490546fc753cd51eb9da30d2bb92.mp4","tmp_duration":2,"token":"1492157167944","video_type":"mp4"},"video_course_id":3}]
         * video_lessons_count : 2
         */

        private int buy_tickets_count;
        private ChatTeamBean chat_team;
        private String chat_team_id;
        private String chat_team_owner;
        private int closed_lessons_count;
        private int completed_lesson_count;
        private int completed_lessons_count;
        private float current_price;
        private String description;
        private String grade;
        private int id;
        private boolean is_bought;
        private boolean is_tasting;
        private int lesson_count;
        private String name;
        private int preset_lesson_count;
        private float price;
        private String publicize;
        private String sell_type;
        private String status;
        private String subject;
        private int taste_count;
        private boolean tasted;
        private TeacherBean teacher;
        private String teacher_name;
        private int total_duration;
        private int video_lessons_count;
        private List<?> tag_list;
        private List<VideoLessonsBean> video_lessons;

        public int getBuy_tickets_count() {
            return buy_tickets_count;
        }

        public void setBuy_tickets_count(int buy_tickets_count) {
            this.buy_tickets_count = buy_tickets_count;
        }

        public ChatTeamBean getChat_team() {
            return chat_team;
        }

        public void setChat_team(ChatTeamBean chat_team) {
            this.chat_team = chat_team;
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

        public int getClosed_lessons_count() {
            return closed_lessons_count;
        }

        public void setClosed_lessons_count(int closed_lessons_count) {
            this.closed_lessons_count = closed_lessons_count;
        }

        public int getCompleted_lesson_count() {
            return completed_lesson_count;
        }

        public void setCompleted_lesson_count(int completed_lesson_count) {
            this.completed_lesson_count = completed_lesson_count;
        }

        public int getCompleted_lessons_count() {
            return completed_lessons_count;
        }

        public void setCompleted_lessons_count(int completed_lessons_count) {
            this.completed_lessons_count = completed_lessons_count;
        }

        public float getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(float current_price) {
            this.current_price = current_price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isIs_bought() {
            return is_bought;
        }

        public void setIs_bought(boolean is_bought) {
            this.is_bought = is_bought;
        }

        public boolean isIs_tasting() {
            return is_tasting;
        }

        public void setIs_tasting(boolean is_tasting) {
            this.is_tasting = is_tasting;
        }

        public int getLesson_count() {
            return lesson_count;
        }

        public void setLesson_count(int lesson_count) {
            this.lesson_count = lesson_count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPreset_lesson_count() {
            return preset_lesson_count;
        }

        public void setPreset_lesson_count(int preset_lesson_count) {
            this.preset_lesson_count = preset_lesson_count;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getPublicize() {
            return publicize;
        }

        public void setPublicize(String publicize) {
            this.publicize = publicize;
        }

        public String getSell_type() {
            return sell_type;
        }

        public void setSell_type(String sell_type) {
            this.sell_type = sell_type;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getTaste_count() {
            return taste_count;
        }

        public void setTaste_count(int taste_count) {
            this.taste_count = taste_count;
        }

        public boolean isTasted() {
            return tasted;
        }

        public void setTasted(boolean tasted) {
            this.tasted = tasted;
        }

        public TeacherBean getTeacher() {
            return teacher;
        }

        public void setTeacher(TeacherBean teacher) {
            this.teacher = teacher;
        }

        public String getTeacher_name() {
            return teacher_name;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public int getTotal_duration() {
            return total_duration;
        }

        public void setTotal_duration(int total_duration) {
            this.total_duration = total_duration;
        }

        public int getVideo_lessons_count() {
            return video_lessons_count;
        }

        public void setVideo_lessons_count(int video_lessons_count) {
            this.video_lessons_count = video_lessons_count;
        }

        public List<?> getTag_list() {
            return tag_list;
        }

        public void setTag_list(List<?> tag_list) {
            this.tag_list = tag_list;
        }

        public List<VideoLessonsBean> getVideo_lessons() {
            return video_lessons;
        }

        public void setVideo_lessons(List<VideoLessonsBean> video_lessons) {
            this.video_lessons = video_lessons;
        }

        public static class ChatTeamBean {
            /**
             * accounts : [{"accid":"861dd65933ee54fc8d366e1840b97685","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_37b4709b6c9534b066522ac9fefedc4a.jpg","name":"辛帅锋"},{"accid":"06fca71991be76996df0d6c766c75c02","icon":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_a57625a40335e787cb825f51da1a6667.jpg","name":"11"}]
             * team_announcements : []
             * team_id : 31975075
             */

            private String team_id;
            private List<AccountsBean> accounts;
            private List<?> team_announcements;

            public String getTeam_id() {
                return team_id;
            }

            public void setTeam_id(String team_id) {
                this.team_id = team_id;
            }

            public List<AccountsBean> getAccounts() {
                return accounts;
            }

            public void setAccounts(List<AccountsBean> accounts) {
                this.accounts = accounts;
            }

            public List<?> getTeam_announcements() {
                return team_announcements;
            }

            public void setTeam_announcements(List<?> team_announcements) {
                this.team_announcements = team_announcements;
            }

            public static class AccountsBean {
                /**
                 * accid : 861dd65933ee54fc8d366e1840b97685
                 * icon : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/small_37b4709b6c9534b066522ac9fefedc4a.jpg
                 * name : 辛帅锋
                 */

                private String accid;
                private String icon;
                private String name;

                public String getAccid() {
                    return accid;
                }

                public void setAccid(String accid) {
                    this.accid = accid;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class TeacherBean {
            /**
             * avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/8dba956b321d278c40f6b4eb84f05543.jpg
             * birthday : 1991-06-11
             * category : 小学
             * city : 1
             * desc : 请注意 ，这是开发人员的测试账号！
             * email : wchtest001@163.com
             * ex_big_avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_8dba956b321d278c40f6b4eb84f05543.jpg
             * gender : male
             * grade_range : ["二年级","三年级","四年级","五年级","六年级",""]
             * id : 2489
             * login_mobile : 13121249326
             * name : 王志成
             * nick_name : luke测试
             * province : 1
             * school : 3
             * subject : 化学
             * teaching_years : more_than_twenty_years
             */

            private String avatar_url;
            private String birthday;
            private String category;
            private int city;
            private String desc;
            private String email;
            private String ex_big_avatar_url;
            private String gender;
            private int id;
            private String login_mobile;
            private String name;
            private String nick_name;
            private int province;
            private int school;
            private String subject;
            private String teaching_years;
            private List<String> grade_range;

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getEx_big_avatar_url() {
                return ex_big_avatar_url;
            }

            public void setEx_big_avatar_url(String ex_big_avatar_url) {
                this.ex_big_avatar_url = ex_big_avatar_url;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLogin_mobile() {
                return login_mobile;
            }

            public void setLogin_mobile(String login_mobile) {
                this.login_mobile = login_mobile;
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

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
            }

            public int getSchool() {
                return school;
            }

            public void setSchool(int school) {
                this.school = school;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public String getTeaching_years() {
                return teaching_years;
            }

            public void setTeaching_years(String teaching_years) {
                this.teaching_years = teaching_years;
            }

            public List<String> getGrade_range() {
                return grade_range;
            }

            public void setGrade_range(List<String> grade_range) {
                this.grade_range = grade_range;
            }
        }

        public static class VideoLessonsBean {
            /**
             * id : 4
             * name : 第一学时
             * pos : 1
             * real_time : 0
             * status : init
             * video : {"capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg","duration":2,"format_tmp_duration":"00:00:02","id":7767,"name_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/5f89cfbf304841a1ea8c15b2451e306a.mp4","tmp_duration":2,"token":"1492157139451","video_type":"mp4"}
             * video_course_id : 3
             */

            private int id;
            private String name;
            private int pos;
            private int real_time;
            private String status;
            private VideoBean video;
            private int video_course_id;

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

            public int getPos() {
                return pos;
            }

            public void setPos(int pos) {
                this.pos = pos;
            }

            public int getReal_time() {
                return real_time;
            }

            public void setReal_time(int real_time) {
                this.real_time = real_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public VideoBean getVideo() {
                return video;
            }

            public void setVideo(VideoBean video) {
                this.video = video;
            }

            public int getVideo_course_id() {
                return video_course_id;
            }

            public void setVideo_course_id(int video_course_id) {
                this.video_course_id = video_course_id;
            }

            public static class VideoBean {
                /**
                 * capture : http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg
                 * duration : 2
                 * format_tmp_duration : 00:00:02
                 * id : 7767
                 * name_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/5f89cfbf304841a1ea8c15b2451e306a.mp4
                 * tmp_duration : 2
                 * token : 1492157139451
                 * video_type : mp4
                 */

                private String capture;
                private int duration;
                private String format_tmp_duration;
                private int id;
                private String name_url;
                private int tmp_duration;
                private String token;
                private String video_type;

                public String getCapture() {
                    return capture;
                }

                public void setCapture(String capture) {
                    this.capture = capture;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getFormat_tmp_duration() {
                    return format_tmp_duration;
                }

                public void setFormat_tmp_duration(String format_tmp_duration) {
                    this.format_tmp_duration = format_tmp_duration;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName_url() {
                    return name_url;
                }

                public void setName_url(String name_url) {
                    this.name_url = name_url;
                }

                public int getTmp_duration() {
                    return tmp_duration;
                }

                public void setTmp_duration(int tmp_duration) {
                    this.tmp_duration = tmp_duration;
                }

                public String getToken() {
                    return token;
                }

                public void setToken(String token) {
                    this.token = token;
                }

                public String getVideo_type() {
                    return video_type;
                }

                public void setVideo_type(String video_type) {
                    this.video_type = video_type;
                }
            }
        }
    }
}
