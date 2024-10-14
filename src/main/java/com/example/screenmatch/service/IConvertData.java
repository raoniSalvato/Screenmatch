package com.example.screenmatch.service;

public interface IConvertData {

    <T> T getData(String json, Class<T> claee);
}
