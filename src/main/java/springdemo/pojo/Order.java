package springdemo.pojo;

public class Order {
    private Integer id;
    private String user_id;
    private String code;
    private String addTime;
    private String total;

    public Order(Integer id, String user_id, String code, String addTime, String total) {
        this.id = id;
        this.user_id = user_id;
        this.code = code;
        this.addTime = addTime;
        this.total = total;
    }
    public Order() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", code='" + code + '\'' +
                ", addTime='" + addTime + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
