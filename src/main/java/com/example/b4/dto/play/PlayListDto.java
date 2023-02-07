package com.example.b4.dto.play;

import com.example.b4.entity.post.play.PlayCategory;
import com.example.b4.entity.post.play.PlayStatus;

import java.time.LocalDateTime;

public class PlayListDto {
    private String title;
    private String user;
    private String category;
    private String status;
    private String createdAt;
    private String playAttachedFile;
    private boolean bookmark;
}