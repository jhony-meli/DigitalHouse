package com.example.demo.model.service;

import com.example.demo.model.dto.ImovelDto;
import com.example.demo.model.entity.Imovel;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ImovelService {


    private ModelMapper modelMapper = new ModelMapper();

    public ImovelDto imovelConvert(){
        Imovel imovel = new Imovel();
        return modelMapper.map(imovel,ImovelDto.class);
    }

    public double getTamanho() {
        Imovel imovel = new Imovel();
        return imovel.getTamanho();
    }


}
