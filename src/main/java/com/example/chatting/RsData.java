package com.example.chatting;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RsData<T> {

    private String resultCode;
    private String msg;
    private T data;

}
