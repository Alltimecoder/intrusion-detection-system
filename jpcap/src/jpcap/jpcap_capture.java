/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpcap;

import jpcap.packet.Packet;

/**
 *
 * @author home
 */
public class jpcap_capture implements PacketReceiver{
    public void recievePacket(Packet packet){
        MainProgram.outputText.append(packet.toString()+"\n-------------------------------------------------"+"-------------------------------------------------\n\n");
    }

    @Override
    public void receivePacket(Packet packet) {
          MainProgram.outputText.append(packet.toString()+"\n-------------------------------------------------"+"-------------------------------------------------\n\n");
    }
}