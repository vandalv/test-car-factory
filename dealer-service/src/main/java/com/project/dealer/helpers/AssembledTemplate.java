package com.project.dealer.helpers;

import com.project.dealer.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.StreamingHttpOutputMessage;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssembledTemplate {

    private Orders orders;
    private StreamingHttpOutputMessage.Body body;
    private Engine engine;
    private List<Equipment> additionalEquipment = new ArrayList<>();
}
