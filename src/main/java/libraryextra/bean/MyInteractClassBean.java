package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class MyInteractClassBean implements Serializable {

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
        private String live_start_time;
        private String live_end_time;
        private String objective;
        private String suit_crowd;
        private String publicize_url;
        private String publicize_info_url;
        private String publicize_list_url;
        private String publicize_app_url;
        private String chat_team_id;
        private int created_at;
        private IconsBean icons;
        private int preview_time;
        private boolean is_bought;
        private List<TeacherBean> teachers;

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

        public String getChat_team_id() {
            return chat_team_id;
        }

        public void setChat_team_id(String chat_team_id) {
            this.chat_team_id = chat_team_id;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public IconsBean getIcons() {
            return icons;
        }

        public void setIcons(IconsBean icons) {
            this.icons = icons;
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

        public List<TeacherBean> getTeachers() {
            return teachers;
        }

        public void setTeachers(List<TeacherBean> teachers) {
            this.teachers = teachers;
        }

    }
}
