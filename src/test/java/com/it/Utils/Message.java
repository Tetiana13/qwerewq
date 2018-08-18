package com.it.Utils;

public class Message {

    private String SendTo;
    private String Address;
    private String TextMessage;

    public void setTo(String to) {
        SendTo = to;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setTextMessage(String textMessage) {
        TextMessage = textMessage;
    }



    public String getTo() {
        return SendTo;
    }

    public String getAddress() {
        return Address;
    }

    public String getTextMessage() {
        return TextMessage;
    }


    public Message(String to, String address, String textMessage) {
        SendTo = to;
        Address = address;
        TextMessage = textMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "SendTo='" + SendTo + '\'' +
                ", Address='" + Address + '\'' +
                ", TextMessage='" + TextMessage + '\'' +
                '}';
    }


}
