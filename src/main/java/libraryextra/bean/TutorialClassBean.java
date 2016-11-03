package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/15 10:03
 * @Description
 */
public class TutorialClassBean implements Serializable {
    private int status;

    private List<Data> data;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return this.data;
    }

    public class Data implements Serializable {
        private int id;

        private String name;

        private String subject;

        private String grade;

        private String teacher_name;

        private int price;

        private String chat_team_id;

        private int buy_tickets_count;

        private int preset_lesson_count;

        private int completed_lesson_count;

        private String live_start_time;

        private String live_end_time;

        private String publicize;

        private String pull_address;

        private String preview_time;

        private boolean is_tasting;

        private boolean is_bought;
        /**
         * status : init
         * description : 哈哈哈
         * lesson_count : 0
         * lessons : []
         * chat_team : null
         * push_address : rtmp://pa0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97?wsSecret=74c57894244754864cd0f07cc25ba4be&wsTime=1477448251
         * board : rtmp://pa0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419?wsSecret=a3c84d0ecfdeb7434ffaa534607b9e8f&wsTime=1471330308
         * camera : rtmp://pa0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97?wsSecret=74c57894244754864cd0f07cc25ba4be&wsTime=1477448251
         */

        private String status;
        private String description;
        private int lesson_count;
        private Object chat_team;
        private String push_address;
        private String board;
        private String camera;
        private List<?> lessons;

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

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return this.price;
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

        public void setPull_address(String pull_address) {
            this.pull_address = pull_address;
        }

        public String getPull_address() {
            return this.pull_address;
        }

        public void setPreview_time(String preview_time) {
            this.preview_time = preview_time;
        }

        public String getPreview_time() {
            return this.preview_time;
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

        public Object getChat_team() {
            return chat_team;
        }

        public void setChat_team(Object chat_team) {
            this.chat_team = chat_team;
        }

        public String getPush_address() {
            return push_address;
        }

        public void setPush_address(String push_address) {
            this.push_address = push_address;
        }

        public String getBoard() {
            return board;
        }

        public void setBoard(String board) {
            this.board = board;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        public List<?> getLessons() {
            return lessons;
        }

        public void setLessons(List<?> lessons) {
            this.lessons = lessons;
        }
    }

}
