@Test
    public void testEquals() {
        XYDotRenderer r1 = new XYDotRenderer();
        XYDotRenderer r2 = new XYDotRenderer();
        assertEquals(r1, r2);

        r1.setDotWidth(11);
        assertFalse(r1.equals(r2));
        r2.setDotWidth(11);
        assertTrue(r1.equals(r2));

        r1.setDotHeight(12);
        assertFalse(r1.equals(r2));
        r2.setDotHeight(12);
        assertTrue(r1.equals(r2));

        r1.setLegendShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertFalse(r1.equals(r2));
        r2.setLegendShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(r1.equals(r2));
    }

    