@Test
    public void testGetSeries() {
        DefaultTableXYDataset d1 = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("Series 1", true, false);
        d1.addSeries(s1);
        assertEquals("Series 1", d1.getSeries(0).getKey());

        boolean pass = false;
        try {
            d1.getSeries(-1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            d1.getSeries(1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

}