@Test
    public void testHashcode() {
        ScatterRenderer r1 = new ScatterRenderer();
        ScatterRenderer r2 = new ScatterRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    