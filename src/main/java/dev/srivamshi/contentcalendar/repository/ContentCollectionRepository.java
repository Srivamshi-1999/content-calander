package dev.srivamshi.contentcalendar.repository;

import dev.srivamshi.contentcalendar.model.Content;
import dev.srivamshi.contentcalendar.model.Status;
import dev.srivamshi.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){
    }

    public List<Content> findAll() {
        return content;
    }
    public Optional<Content> findById(Integer id){
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }
   @PostConstruct
    public void init(){
        Content c = new Content(1,
                "Dev",
                "Dev desc",
                Status.COMPLETED,
                Type.VIDEO,
                LocalDateTime.now(),
                null,
                "afskfksjf");
        content.add(c);
    }
}
