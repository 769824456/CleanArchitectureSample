package win.yulongsun.cleanarchitecturesample.presentation.common;

/**
 * @Project CleanArchitectureSample
 * @Packate win.yulongsun.cleanarchitecturesample.presentation.common
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/4/25
 * @Version 1.0.0
 * @Description
 */
public class BaseEnum {

    // 用户来源 手机号码注册，新浪微博，微信
    public enum UserSource {
        PHONE((byte) 0), SINA_WEIBO((byte) 1), WECHAT((byte) 2);
        private Byte value;

        UserSource(Byte value) {
            this.value = value;
        }

        public Byte getValue() {
            return value;
        }

        public void setValue(Byte value) {
            this.value = value;
        }
    }
}
