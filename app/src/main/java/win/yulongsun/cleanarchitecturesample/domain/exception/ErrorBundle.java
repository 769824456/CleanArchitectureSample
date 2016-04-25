package win.yulongsun.cleanarchitecturesample.domain.exception;

public class ErrorBundle {
	private String message;
	private int httpCode;
	private int returnCode;

	public ErrorBundle() {

	}

	public ErrorBundle(int code) {
		this.httpCode = code;
	}
	
	public ErrorBundle(String message) {
		this.message = message;
		this.httpCode = 200;
		this.returnCode = 1;
	}

	public ErrorBundle(int httpCode, String message) {
		this.httpCode = httpCode;
		this.message = message;
	}

	public ErrorBundle(String message, int returnCode) {
		this.returnCode = returnCode;
		this.message = message;
		this.httpCode = 200;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

}
