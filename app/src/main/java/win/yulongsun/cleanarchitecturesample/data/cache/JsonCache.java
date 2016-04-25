package win.yulongsun.cleanarchitecturesample.data.cache;

import java.util.Objects;

/**
 * @Project CleanArchitectureSample
 * @Packate win.yulongsun.cleanarchitecturesample.data.cache
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/4/25
 * @Version 1.0.0
 * @Description
 */
public interface JsonCache {
    String get(String key);

    void put(String key, String json);

    boolean isCached(String key);

    void evictAll();

    /*是否过期*/
    boolean isExpired(String key, long expirationTime);
}
