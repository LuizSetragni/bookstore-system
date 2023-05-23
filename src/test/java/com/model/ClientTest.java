package com.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    private Client client;
    private String name;
    private String address;
    private String phone;

    @Before
    public void setUp() {
        this.name = "Laura Palmer";
        this.address = "Rua Cooper";
        this.phone = "31987456210";
        this.client = new Client(name, address, phone);
    }

    @Test
    public void deveRetornarName() {
        assertEquals(name, client.getName());
    }

    @Test
    public void deveSetarName() {
        client.setName("Audrey Horne");
        assertEquals("Audrey Horne", client.getName());
    }

    @Test
    public void deveRetornarAddress() {
        assertEquals(address, client.getAddress());
    }

    @Test
    public void deveSetarAddress() {
        client.setAddress("Rua Black Lodge");
        assertEquals("Rua Black Lodge", client.getAddress());
    }

    @Test
    public void deveRetornarPhone() {
        assertEquals(phone, client.getPhone());
    }

    @Test
    public void deveSetarPhone() {
        client.setPhone("31956231045");
        assertEquals("31956231045", client.getPhone());
    }

    @Test
    public void deveImprimirClient() {
        client.showDatails();
    }
}
