@Test
    public void testEquals() {
        XYPlot plot1 = new XYPlot();
        LegendTitle t1 = new LegendTitle(plot1);
        LegendTitle t2 = new LegendTitle(plot1);
        assertEquals(t1, t2);

        t1.setBackgroundPaint(
            new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.YELLOW)
        );
        assertFalse(t1.equals(t2));
        t2.setBackgroundPaint(
            new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.YELLOW)
        );
        assertTrue(t1.equals(t2));

        t1.setLegendItemGraphicEdge(RectangleEdge.BOTTOM);
        assertFalse(t1.equals(t2));
        t2.setLegendItemGraphicEdge(RectangleEdge.BOTTOM);
        assertTrue(t1.equals(t2));

        t1.setLegendItemGraphicAnchor(RectangleAnchor.BOTTOM_LEFT);
        assertFalse(t1.equals(t2));
        t2.setLegendItemGraphicAnchor(RectangleAnchor.BOTTOM_LEFT);
        assertTrue(t1.equals(t2));

        t1.setLegendItemGraphicLocation(RectangleAnchor.TOP_LEFT);
        assertFalse(t1.equals(t2));
        t2.setLegendItemGraphicLocation(RectangleAnchor.TOP_LEFT);
        assertTrue(t1.equals(t2));

        t1.setItemFont(new Font("Dialog", Font.PLAIN, 19));
        assertFalse(t1.equals(t2));
        t2.setItemFont(new Font("Dialog", Font.PLAIN, 19));
        assertTrue(t1.equals(t2));

        t1.setSortOrder(SortOrder.DESCENDING);
        assertFalse(t1.equals(t2));
        t2.setSortOrder(SortOrder.DESCENDING);
        assertTrue(t1.equals(t2));
    }

    