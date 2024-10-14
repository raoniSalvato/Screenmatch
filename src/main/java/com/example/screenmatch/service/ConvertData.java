package com.example.screenmatch.service;


import com.example.screenmatch.model.DataSeries;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData{

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> claee) {
        try {
            return mapper.readValue(json, claee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
