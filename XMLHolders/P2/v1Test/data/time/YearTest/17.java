@Test
    public void testHashcode() {
        Year y1 = new Year(1988);
        Year y2 = new Year(1988);
        assertTrue(y1.equals(y2));
        int h1 = y1.hashCode();
        int h2 = y2.hashCode();
        assertEquals(h1, h2);
    }

    