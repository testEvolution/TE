@Test
    public void testEquals() {

        LegendItemCollection c1 = new LegendItemCollection();
        LegendItemCollection c2 = new LegendItemCollection();
        assertEquals(c1, c2);
        assertEquals(c2, c1);

        LegendItem item1 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), true, Color.RED,
                true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.GREEN);
        LegendItem item2 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.RED, true, Color.BLUE, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.GREEN);
        c1.add(item1);
        assertFalse(c1.equals(c2));
        c2.add(item2);
        assertEquals(c1, c2);

    }

    