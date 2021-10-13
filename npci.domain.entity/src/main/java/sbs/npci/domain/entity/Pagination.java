package sbs.npci.domain.entity;

import sbs.npci.domain.entity.base.BaseList;

public class Pagination<T> extends BaseList<T> {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
