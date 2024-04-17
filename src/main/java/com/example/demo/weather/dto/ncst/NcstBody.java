package com.example.demo.weather.dto.ncst;

import java.util.List;
import lombok.Data;

@Data
public class NcstBody {
    private String dataType;
    private List<NcstItem> items;
    private int pageNo;
    private int numOfRows;
    private int totalCount;
}
