@Test
    public void testGetSerialIndex() {
        Week w = new Week(1, 2000);
        assertEquals(106001L, w.getSerialIndex());
        w = new Week(1, 1900);
        assertEquals(100701L, w.getSerialIndex());
    }

    