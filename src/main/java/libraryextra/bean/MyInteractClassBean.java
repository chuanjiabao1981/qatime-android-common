package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/15 10:03
 * @Description
 */
public class MyInteractClassBean implements Serializable {

    /**
     * status : 1
     * data : [{"id":109,"name":"刘刚测试直播客","subject":"生物","grade":"高二","teacher_name":"王志成","price":999,"current_price":249.75,"chat_team_id":"30052401","chat_team_owner":"07b7c43a854ed44d36c2941f1fc5ad00","buy_tickets_count":0,"status":"teaching","preset_lesson_count":4,"completed_lesson_count":3,"taste_count":1,"completed_lessons_count":3,"closed_lessons_count":3,"live_start_time":"2017-04-08 15:55","live_end_time":"2017-04-13 21:45","objective":"刘刚测试直播客刘刚测试直播客刘刚测试直播客刘刚测试直播客","suit_crowd":"刘刚测试直播客刘刚测试直播客刘刚测试直播客刘刚测试直播客","publicize":"/assets/courses/list_default-74744b9444c91d1dae4b3aa1c8f1682b.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-04-08T00:00:00.000+08:00","is_tasting":false,"is_bought":false,"tasted":true},{"id":101,"name":"平面设计基础","subject":"数学","grade":"六年级","teacher_name":"张莉","price":64,"current_price":32,"chat_team_id":"27197636","chat_team_owner":"aa3ba21506abfcd2b2866f0b1d5f581a","buy_tickets_count":2,"status":"teaching","preset_lesson_count":10,"completed_lesson_count":4,"taste_count":9,"completed_lessons_count":4,"closed_lessons_count":5,"live_start_time":"2017-03-27 10:04","live_end_time":"2017-04-17 10:00","objective":"学生掌握基础","suit_crowd":"三到六年级","publicize":"/assets/courses/list_default-74744b9444c91d1dae4b3aa1c8f1682b.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-03-27T00:00:00.000+08:00","is_tasting":true,"is_bought":false,"tasted":false},{"id":95,"name":"2017奔跑吧成绩  三年级数学","subject":"数学","grade":"三年级","teacher_name":"张莉","price":100,"current_price":30,"chat_team_id":"25195008","chat_team_owner":"aa3ba21506abfcd2b2866f0b1d5f581a","buy_tickets_count":0,"status":"teaching","preset_lesson_count":10,"completed_lesson_count":7,"taste_count":9,"completed_lessons_count":7,"closed_lessons_count":7,"live_start_time":"2017-03-17 14:45","live_end_time":"2017-03-26 10:35","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_7a78ce6e4f97ed7f351ff7bcdeee0294.jpg","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-03-17T00:00:00.000+08:00","is_tasting":false,"is_bought":false,"tasted":true},{"id":93,"name":"再来一个辅导班","subject":"化学","grade":"高三","teacher_name":"王志成","price":100,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":12,"status":"completed","preset_lesson_count":1,"completed_lesson_count":1,"taste_count":0,"completed_lessons_count":1,"closed_lessons_count":1,"live_start_time":"2017-03-17 14:29","live_end_time":"2017-03-22 19:07","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_8a7e08039eade62e5ea947c6a492683f.jpg","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":false},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-03-30T00:00:00.000+08:00","is_tasting":false,"is_bought":true,"tasted":false},{"id":94,"name":"测试今日课程","subject":"数学","grade":"高一","teacher_name":"解","price":52,"current_price":15.600000000000001,"chat_team_id":"25189884","chat_team_owner":"11415677f751dedc9a6dd91732cb01cc","buy_tickets_count":0,"status":"teaching","preset_lesson_count":10,"completed_lesson_count":6,"taste_count":9,"completed_lessons_count":6,"closed_lessons_count":7,"live_start_time":"2017-03-08 18:53","live_end_time":"2017-04-19 05:25","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_b67d9b9e7b59c02fa23d0c1cfe979c39.jpg","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-03-08T00:00:00.000+08:00","is_tasting":true,"is_bought":false,"tasted":false},{"id":86,"name":"哈哈哈辅导班","subject":"化学","grade":"高二","teacher_name":"王志成","price":200,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":4,"status":"completed","preset_lesson_count":5,"completed_lesson_count":9,"taste_count":3,"completed_lessons_count":9,"closed_lessons_count":5,"live_start_time":"2017-01-18 13:08","live_end_time":"2017-02-21 14:12","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_704629152bd5cb90689a6e0a16aa8bfe.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-01-18T00:00:00.000+08:00","is_tasting":true,"is_bought":false,"tasted":false},{"id":81,"name":"测试退款辅导班","subject":"化学","grade":"高二","teacher_name":"王志成","price":150,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":5,"status":"completed","preset_lesson_count":3,"completed_lesson_count":5,"taste_count":2,"completed_lessons_count":5,"closed_lessons_count":3,"live_start_time":"2017-01-12 19:11","live_end_time":"2017-01-17 13:13","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_2bca2643441b5b6623c6a26aa7b2a727.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2017-01-12T00:00:00.000+08:00","is_tasting":true,"is_bought":false,"tasted":false},{"id":72,"name":"再来一个辅导班2","subject":"化学","grade":"初二","teacher_name":"王志成","price":300,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":1,"status":"completed","preset_lesson_count":3,"completed_lesson_count":6,"taste_count":2,"completed_lessons_count":6,"closed_lessons_count":3,"live_start_time":"2016-12-02 10:01","live_end_time":"2016-12-29 19:20","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_a83cd6248143bf0036cc30bfa1d82d35.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2016-12-02T00:00:00.000+08:00","is_tasting":false,"is_bought":false,"tasted":true},{"id":70,"name":"再来一个辅导班","subject":"化学","grade":"高二","teacher_name":"王志成","price":100,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":5,"status":"completed","preset_lesson_count":3,"completed_lesson_count":6,"taste_count":2,"completed_lessons_count":6,"closed_lessons_count":3,"live_start_time":"2016-11-26 18:44","live_end_time":"2016-11-24 21:14","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_5600a2b5061d74da67d5898004f4fa2e.jpg","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2016-11-26T00:00:00.000+08:00","is_tasting":false,"is_bought":true,"tasted":true},{"id":80,"name":"今天直播一下换个心情","subject":"化学","grade":"高二","teacher_name":"王志成","price":1000,"current_price":0,"chat_team_id":"","chat_team_owner":"","buy_tickets_count":0,"status":"completed","preset_lesson_count":5,"completed_lesson_count":10,"taste_count":4,"completed_lessons_count":10,"closed_lessons_count":5,"live_start_time":"2016-12-22 11:40","live_end_time":"2016-12-28 17:09","objective":null,"suit_crowd":null,"publicize":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/courses/publicize/list_c134b48ba83739dff475857501142b6e.png","icons":{"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":false,"free_taste":true},"pull_address":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","board_pull_stream":"rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419","camera_pull_stream":"rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97","preview_time":"2016-12-22T00:00:00.000+08:00","is_tasting":false,"is_bought":false,"tasted":true}]
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
         * id : 109
         * name : 刘刚测试直播客
         * subject : 生物
         * grade : 高二
         * teacher_name : 王志成
         * price : 999
         * current_price : 249.75
         * chat_team_id : 30052401
         * chat_team_owner : 07b7c43a854ed44d36c2941f1fc5ad00
         * buy_tickets_count : 0
         * status : teaching
         * preset_lesson_count : 4
         * completed_lesson_count : 3
         * taste_count : 1
         * completed_lessons_count : 3
         * closed_lessons_count : 3
         * live_start_time : 2017-04-08 15:55
         * live_end_time : 2017-04-13 21:45
         * objective : 刘刚测试直播客刘刚测试直播客刘刚测试直播客刘刚测试直播客
         * suit_crowd : 刘刚测试直播客刘刚测试直播客刘刚测试直播客刘刚测试直播客
         * publicize : /assets/courses/list_default-74744b9444c91d1dae4b3aa1c8f1682b.png
         * icons : {"refund_any_time":true,"coupon_free":true,"cheap_moment":false,"join_cheap":true,"free_taste":true}
         * pull_address : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * board_pull_stream : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * camera_pull_stream : rtmp://va0a19f55.live.126.net/live/0ca7943afaa340c9a7c1a8baa5afac97
         * preview_time : 2017-04-08T00:00:00.000+08:00
         * is_tasting : false
         * is_bought : false
         * tasted : true
         */

        private int id;
        private String name;
        private String subject;
        private String grade;
        private String teacher_name;
        private int price;
        private double current_price;
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
        private String objective;
        private String suit_crowd;
        private String publicize;
        private IconsBean icons;
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

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public double getCurrent_price() {
            return current_price;
        }

        public void setCurrent_price(double current_price) {
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

        public IconsBean getIcons() {
            return icons;
        }

        public void setIcons(IconsBean icons) {
            this.icons = icons;
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
    }
}
