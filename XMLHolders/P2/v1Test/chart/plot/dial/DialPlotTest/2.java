@Test
    public void testHashCode() {
        DialPlot p1 = new DialPlot();
        DialPlot p2 = new DialPlot();
        assertTrue(p1.equals(p2));
        int h1 = p1.hashCode();
        int h2 = p2.hashCode();
        assertEquals(h1, h2);
    }

    