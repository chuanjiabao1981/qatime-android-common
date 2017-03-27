package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/15 10:03
 * @Description
 */
public class TutorialClassBean implements Serializable {

    /**
     * status : 1
     * data : [{"id":61,"name":"再来一个辅导班","subject":"化学","grade":"高二","teacher_name":"王志成","price":10,"current_price":10,"chat_team_id":"25194018","chat_team_owner":"07b7c43a854ed44d36c2941f1fc5ad00","buy_tickets_count":4,"status":"published","preset_lesson_count":1,"completed_lesson_count":0,"taste_count":0,"completed_lessons_count":0,"closed_lessons_count":0,"live_start_time":"2016-11-22 09:00","live_end_time":"2016-11-22 10:00","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_b876ab65a61aaa1ae47597ef144b9f45.png","pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2016-11-22 09:00","is_tasting":true,"is_bought":false,"tasted":false}]
     */

    private int status;
    private List<Data> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        /**
         * id : 61
         * name : 再来一个辅导班
         * subject : 化学
         * grade : 高二
         * teacher_name : 王志成
         * price : 10
         * current_price : 10
         * chat_team_id : 25194018
         * chat_team_owner : 07b7c43a854ed44d36c2941f1fc5ad00
         * buy_tickets_count : 4
         * status : published
         * preset_lesson_count : 1
         * completed_lesson_count : 0
         * taste_count : 0
         * completed_lessons_count : 0
         * closed_lessons_count : 0
         * live_start_time : 2016-11-22 09:00
         * live_end_time : 2016-11-22 10:00
         * objective : null
         * suit_crowd : null
         * publicize : http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_b876ab65a61aaa1ae47597ef144b9f45.png
         * pull_address : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * board_pull_stream : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * camera_pull_stream : rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97
         * preview_time : 2016-11-22 09:00
         * is_tasting : true
         * is_bought : false
         * tasted : false
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
        private int preset_lesson_count;
        private int completed_lesson_count;
        private int taste_count;
        private int completed_lessons_count;
        private int closed_lessons_count;
        private String live_start_time;
        private String live_end_time;
        private Object objective;
        private Object suit_crowd;
        private String publicize;
        private String pull_address;
        private String board_pull_stream;
        private String camera_pull_stream;
        private String preview_time;
        private boolean is_tasting;
        private boolean is_bought;
        private boolean tasted;

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

        public int getPreset_lesson_count() {
            return preset_lesson_count;
        }

        public void setPreset_lesson_count(int preset_lesson_count) {
            this.preset_lesson_count = preset_lesson_count;
        }

        public int getCompleted_lesson_count() {
            return completed_lesson_count;
        }

        public void setCompleted_lesson_count(int completed_lesson_count) {
            this.completed_lesson_count = completed_lesson_count;
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

        public Object getObjective() {
            return objective;
        }

        public void setObjective(Object objective) {
            this.objective = objective;
        }

        public Object getSuit_crowd() {
            return suit_crowd;
        }

        public void setSuit_crowd(Object suit_crowd) {
            this.suit_crowd = suit_crowd;
        }

        public String getPublicize() {
            return publicize;
        }

        public void setPublicize(String publicize) {
            this.publicize = publicize;
        }

        public String getPull_address() {
            return pull_address;
        }

        public void setPull_address(String pull_address) {
            this.pull_address = pull_address;
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

        public String getPreview_time() {
            return preview_time;
        }

        public void setPreview_time(String preview_time) {
            this.preview_time = preview_time;
        }

        public boolean isIs_tasting() {
            return is_tasting;
        }

        public void setIs_tasting(boolean is_tasting) {
            this.is_tasting = is_tasting;
        }

        public boolean isIs_bought() {
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
    }
}
