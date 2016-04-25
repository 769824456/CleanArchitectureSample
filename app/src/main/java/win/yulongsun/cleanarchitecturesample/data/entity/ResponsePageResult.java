package win.yulongsun.cleanarchitecturesample.data.entity;

import java.util.ArrayList;
import java.util.List;

public class ResponsePageResult<T> {
	private int pageNumber = 1;
	private int totalPages;
	private int pageSize;
	private int totalRows;
	private List<T> rows = new ArrayList<T>();

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "ResponseMessagePageResult [pageNumber=" + pageNumber
				+ ", totalPages=" + totalPages + ", pageSize=" + pageSize
				+ ", totalRows=" + totalRows + ", rows=" + rows + "]";
	}

}
