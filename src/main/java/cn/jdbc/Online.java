package cn.jdbc;

public class Online {
    private String ip;
    private String qq;

    public Online() { }

    public Online(String ip, String qq) {
        this.ip = ip;
        this.qq = qq;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
