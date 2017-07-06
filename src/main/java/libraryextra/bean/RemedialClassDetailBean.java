package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class RemedialClassDetailBean implements Serializable {

    /**
     * status : 1
     * data : {"course":{"id":135,"name":"一对多分辨率测试","subject":"数学","grade":"高二","teacher_name":"王志成","publicize":"http://testing.qatime.cn/assets/courses/mathematics/app_info_default-af5e8db92e98e136a1a7b724b7dedd49.png","teacher":{"id":2489,"name":"王志成","nick_name":"luke测试","avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/f5f33bfc5471477111ddbb4d40c499d9.jpg","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_f5f33bfc5471477111ddbb4d40c499d9.jpg","login_mobile":"13121249326","email":"wchtest001@163.com","is_guest":false,"teaching_years":"within_three_years","category":"初中","subject":"数学","grade_range":["二年级","三年级","四年级","五年级","六年级",""],"gender":"male","birthday":"1991-06-18","province":1,"city":1,"school":17,"school_name":"阳泉实验中学","school_id":17,"desc":"注意啦"},"price":100,"current_price":0,"buy_tickets_count":2,"status":"teaching","description":"<p>一对多分辨率测试<br><\/p>","tag_list":["自编试卷"],"lessons_count":4,"preset_lesson_count":0,"taste_count":3,"completed_lessons_count":2,"closed_lessons_count":4,"started_lessons_count":4,"live_start_time":"2017-07-03 20:14","live_end_time":"2017-07-06 10:16","objective":"一对多分辨率测试","suit_crowd":"一对多分辨率测试","teacher_percentage":50,"lessons":[{"id":467,"name":"课程一","status":"completed","course_id":135,"real_time":50790,"pos":0,"class_date":"2017-07-03","live_time":"21:00-21:30","replayable":false,"left_replay_times":0},{"id":468,"name":"课程二","status":"completed","course_id":135,"real_time":2558,"pos":0,"class_date":"2017-07-04","live_time":"06:00-06:30","replayable":false,"left_replay_times":0},{"id":469,"name":"课程三","status":"finished","course_id":135,"real_time":12916,"pos":0,"class_date":"2017-07-05","live_time":"09:00-09:30","replayable":false,"left_replay_times":0},{"id":470,"name":"课程四","status":"closed","course_id":135,"real_time":0,"pos":0,"class_date":"2017-07-06","live_time":"20:00-20:30","replayable":false,"left_replay_times":0}],"icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"off_shelve":false,"taste_overflow":true,"sell_type":"charge"},"ticket":null}
     */

    private int status;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * course : {"id":135,"name":"一对多分辨率测试","subject":"数学","grade":"高二","teacher_name":"王志成","publicize":"http://testing.qatime.cn/assets/courses/mathematics/app_info_default-af5e8db92e98e136a1a7b724b7dedd49.png","teacher":{"id":2489,"name":"王志成","nick_name":"luke测试","avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/f5f33bfc5471477111ddbb4d40c499d9.jpg","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_f5f33bfc5471477111ddbb4d40c499d9.jpg","login_mobile":"13121249326","email":"wchtest001@163.com","is_guest":false,"teaching_years":"within_three_years","category":"初中","subject":"数学","grade_range":["二年级","三年级","四年级","五年级","六年级",""],"gender":"male","birthday":"1991-06-18","province":1,"city":1,"school":17,"school_name":"阳泉实验中学","school_id":17,"desc":"注意啦"},"price":100,"current_price":0,"buy_tickets_count":2,"status":"teaching","description":"<p>一对多分辨率测试<br><\/p>","tag_list":["自编试卷"],"lessons_count":4,"preset_lesson_count":0,"taste_count":3,"completed_lessons_count":2,"closed_lessons_count":4,"started_lessons_count":4,"live_start_time":"2017-07-03 20:14","live_end_time":"2017-07-06 10:16","objective":"一对多分辨率测试","suit_crowd":"一对多分辨率测试","teacher_percentage":50,"lessons":[{"id":467,"name":"课程一","status":"completed","course_id":135,"real_time":50790,"pos":0,"class_date":"2017-07-03","live_time":"21:00-21:30","replayable":false,"left_replay_times":0},{"id":468,"name":"课程二","status":"completed","course_id":135,"real_time":2558,"pos":0,"class_date":"2017-07-04","live_time":"06:00-06:30","replayable":false,"left_replay_times":0},{"id":469,"name":"课程三","status":"finished","course_id":135,"real_time":12916,"pos":0,"class_date":"2017-07-05","live_time":"09:00-09:30","replayable":false,"left_replay_times":0},{"id":470,"name":"课程四","status":"closed","course_id":135,"real_time":0,"pos":0,"class_date":"2017-07-06","live_time":"20:00-20:30","replayable":false,"left_replay_times":0}],"icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"off_shelve":false,"taste_overflow":true,"sell_type":"charge"}
         * ticket : null
         */

        private CourseBean course;
        private TicketBean ticket;

        public CourseBean getCourse() {
            return course;
        }

        public void setCourse(CourseBean course) {
            this.course = course;
        }

        public TicketBean getTicket() {
            return ticket;
        }

        public void setTicket(TicketBean ticket) {
            this.ticket = ticket;
        }

        public static class CourseBean {
            /**
             * id : 135
             * name : 一对多分辨率测试
             * subject : 数学
             * grade : 高二
             * teacher_name : 王志成
             * publicize : http://testing.qatime.cn/assets/courses/mathematics/app_info_default-af5e8db92e98e136a1a7b724b7dedd49.png
             * teacher : {"id":2489,"name":"王志成","nick_name":"luke测试","avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/f5f33bfc5471477111ddbb4d40c499d9.jpg","ex_big_avatar_url":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_f5f33bfc5471477111ddbb4d40c499d9.jpg","login_mobile":"13121249326","email":"wchtest001@163.com","is_guest":false,"teaching_years":"within_three_years","category":"初中","subject":"数学","grade_range":["二年级","三年级","四年级","五年级","六年级",""],"gender":"male","birthday":"1991-06-18","province":1,"city":1,"school":17,"school_name":"阳泉实验中学","school_id":17,"desc":"注意啦"}
             * price : 100
             * current_price : 0
             * buy_tickets_count : 2
             * status : teaching
             * description : <p>一对多分辨率测试<br></p>
             * tag_list : ["自编试卷"]
             * lessons_count : 4
             * preset_lesson_count : 0
             * taste_count : 3
             * completed_lessons_count : 2
             * closed_lessons_count : 4
             * started_lessons_count : 4
             * live_start_time : 2017-07-03 20:14
             * live_end_time : 2017-07-06 10:16
             * objective : 一对多分辨率测试
             * suit_crowd : 一对多分辨率测试
             * teacher_percentage : 50
             * lessons : [{"id":467,"name":"课程一","status":"completed","course_id":135,"real_time":50790,"pos":0,"class_date":"2017-07-03","live_time":"21:00-21:30","replayable":false,"left_replay_times":0},{"id":468,"name":"课程二","status":"completed","course_id":135,"real_time":2558,"pos":0,"class_date":"2017-07-04","live_time":"06:00-06:30","replayable":false,"left_replay_times":0},{"id":469,"name":"课程三","status":"finished","course_id":135,"real_time":12916,"pos":0,"class_date":"2017-07-05","live_time":"09:00-09:30","replayable":false,"left_replay_times":0},{"id":470,"name":"课程四","status":"closed","course_id":135,"real_time":0,"pos":0,"class_date":"2017-07-06","live_time":"20:00-20:30","replayable":false,"left_replay_times":0}]
             * icons : {"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true}
             * off_shelve : false
             * taste_overflow : true
             * sell_type : charge
             */

            private int id;
            private String name;
            private String subject;
            private String grade;
            private String teacher_name;
            private String publicize;
            private TeacherBean teacher;
            private int price;
            private int current_price;
            private int buy_tickets_count;
            private String status;
            private String description;
            private int lessons_count;
            private int preset_lesson_count;
            private int taste_count;
            private int completed_lessons_count;
            private int closed_lessons_count;
            private int started_lessons_count;
            private String live_start_time;
            private String live_end_time;
            private String objective;
            private String suit_crowd;
            private int teacher_percentage;
            private IconsBean icons;
            private boolean off_shelve;
            private boolean taste_overflow;
            private String sell_type;
            private List<String> tag_list;
            private List<LessonsBean> lessons;

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

            public String getPublicize() {
                return publicize;
            }

            public void setPublicize(String publicize) {
                this.publicize = publicize;
            }

            public TeacherBean getTeacher() {
                return teacher;
            }

            public void setTeacher(TeacherBean teacher) {
                this.teacher = teacher;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getCurrent_price() {
                return current_price;
            }

            public void setCurrent_price(int current_price) {
                this.current_price = current_price;
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

            public int getCompleted_lessons_count() {
                return completed_lessons_count;
            }

            public void setCompleted_lessons_count(int completed_lessons_count) {
                this.completed_lessons_count = completed_lessons_count;
            }

            public int getClosed_lessons_count() {
                return closed_lessons_count;
            }

            public void setClosed_lessons_count(int closed_lessons_count) {
                this.closed_lessons_count = closed_lessons_count;
            }

            public int getStarted_lessons_count() {
                return started_lessons_count;
            }

            public void setStarted_lessons_count(int started_lessons_count) {
                this.started_lessons_count = started_lessons_count;
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

            public int getTeacher_percentage() {
                return teacher_percentage;
            }

            public void setTeacher_percentage(int teacher_percentage) {
                this.teacher_percentage = teacher_percentage;
            }

            public IconsBean getIcons() {
                return icons;
            }

            public void setIcons(IconsBean icons) {
                this.icons = icons;
            }

            public boolean isOff_shelve() {
                return off_shelve;
            }

            public void setOff_shelve(boolean off_shelve) {
                this.off_shelve = off_shelve;
            }

            public boolean isTaste_overflow() {
                return taste_overflow;
            }

            public void setTaste_overflow(boolean taste_overflow) {
                this.taste_overflow = taste_overflow;
            }

            public String getSell_type() {
                return sell_type;
            }

            public void setSell_type(String sell_type) {
                this.sell_type = sell_type;
            }

            public List<String> getTag_list() {
                return tag_list;
            }

            public void setTag_list(List<String> tag_list) {
                this.tag_list = tag_list;
            }

            public List<LessonsBean> getLessons() {
                return lessons;
            }

            public void setLessons(List<LessonsBean> lessons) {
                this.lessons = lessons;
            }

            public static class TeacherBean {
                /**
                 * id : 2489
                 * name : 王志成
                 * nick_name : luke测试
                 * avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/f5f33bfc5471477111ddbb4d40c499d9.jpg
                 * ex_big_avatar_url : http://qatime-testing.oss-cn-beijing.aliyuncs.com/avatars/ex_big_f5f33bfc5471477111ddbb4d40c499d9.jpg
                 * login_mobile : 13121249326
                 * email : wchtest001@163.com
                 * is_guest : false
                 * teaching_years : within_three_years
                 * category : 初中
                 * subject : 数学
                 * grade_range : ["二年级","三年级","四年级","五年级","六年级",""]
                 * gender : male
                 * birthday : 1991-06-18
                 * province : 1
                 * city : 1
                 * school : 17
                 * school_name : 阳泉实验中学
                 * school_id : 17
                 * desc : 注意啦
                 */

                private int id;
                private String name;
                private String nick_name;
                private String avatar_url;
                private String ex_big_avatar_url;
                private String login_mobile;
                private String email;
                private boolean is_guest;
                private String teaching_years;
                private String category;
                private String subject;
                private String gender;
                private String birthday;
                private int province;
                private int city;
                private int school;
                private String school_name;
                private int school_id;
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

                public boolean isIs_guest() {
                    return is_guest;
                }

                public void setIs_guest(boolean is_guest) {
                    this.is_guest = is_guest;
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

                public String getSchool_name() {
                    return school_name;
                }

                public void setSchool_name(String school_name) {
                    this.school_name = school_name;
                }

                public int getSchool_id() {
                    return school_id;
                }

                public void setSchool_id(int school_id) {
                    this.school_id = school_id;
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

            public static class IconsBean {
                /**
                 * refund_any_time : true
                 * coupon_free : true
                 * cheap_moment : false
                 * join_cheap : true
                 * free_taste : true
                 */

                private boolean refund_any_time;
                private boolean coupon_free;
                private boolean cheap_moment;
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

                public boolean isCheap_moment() {
                    return cheap_moment;
                }

                public void setCheap_moment(boolean cheap_moment) {
                    this.cheap_moment = cheap_moment;
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

            public static class LessonsBean {
                /**
                 * id : 467
                 * name : 课程一
                 * status : completed
                 * course_id : 135
                 * real_time : 50790
                 * pos : 0
                 * class_date : 2017-07-03
                 * live_time : 21:00-21:30
                 * replayable : false
                 * left_replay_times : 0
                 */

                private int id;
                private String name;
                private String status;
                private int course_id;
                private int real_time;
                private int pos;
                private String class_date;
                private String live_time;
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

                public int getCourse_id() {
                    return course_id;
                }

                public void setCourse_id(int course_id) {
                    this.course_id = course_id;
                }

                public int getReal_time() {
                    return real_time;
                }

                public void setReal_time(int real_time) {
                    this.real_time = real_time;
                }

                public int getPos() {
                    return pos;
                }

                public void setPos(int pos) {
                    this.pos = pos;
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

        public static class TicketBean {
            private String status;
            private int id;
            private int buy_count;
            private int used_count;

            public void setStatus(String status) {
                this.status = status;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getBuy_count() {
                return buy_count;
            }

            public void setBuy_count(int buy_count) {
                this.buy_count = buy_count;
            }

            public int getUsed_count() {
                return used_count;
            }

            public void setUsed_count(int used_count) {
                this.used_count = used_count;
            }

            public String getStatus() {
                return status;
            }
        }
    }
}
