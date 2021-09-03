package com.example.demo.model.service;

import com.example.demo.model.entity.Imovel;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {


    public double getTamanho() {
        Imovel imovel = new Imovel();
        return imovel.getTamanho();
    }


}
