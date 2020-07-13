package org.example;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class LogModel {
    private String logId;
    private String operateUser;
    private LocalDateTime operateTime;
    private String content;
}
