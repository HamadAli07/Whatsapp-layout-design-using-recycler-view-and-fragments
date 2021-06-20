package model;

public class chat_class {
    String name;
    String message;
    int pic;
    String time;

    public chat_class(String name, String message, int pic, String time) {
        this.name = name;
        this.message = message;
        this.pic = pic;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public int getPic() {
        return pic;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
