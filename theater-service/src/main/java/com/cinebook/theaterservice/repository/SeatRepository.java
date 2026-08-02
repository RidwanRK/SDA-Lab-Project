package com.cinebook.theaterservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinebook.theaterservice.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

	List<Seat> findByScreenIdAndActiveTrueOrderByRowLabelAscSeatNumberAsc(Long screenId);

	Optional<Seat> findByIdAndActiveTrue(Long id);

	boolean existsByScreenId(Long screenId);

	boolean existsByCategoryIdAndActiveTrue(Long categoryId);
}
