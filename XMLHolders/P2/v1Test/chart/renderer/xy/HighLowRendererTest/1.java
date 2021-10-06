@Test
    public void testHashcode() {
        HighLowRenderer r1 = new HighLowRenderer();
        HighLowRenderer r2 = new HighLowRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    