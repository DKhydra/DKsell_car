package com.fnzb.utils.event;

import com.github.pagehelper.PageHelper;

public class PageEvent {
	private Integer total = 0;
	
	private Integer pageIndex = 1 ;
	
	private Integer pageSize = 15 ;
	
	private Integer rowIndex = 0 ;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		this.rowIndex =(this.pageIndex -1 ) * this.getPageSize();
	}

	public Integer getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(Integer rowIndex) {
	//do nothing
	}
	PageHelper pageHelper =new PageHelper();
}
