package net.MatheusMedeiros.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class ContactFormImplementationService implements ContactFormService {

    @Override
    public String returnMessage(String name, String email, Integer age, String typeMessage, String writeHereYourMessage) {
        if((age < 18)&& (typeMessage.equals("Dúvida"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if(((age >= 18)&&(age <= 60))&& (typeMessage.equals("Dúvida"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if((age > 60)&& (typeMessage.equals("Dúvida"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if((age < 18)&& (typeMessage.equals("Sugestão"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if(((age >= 18)&&(age <= 60))&& (typeMessage.equals("Sugestão"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if((age > 60)&& (typeMessage.equals("Sugestão"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if((age < 18)&& (typeMessage.equals("Reclamação"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if(((age >= 18)&&(age <= 60))&& (typeMessage.equals("Reclamação"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }

        if((age > 60)&& (typeMessage.equals("Reclamação"))&&(name != "") && (email != "") && (writeHereYourMessage!="") ) {
            return "Mensagem enviada com sucesso!";
        }


        return "Sua mensagem não pôde ser enviada no momento! Tente mais tarde.";

    }
}
