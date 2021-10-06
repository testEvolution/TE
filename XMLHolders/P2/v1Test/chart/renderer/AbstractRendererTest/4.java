@Test
    public void testEquals_ObjectList4() {
        BarRenderer r1 = new BarRenderer();
        r1.setSeriesNegativeItemLabelPosition(0, 
                new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        BarRenderer r2 = new BarRenderer();
        r2.setSeriesNegativeItemLabelPosition(0, 
                new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertEquals(r1, r2);
        r2.setSeriesNegativeItemLabelPosition(1, 
                new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertNotEquals(r1, r2);
    }

    