package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

public class ChatTeamBean {
    /**
     * announcement : null
     * team_id : 28054274
     * team_announcements : []
     * accounts : []
     */
    ;

    private Announcements.DataBean.AnnouncementsBean announcement;
    private String team_id;
    private List<Team_announcements> team_announcements;
    private List<Accounts> accounts;

    public Announcements.DataBean.AnnouncementsBean getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcements.DataBean.AnnouncementsBean announcement) {
        this.announcement = announcement;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public List<Team_announcements> getTeam_announcements() {
        return team_announcements;
    }

    public void setTeam_announcements(List<Team_announcements> team_announcements) {
        this.team_announcements = team_announcements;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public static class Accounts implements Serializable {
        private String accid;

        private String name;

        private String icon;

        public void setAccid(String accid) {
            this.accid = accid;
        }

        public String getAccid() {
            return this.accid;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getIcon() {
            return this.icon;
        }

    }

    public static class Team_announcements implements Serializable {
        private String announcement;

        private String edit_at;

        public void setAnnouncement(String announcement) {
            this.announcement = announcement;
        }

        public String getAnnouncement() {
            return this.announcement;
        }

        public void setEdit_at(String edit_at) {
            this.edit_at = edit_at;
        }

        public String getEdit_at() {
            return this.edit_at;
        }

    }
}