@Test
    public void testGetSerialIndex() {
        Day d = new Day(1, 1, 1900);
        assertEquals(2, d.getSerialIndex());
        d = new Day(15, 4, 2000);
        assertEquals(36631, d.getSerialIndex());
    }

    