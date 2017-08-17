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

        private InteractiveCourseBean interactive_course;
        private TicketBean ticket;

        public InteractiveCourseBean getInteractive_course() {
            return interactive_course;
        }

        public void setInteractive_course(InteractiveCourseBean interactive_course) {
            this.interactive_course = interactive_course;
        }

        public TicketBean getTicket() {
            return ticket;
        }

        public void setTicket(TicketBean ticket) {
            this.ticket = ticket;
        }

        public static class InteractiveCourseBean {

            private int id;
            private String name;
            private String subject;
            private String grade;
            private String price;
            private String status;
            private String description;
            private int lessons_count;
            private int completed_lessons_count;
            private int closed_lessons_count;
            private int started_lessons_count;
            private String live_start_time;
            private String live_end_time;
            private String objective;
            private String suit_crowd;
            private int teacher_percentage;
            private PublicizeBean publicize;
            private IconsBean icons;
            private boolean off_shelve;
            private ChatTeamBean chat_team;
            private String board_pull_stream;
            private List<TeacherBean> teachers;
            private List<InteractiveLessonsBean> interactive_lessons;

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

            public PublicizeBean getPublicize() {
                return publicize;
            }

            public void setPublicize(PublicizeBean publicize) {
                this.publicize = publicize;
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

            public ChatTeamBean getChat_team() {
                return chat_team;
            }

            public void setChat_team(ChatTeamBean chat_team) {
                this.chat_team = chat_team;
            }

            public String getBoard_pull_stream() {
                return board_pull_stream;
            }

            public void setBoard_pull_stream(String board_pull_stream) {
                this.board_pull_stream = board_pull_stream;
            }

            public List<TeacherBean> getTeachers() {
                return teachers;
            }

            public void setTeachers(List<TeacherBean> teachers) {
                this.teachers = teachers;
            }

            public List<InteractiveLessonsBean> getInteractive_lessons() {
                return interactive_lessons;
            }

            public void setInteractive_lessons(List<InteractiveLessonsBean> interactive_lessons) {
                this.interactive_lessons = interactive_lessons;
            }

            public static class PublicizeBean {

                private String info_url;
                private String list_url;

                public String getInfo_url() {
                    return info_url;
                }

                public void setInfo_url(String info_url) {
                    this.info_url = info_url;
                }

                public String getList_url() {
                    return list_url;
                }

                public void setList_url(String list_url) {
                    this.list_url = list_url;
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
                private boolean replayable;

                public boolean isReplayable() {
                    return replayable;
                }

                public void setReplayable(boolean replayable) {
                    this.replayable = replayable;
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

        public static class TicketBean {
            private int id;
            private int used_count;
            private int buy_count;
            private String lesson_price;
            private String status;
            private String type;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUsed_count() {
                return used_count;
            }

            public void setUsed_count(int used_count) {
                this.used_count = used_count;
            }

            public int getBuy_count() {
                return buy_count;
            }

            public void setBuy_count(int buy_count) {
                this.buy_count = buy_count;
            }

            public String getLesson_price() {
                return lesson_price;
            }

            public void setLesson_price(String lesson_price) {
                this.lesson_price = lesson_price;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

        }
    }
}
