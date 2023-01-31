package org.oss.LibraryManagementSystem.services;

import org.oss.LibraryManagementSystem.dto.WorkPayload;
import org.oss.LibraryManagementSystem.models.Work;
import org.springframework.data.domain.Page;

public interface WorkService {

    Page<Work> getAllWorks(String keyword, int page, int size, String[] sort);

    void deleteWorkById (Integer id);

    Work createWork (WorkPayload workPayload);
}
