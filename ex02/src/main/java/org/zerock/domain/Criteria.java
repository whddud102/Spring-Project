package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;	// 페이지의 번호
	private int amount;		// 필요한 게시글의 수
	
	
	public Criteria() {
		// 기본 생성자로 페이지 번호 = 1, 게시글 수 = 10으로 지정
		this(1, 10);	
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
