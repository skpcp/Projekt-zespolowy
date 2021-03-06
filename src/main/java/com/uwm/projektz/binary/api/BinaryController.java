package com.uwm.projektz.binary.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.base.dto.ResponseDTO;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.dto.BinaryDTOCreate;
import com.uwm.projektz.binary.service.IBinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@RestController
@RequestMapping(value="/projektz/binaries")
public class BinaryController {

    @Autowired
    IBinaryService binaryService;

    @RequestMapping(value = "getBinaryById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BinaryDTO> findBinaryById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(binaryService.findBinaryById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAllBinaries", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<BinaryDTO>> findAllBinary(){
        return new ResponseEntity<>(binaryService.findAllBinary(),HttpStatus.OK);
    }

    @RequestMapping(value ="/saveBinary", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<BinaryDTO> saveBinary(@RequestBody BinaryDTOCreate aBinaryDTO){
        return new ResponseEntity<>(binaryService.saveBinary(aBinaryDTO),HttpStatus.OK);
    }

    @RequestMapping(value= "/removeBinaryById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> deleteBinary(@PathVariable("id")Long aId)
    {
        try {
            binaryService.deleteBinaryById(aId);
            return new ResponseEntity<>(new ResponseDTO("Binary deleted"),HttpStatus.OK);
        } catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }

    }
}
