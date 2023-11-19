package dat3.pagination.dtos;


import dat3.pagination.entity.Book;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

@Getter
@Setter
public class BookRequest {
    private String author;
    private String title;
    private double updated;
    private long created;

@Getter
@Setter
public static class Books {
    private String content;
    private String title;
    private String author;

    public Books(String content, String title, String author) {
        this.content = content;
        this.title = title;
        this.author = author;
    }
}

}

