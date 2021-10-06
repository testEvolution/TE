@Test
    public void testGetSerialIndex() {
        Millisecond m = new Millisecond(500, 1, 1, 1, 1, 1, 2000);
        assertEquals(3155850061500L, m.getSerialIndex());
        m = new Millisecond(500, 1, 1, 1, 1, 1, 1900);
        // TODO: this must be wrong...
        assertEquals(176461500L, m.getSerialIndex());
    }

    