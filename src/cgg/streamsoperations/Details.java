package cgg.streamsoperations;

import java.util.List;

public class Details {

	private int detailId;
	private List<String> parts;
	public Details(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDetailId() {
		return detailId;
	}
	public List<String> getParts() {
		return parts;
	}
//	@Override
//	public String toString() {
//		return "Details [detailId=" + detailId + ", parts=" + parts + "]";
//	}
//	
	
}
