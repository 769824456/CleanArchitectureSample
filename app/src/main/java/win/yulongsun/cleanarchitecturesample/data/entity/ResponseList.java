package win.yulongsun.cleanarchitecturesample.data.entity;

import java.util.ArrayList;
import java.util.List;

public class ResponseList<T> extends BaseResponse {
//    private List<T> result = new ArrayList<T>();
//
//    public List<T> getResult() {
//        return result;
//    }
//
//    public void setResult(List<T> result) {
//        this.result = result;
//    }
//
//    @Override
//    public String toString() {
//        return "ResponseList [result=" + result + "]";
//    }

    private List<T> result = new ArrayList<T>();

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override public String toString() {
        return "ResponseList{" +
                "result=" + result +
                '}';
    }
}
