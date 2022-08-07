package com.docker.tutorial.service;

import com.docker.tutorial.model.Board;
import com.docker.tutorial.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository repository;

    @Transactional(readOnly = true)
    public Board findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Board ID is invalid"));
    }

    @Transactional
    public Board saveBoard(Board board) {
        return repository.save(board);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}