@Test
    public void testGetSerialIndex() {
        Hour h = new Hour(1, 1, 1, 2000);
        assertEquals(876625L, h.getSerialIndex());
        h = new Hour(1, 1, 1, 1900);
        assertEquals(49L, h.getSerialIndex());
    }

    