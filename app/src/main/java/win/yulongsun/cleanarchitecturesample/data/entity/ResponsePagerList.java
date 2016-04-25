package win.yulongsun.cleanarchitecturesample.data.entity;

public class ResponsePagerList<T> extends BaseResponse {
	private ResponsePageResult<T> result;

	public ResponsePageResult<T> getResult() {
		return result;
	}

	public void setResult(ResponsePageResult<T> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ResponseMessageList [result=" + result + "]";
	}

}
