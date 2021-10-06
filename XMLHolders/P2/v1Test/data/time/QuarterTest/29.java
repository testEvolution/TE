@Test
    public void testGetSerialIndex() {
        Quarter q = new Quarter(1, 2000);
        assertEquals(8001L, q.getSerialIndex());
        q = new Quarter(1, 1900);
        assertEquals(7601L, q.getSerialIndex());
    }

    