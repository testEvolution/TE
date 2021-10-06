@Test
    public void testEquals_ObjectList3() {
        BarRenderer r1 = new BarRenderer();
        r1.setSeriesPositiveItemLabelPosition(0, 
                new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        BarRenderer r2 = new BarRenderer();
        r2.setSeriesPositiveItemLabelPosition(0, 
                new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
        assertEquals(r1, r2);
        r2.setSeriesPositiveItemLabelPosition(1, 
                new ItemLabelPosition(ItemLabelAnchor.INSIDE1, TextAnchor.CENTER));
        assertNotEquals(r1, r2);
    }

    