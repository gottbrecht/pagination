package dat3.pagination.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {
    private String id;
    private long created;
    private double updated;

    @Getter
    @Setter
    public static class Books {
        private String content;
        private String title;
        private String author;
    }
}
