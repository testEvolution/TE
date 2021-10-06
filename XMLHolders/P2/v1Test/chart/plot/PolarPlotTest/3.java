@Test
    public void testCloning() throws CloneNotSupportedException {
        PolarPlot p1 = new PolarPlot();
        PolarPlot p2 = (PolarPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check independence
        p1.addCornerTextItem("XYZ");
        assertFalse(p1.equals(p2));
        p2.addCornerTextItem("XYZ");
        assertTrue(p1.equals(p2));

        p1 = new PolarPlot(new DefaultXYDataset(), new NumberAxis("A1"),
                new DefaultPolarItemRenderer());
        p2 = (PolarPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // check independence
        p1.getAxis().setLabel("ABC");
        assertFalse(p1.equals(p2));
        p2.getAxis().setLabel("ABC");
        assertTrue(p1.equals(p2));
    }

    