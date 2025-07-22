package com.metaverse.community_app.board.repository;

import com.metaverse.community_app.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
