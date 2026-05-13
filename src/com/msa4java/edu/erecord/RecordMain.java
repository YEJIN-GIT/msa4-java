package com.msa4java.edu.erecord;

public class RecordMain {
    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO("제목1", "내용1");
        PostRecord postRecord = new PostRecord("제목2", "내용2");

        // Getter 호출
        System.out.println(postDTO.getTitle()); // 제목1
        // 레코드로 만들면 프로퍼티명으로 get해온다.
        System.out.println(postRecord.title()); // 제목2

        System.out.println(postDTO.toString()); // com.msa4java.edu.erecord.PostDTO@776ec8df 주소값 출력
        System.out.println(postRecord.toString()); // PostRecord[title=제목2, content=내용2] 출력
    }
}
