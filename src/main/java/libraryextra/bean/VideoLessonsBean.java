package libraryextra.bean;

public class VideoLessonsBean {
    /**
     * id : 4
     * name : 第一学时
     * status : init
     * video_course_id : 3
     * real_time : 0
     * pos : 1
     * video : {"id":7767,"token":"1492157139451","video_type":"mp4","duration":2,"tmp_duration":2,"format_tmp_duration":"00:00:02","capture":"http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg"}
     */

    private int id;
    private String name;
    private String status;
    private int video_course_id;
    private int real_time;
    private int pos;
    private VideoBean video;
    private boolean tastable;
    private boolean visited = false;//标识是否已观看

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isTastable() {
        return tastable;
    }

    public void setTastable(boolean tastable) {
        this.tastable = tastable;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getVideo_course_id() {
        return video_course_id;
    }

    public void setVideo_course_id(int video_course_id) {
        this.video_course_id = video_course_id;
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

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }


    public static class VideoBean {
        /**
         * id : 7767
         * token : 1492157139451
         * video_type : mp4
         * duration : 2
         * tmp_duration : 2
         * format_tmp_duration : 00:00:02
         * capture : http://qatime-testing.oss-cn-beijing.aliyuncs.com/videos/capture/96fcf0349390a9ddccd8871c868d070a.jpg
         */

        private int id;
        private String token;
        private String video_type;
        private int duration;
        private int tmp_duration;
        private String format_tmp_duration;
        private String capture;
        private String name_url;
        private boolean tastable;

        public boolean isTastable() {
            return tastable;
        }

        public void setTastable(boolean tastable) {
            this.tastable = tastable;
        }

        public String getName_url() {
            return name_url;
        }

        public void setName_url(String name_url) {
            this.name_url = name_url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getTmp_duration() {
            return tmp_duration;
        }

        public void setTmp_duration(int tmp_duration) {
            this.tmp_duration = tmp_duration;
        }

        public String getFormat_tmp_duration() {
            return format_tmp_duration;
        }

        public void setFormat_tmp_duration(String format_tmp_duration) {
            this.format_tmp_duration = format_tmp_duration;
        }

        public String getCapture() {
            return capture;
        }

        public void setCapture(String capture) {
            this.capture = capture;
        }


    }
}