@Test
    public void testHashcode() {
        PaintScaleLegend l1 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        PaintScaleLegend l2 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        assertTrue(l1.equals(l2));
        int h1 = l1.hashCode();
        int h2 = l2.hashCode();
        assertEquals(h1, h2);
    }

    