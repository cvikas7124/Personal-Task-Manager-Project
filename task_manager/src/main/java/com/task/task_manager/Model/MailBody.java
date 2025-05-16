package com.task.task_manager.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
@AllArgsConstructor
public class MailBody  {
    
    private String to;
    private String subject;
    private String text;
}
