package com.ltdd.bt104.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MediaResponse {
    private Long id;
    private String title;
    private String description;
    private String type;
    private String url;
    private boolean isPublic;
}