/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

/**
 *
 * @author Nano
 */
public class DoublyLinkedList {

    String data;
    DoublyLinkedList prev;
    DoublyLinkedList next;

    public DoublyLinkedList() {
        this.prev = null;
        this.next = null;
    }

    DoublyLinkedList(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
