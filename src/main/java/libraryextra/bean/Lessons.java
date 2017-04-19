package libraryextra.bean;

import java.io.Serializable;

public class Lessons implements Serializable {
        /**
         * id : 78
         * name : 初中历史
         * status : completed
         * class_date : 2016-08-17
         * live_time : 10:00-12:00
         * board_pull_stream : rtmp://va0a19f55.live.126.net/live/2794c854398f4d05934157e05e2fe419
         * camera_pull_stream : null
         * replayable : false
         * left_replay_times : 0
         */
      
        private int id;
        private String name;
        private String status;
        private String class_date;
        private String live_time;
        private String board_pull_stream;
        private String camera_pull_stream;
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