package com.example.consumingrest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Multimedia {

    String url;
    String format;

    long height;
    long width;
    String subtype;
    String caption;
    String copyright;

}
