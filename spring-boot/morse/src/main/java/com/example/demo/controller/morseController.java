package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class morseController {

    //Exemplo de chamada -> http://oclalhost:8080/convLetra/A
    @GetMapping("convLetra/{numbe}")
    public String roman2(@PathVariable String numbe) {

        String retorno = "";

        for (int i = 0; i < numbe.length(); i++) {
            switch (Character.toUpperCase(numbe.charAt(i))) {
                case 'A':
                    retorno += ".- ";
                    continue;
                case 'B':
                    retorno += "-... ";
                    continue;
                case 'C':
                    retorno += "-.-. ";
                    continue;
                case 'D':
                    retorno += "-.. ";
                    continue;
                case 'E':
                    retorno += ". ";
                    continue;
                case 'F':
                    retorno += "..-. ";
                    continue;
                case 'G':
                    retorno += "--. ";
                    continue;
                case 'H':
                    retorno += ".... ";
                    continue;
                case 'I':
                    retorno += ".. ";
                    continue;
                case 'J':
                    retorno += ".--- ";
                    continue;
                case 'K':
                    retorno += "-.- ";
                    continue;
                case 'L':
                    retorno += ".-.. ";
                    continue;
                case 'M':
                    retorno += "-- ";
                    continue;
                case 'N':
                    retorno += "-. ";
                    continue;
                case 'O':
                    retorno += "--- ";
                    continue;
                case 'P':
                    retorno += ".--. ";
                    continue;
                case 'Q':
                    retorno += "--.- ";
                    continue;
                case 'R':
                    retorno += ".-. ";
                    continue;
                case 'S':
                    retorno += "... ";
                    continue;
                case 'T':
                    retorno += "- ";
                    continue;
                case 'U':
                    retorno += "..- ";
                    continue;
                case 'V':
                    retorno += "...- ";
                    continue;
                case 'W':
                    retorno += ".-- ";
                    continue;
                case 'X':
                    retorno += "-..- ";
                    continue;
                case 'Y':
                    retorno += "-.-- ";
                    continue;
                case 'Z':
                    retorno += "--.. ";
                    continue;
                case '0':
                    retorno += "----- ";
                    continue;
                case '1':
                    retorno += ".--- ";
                    continue;
                case '2':
                    retorno += "..--- ";
                    continue;
                case '3':
                    retorno += "...-- ";
                    continue;
                case '4':
                    retorno += "....- ";
                    continue;
                case '5':
                    retorno += "..... ";
                    continue;
                case '6':
                    retorno += "-.... ";
                    continue;
                case '7':
                    retorno += "--... ";
                    continue;
                case '8':
                    retorno += "---.. ";
                    continue;
                case '9':
                    retorno += "----. ";
                    continue;

                // O espaco em branco nao consta no codigo Morse.
                // No codigo, o espaco em branco eh representado
                //    por um intervalo de tempo sem transmissao de
                //    informacoes.
                case ' ':
                    retorno += "   ";
                    continue;

                default: // Caracter nao suportado
                    break;
            }
            return retorno;
        }
    return retorno;
    }

}