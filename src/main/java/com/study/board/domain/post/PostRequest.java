package com.study.board.domain.post;

import lombok.Getter;
import lombok.Setter;

//요청도메인
@Getter
@Setter
public class PostRequest {

    private Long Id;            // Pk Id값
    private String title;       // 제목
    private String content;     // 내용
    private String writer;      // 작성자
    private boolean noticeYn;   // 공지글여부

}
