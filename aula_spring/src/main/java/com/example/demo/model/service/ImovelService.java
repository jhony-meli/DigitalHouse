package com.example.demo.model.service;

import com.example.demo.model.dto.ImovelDto;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {


    public double getTamanho() {
        ImovelDto imovelDto = new ImovelDto();
        return imovelDto.getTamanho();
    }

}
