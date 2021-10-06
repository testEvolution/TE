@Test
    public void testGetSerialIndex() {
        Month m = new Month(1, 2000);
        assertEquals(24001L, m.getSerialIndex());
        m = new Month(1, 1900);
        assertEquals(22801L, m.getSerialIndex());
    }

    