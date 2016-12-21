package net.conghua.usercenter.beans.vo;

/**
 * Created by Baowen on 2016/12/21.
 */
public class ConghuaResult {

    private Integer code;
    private String msg;
    private String status;
    private Object data;

    public ConghuaResult() {
        super();
    }

    public ConghuaResult(Integer code, String msg, String status, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public static ConghuaResult build(Integer code, String msg, String status){
        return new ConghuaResult(code, msg, status, null);
    }

    public static ConghuaResult ok(){
        return new ConghuaResult(200, "successful", "ok", null);
    }

    public static ConghuaResult ok(Object data){
        return new ConghuaResult(200, "successful", "ok", data);
    }

    public static ConghuaResult ok(Object data, String msg){
        return new ConghuaResult(200, "successful", msg, data);
    }

    public static ConghuaResult ok(String msg){
        return new ConghuaResult(200, "successful", msg, null);
    }
}
