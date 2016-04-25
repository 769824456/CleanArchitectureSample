package win.yulongsun.cleanarchitecturesample.data.cache;

import com.jakewharton.disklrucache.DiskLruCache;

import java.io.File;
import java.io.IOException;

/**
 * @Project CleanArchitectureSample
 * @Packate win.yulongsun.cleanarchitecturesample.data.cache
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/4/25
 * @Version 1.0.0
 * @Description
 */
public class JsonCacheImpl implements JsonCache {

    private static final long         SIZE      = 0;
    private static final File         DIR       = new File("");
    private static final int          VERSION   = 0;
    private static final int          COUNT     = 100;
    private static       DiskLruCache jsonCache = null;


    public JsonCacheImpl() {
        try {
            jsonCache = DiskLruCache.open(DIR, VERSION, COUNT, SIZE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public String get(String key) {
        try {
            jsonCache.get(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override public void put(String key, String json) {
//        jsonCache.
    }

    @Override public boolean isCached(String key) {
        return false;
    }

    @Override public void evictAll() {

    }

    @Override public boolean isExpired(String key, long expirationTime) {
        return false;
    }
}
