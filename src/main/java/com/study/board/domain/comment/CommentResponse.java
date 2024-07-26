package com.study.board.domain.comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class CommentResponse {
    private Long id;                        // 댓글번호(PK)
    private Long postId;                    // 게시글 번호 (FK)
    private String content;                 // 내용
    private String writer;                  // 작성자
    private boolean deleteYn;               // 삭제여부
    private LocalDateTime createDate;       // 생성일시
    private LocalDateTime modifieldDate;    // 수정일시

}
