@Test
    public void testHashcode() {
        LegendGraphic g1 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), Color.BLACK);
        LegendGraphic g2 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), Color.BLACK);
        assertTrue(g1.equals(g2));
        int h1 = g1.hashCode();
        int h2 = g2.hashCode();
        assertEquals(h1, h2);
    }

    