package com.uwm.projektz.binary.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by wojni on 11.03.2016.
 */

@ApiModel
public class BinaryDTO extends BaseDTO {
    private String binary;

    public BinaryDTO(Long id, Date techDate, String binary) {
        super(id, techDate);
        this.binary = binary;
    }

    public BinaryDTO(String binary) {
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
}


