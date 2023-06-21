package com.kh.spring.board.model.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.kh.spring.board.model.vo.Board;

public interface BoardService {

	List<Board> selectBoardList(RowBounds rowBounds);

	int selectTotalRecord();

	int insertBoard(Board board);

	Board selectOneBoard(int boardNo);

	int updateCountBoard(int boardNo);
}
