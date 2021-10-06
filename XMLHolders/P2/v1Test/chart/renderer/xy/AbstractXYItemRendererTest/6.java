@Test
    public void testEquals_ObjectList() {
        XYBarRenderer r1 = new XYBarRenderer();
        r1.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator());
        XYBarRenderer r2 = new XYBarRenderer();
        r2.setSeriesItemLabelGenerator(0, new StandardXYItemLabelGenerator());
        assertEquals(r1, r2);
        r2.setSeriesItemLabelGenerator(1, new StandardXYItemLabelGenerator("X"));
        assertNotEquals(r1, r2);
    }

    