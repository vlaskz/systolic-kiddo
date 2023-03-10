package io.vlaskz.todo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class Todo {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private TodoStatus status;
    @JsonProperty("creation_date")
    private Date creationDate;
    @JsonProperty("last_update_date")
    private Date lastUpdateDate;

}
