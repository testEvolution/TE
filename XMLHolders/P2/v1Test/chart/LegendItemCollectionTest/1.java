@Test
    public void testSerialization() {
        LegendItemCollection c1 = new LegendItemCollection();
        c1.add(new LegendItem("Item", "Description", "ToolTip", "URL",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), Color.RED));
        LegendItemCollection c2 = (LegendItemCollection) TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    