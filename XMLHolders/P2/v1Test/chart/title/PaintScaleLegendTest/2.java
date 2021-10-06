@Test
    public void testCloning() throws CloneNotSupportedException {
        PaintScaleLegend l1 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        PaintScaleLegend l2 = (PaintScaleLegend) l1.clone();
        assertTrue(l1 != l2);
        assertTrue(l1.getClass() == l2.getClass());
        assertTrue(l1.equals(l2));
    }

    