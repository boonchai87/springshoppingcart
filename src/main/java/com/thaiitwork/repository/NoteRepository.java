package com.thaiitwork.repository;

import com.thaiitwork.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
	
}
