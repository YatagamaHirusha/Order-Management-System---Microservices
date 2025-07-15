package com.hirusha.Order_Service.DTO;

import com.hirusha.Order_Service.Model.Status;

import java.time.LocalDateTime;

public record OrderRequest(
        int user_id,
        int product_id,
        Double total_price,
        Status status
) {
}
