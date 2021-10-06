@Test
    public void testEquals_ObjectList2() {
        XYBarRenderer r1 = new XYBarRenderer();
        r1.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator());
        XYBarRenderer r2 = new XYBarRenderer();
        r2.setSeriesToolTipGenerator(0, new StandardXYToolTipGenerator());
        assertEquals(r1, r2);
        r2.setSeriesToolTipGenerator(1, new StandardXYToolTipGenerator());
        assertNotEquals(r1, r2);
    }

}