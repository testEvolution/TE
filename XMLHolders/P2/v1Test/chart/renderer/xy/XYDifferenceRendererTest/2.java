@Test
    public void testCloning() throws CloneNotSupportedException {
        XYDifferenceRenderer r1 = new XYDifferenceRenderer(Color.RED,
                Color.BLUE, false);
        XYDifferenceRenderer r2 = (XYDifferenceRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // check independence
        Shape s = r1.getLegendLine();
        if (s instanceof Line2D) {
            Line2D l = (Line2D) s;
            l.setLine(1.0, 2.0, 3.0, 4.0);
            assertFalse(r1.equals(r2));
        }
    }

    