package com.docker.tutorial.controller;

import com.docker.tutorial.model.Board;
import com.docker.tutorial.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/boards")
public class BoardApiController {
    private BoardService service;

    public BoardApiController(BoardService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Board findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Board save(@RequestBody Board board) {
        return service.saveBoard(board);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}