package com.msa4java.edu.erecord;

// 유저한테 전달한 값을 저장하는 객체로서 외부에서 변경 막아둠
public class PostDTO {
    private final String title;
    private final String content;

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
