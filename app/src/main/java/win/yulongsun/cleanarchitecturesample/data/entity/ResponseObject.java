package win.yulongsun.cleanarchitecturesample.data.entity;

/**
 * @Project CleanArchitectureSample
 * @Packate win.yulongsun.cleanarchitecturesample.data.entity
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/4/25
 * @Version 1.0.0
 * @Description
 */
public class ResponseObject<T> {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
