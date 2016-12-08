package libraryextra.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/12 14:41
 * @Description 基础数据  城市
 */
public class CityBean {

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

    public static class Data implements Serializable {
        public Data(String name) {
            this.name = name;
            this.province_id = "0";
            this.id = 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data = (Data) o;

            return name.equals(data.name);

        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        private int id;

        private String province_id;

        private String name;
        private String firstLetter;

        private int workstations_count;

        public int getWorkstations_count() {
            return workstations_count;
        }

        public void setWorkstations_count(int workstations_count) {
            this.workstations_count = workstations_count;
        }

        public String getFirstLetter() {
            return firstLetter;
        }

        public void setFirstLetter(String firstLetter) {
            this.firstLetter = firstLetter;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public void setProvince_id(String province_id) {
            this.province_id = province_id;
        }

        public String getProvince_id() {
            return this.province_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

    }
}
