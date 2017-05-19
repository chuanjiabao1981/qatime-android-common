package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class InteractCourseDetailBean implements Serializable {


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

        private int id;
        private String name;
        private String subject;
        private String grade;
        private String price;
        private String status;
        private String description;
        private int lessons_count;
        private int closed_lessons_count;
        private String live_start_time;
        private String live_end_time;
        private String objective;
        private String suit_crowd;
        private String publicize_url;
        private String publicize_info_url;
        private String publicize_list_url;
        private String publicize_app_url;
        private ChatTeamBean chat_team;
        private int created_at;
        private String current_lesson_name;
        private int preview_time;
        private boolean is_bought;
        private List<InteractiveLessonsBean> interactive_lessons;
        private List<TeacherBean> teachers;
        private Icons icons;
        private boolean off_shelve;

        public boolean isOff_shelve() {
            return off_shelve;
        }

        public void setOff_shelve(boolean off_shelve) {
            this.off_shelve = off_shelve;
        }


        public List<TeacherBean> getTeachers() {
            return teachers;
        }

        public void setTeachers(List<TeacherBean> teachers) {
            this.teachers = teachers;
        }

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

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
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

        public String getPublicize_url() {
            return publicize_url;
        }

        public void setPublicize_url(String publicize_url) {
            this.publicize_url = publicize_url;
        }

        public String getPublicize_info_url() {
            return publicize_info_url;
        }

        public void setPublicize_info_url(String publicize_info_url) {
            this.publicize_info_url = publicize_info_url;
        }

        public String getPublicize_list_url() {
            return publicize_list_url;
        }

        public void setPublicize_list_url(String publicize_list_url) {
            this.publicize_list_url = publicize_list_url;
        }

        public String getPublicize_app_url() {
            return publicize_app_url;
        }

        public void setPublicize_app_url(String publicize_app_url) {
            this.publicize_app_url = publicize_app_url;
        }

        public ChatTeamBean getChat_team() {
            return chat_team;
        }

        public void setChat_team(ChatTeamBean chat_team) {
            this.chat_team = chat_team;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public String getCurrent_lesson_name() {
            return current_lesson_name;
        }

        public void setCurrent_lesson_name(String current_lesson_name) {
            this.current_lesson_name = current_lesson_name;
        }

        public int getPreview_time() {
            return preview_time;
        }

        public void setPreview_time(int preview_time) {
            this.preview_time = preview_time;
        }

        public boolean isIs_bought() {
            return is_bought;
        }

        public void setIs_bought(boolean is_bought) {
            this.is_bought = is_bought;
        }

        public List<InteractiveLessonsBean> getInteractive_lessons() {
            return interactive_lessons;
        }

        public void setInteractive_lessons(List<InteractiveLessonsBean> interactive_lessons) {
            this.interactive_lessons = interactive_lessons;
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


        public static class InteractiveLessonsBean {

            private int id;
            private String name;
            private String class_date;
            private String start_time;
            private String end_time;
            private String status;
            private TeacherBean teacher;

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

            public String getClass_date() {
                return class_date;
            }

            public void setClass_date(String class_date) {
                this.class_date = class_date;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public TeacherBean getTeacher() {
                return teacher;
            }

            public void setTeacher(TeacherBean teacher) {
                this.teacher = teacher;
            }

        }

    }
}
