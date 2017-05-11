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
     * status : 1
     * data : [{"id":664,"used_count":0,"buy_count":1,"lesson_price":"0.0","video_course":{"id":8,"name":"来个测试视频课","subject":"化学","grade":"高三","teacher_name":"王志成"},"status":"inactive"}]
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
         * id : 664
         * used_count : 0
         * buy_count : 1
         * lesson_price : 0.0
         * video_course : {"id":8,"name":"来个测试视频课","subject":"化学","grade":"高三","teacher_name":"王志成"}
         * status : inactive
         */

        private int used_count;
        private int buy_count;
        private String lesson_price;
        private VideoCourseBean video_course;
        private String status;

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

        public VideoCourseBean getVideo_course() {
            return video_course;
        }

        public void setVideo_course(VideoCourseBean video_course) {
            this.video_course = video_course;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public static class VideoCourseBean {
            /**
             * id : 8
             * name : 来个测试视频课
             * subject : 化学
             * grade : 高三
             * teacher_name : 王志成
             */

            private int id;
            private String name;
            private String subject;
            private String grade;
            private String teacher_name;
            private String publicize;

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
        }
    }
}
