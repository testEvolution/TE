@Test
    public void testHashcode() {
        XYDifferenceRenderer r1
            = new XYDifferenceRenderer(Color.RED, Color.BLUE, false);
        XYDifferenceRenderer r2
            = new XYDifferenceRenderer(Color.RED, Color.BLUE, false);
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    