@Test
    public void testCloning() throws CloneNotSupportedException {
        SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset());
        Rectangle2D legendShape = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        p1.setLegendItemShape(legendShape);
        SpiderWebPlot p2 = (SpiderWebPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // change the legendItemShape
        legendShape.setRect(4.0, 3.0, 2.0, 1.0);
        assertFalse(p1.equals(p2));
        p2.setLegendItemShape(legendShape);
        assertTrue(p1.equals(p2));

        // change a series paint
        p1.setSeriesPaint(1, Color.BLACK);
        assertFalse(p1.equals(p2));
        p2.setSeriesPaint(1, Color.BLACK);
        assertTrue(p1.equals(p2));

        // change a series outline paint
        p1.setSeriesOutlinePaint(0, Color.RED);
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlinePaint(0, Color.RED);
        assertTrue(p1.equals(p2));

        // change a series outline stroke
        p1.setSeriesOutlineStroke(0, new BasicStroke(1.1f));
        assertFalse(p1.equals(p2));
        p2.setSeriesOutlineStroke(0, new BasicStroke(1.1f));
        assertTrue(p1.equals(p2));

    }

    