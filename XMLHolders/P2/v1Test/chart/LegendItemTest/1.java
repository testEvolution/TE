@Test
    public void testSerialization() {
        LegendItem item1 = new LegendItem("Item", "Description",
                "ToolTip", "URL",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new GradientPaint(
                        5.0f, 6.0f, Color.BLUE, 7.0f, 8.0f, Color.GRAY));
        item1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW));
        item1.setOutlinePaint(new GradientPaint(4.0f, 3.0f, Color.GREEN, 2.0f,
                1.0f, Color.RED));
        item1.setLinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE, 3.0f,
                4.0f, Color.RED));
        LegendItem item2;
        item2 = (LegendItem) TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

    