package libraryextra.bean;

import java.io.Serializable;

/**

 * @date 2016/8/31 15:27
 * @Description 跳转到订单详情页面所需的bean
 */
public class OrderDetailBean implements Serializable {
    public int id;
    public String image;
    public String name;
    public String subject;
    public String grade;
    public int Completed_lesson_count;
    public int Preset_lesson_count;
    public String teacher;
    public int price;
    public String status;
}
