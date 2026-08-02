package com.cinebook.bookingservice.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record CreateBookingRequest(
		@NotBlank String customerName,
		@NotBlank String customerEmail,
		@NotNull Long movieId,
		@NotNull Long theaterId,
		@NotNull @FutureOrPresent LocalDateTime showTime,
		@NotNull @Min(1) Integer seatCount
) {
}
