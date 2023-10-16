package org.First;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoDto {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
}