package com.example.consumingrest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    String section;
    String subsection;
    String title;
    String bstract;

    String url;
    String uri;
    String byline;
    String itemType;
    String updatedDate;

    String createdDate;

    String publishedDate;

    String materialTypeFacet;
    String kicker;

    List<String> desFacet = new ArrayList<>();
    List<String> orgFacet = new ArrayList<>();
    List<String> geoFacet = new ArrayList<>();
    List<String> perFacet = new ArrayList<>();

    List<Multimedia> multimedia = new ArrayList<>();



}
