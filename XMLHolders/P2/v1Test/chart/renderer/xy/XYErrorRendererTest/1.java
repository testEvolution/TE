@Test
    public void testHashcode() {
        XYErrorRenderer r1 = new XYErrorRenderer();
        XYErrorRenderer r2 = new XYErrorRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    