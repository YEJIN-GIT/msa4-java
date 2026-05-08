package com.msa4java.edu.error;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // (자바 7버전 부터) 알아서 close해준다.
        try(
                FileWriter file = new FileWriter("text.txt");
        ) {
            file.write("안녕");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // (자바 이전버전) 일일이 close해줘야 한다.
//        FileWriter file = null;
//        try {
//            file = new FileWriter("text.txt");
//            file.write("안녕");
//        } catch (IOException e) {
//            e.printStackTrace();    // 콘솔에 표시
//        } finally {
//            try {   // 안열였을때 close하면 에러나므로 try묶어준다
//                file.close();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
