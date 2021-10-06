@Test
    public void testStandard() {
        TimeTableXYDataset d = new TimeTableXYDataset();
        d.add(new Year(1999), 1.0, "Series 1");
        assertEquals(d.getItemCount(), 1);
        assertEquals(d.getSeriesCount(), 1);
        d.add(new Year(2000), 2.0, "Series 2");
        assertEquals(d.getItemCount(), 2);
        assertEquals(d.getSeriesCount(), 2);
        assertEquals(d.getYValue(0, 0), 1.0, DELTA);
        assertTrue(Double.isNaN(d.getYValue(0, 1)));
        assertTrue(Double.isNaN(d.getYValue(1, 0)));
        assertEquals(d.getYValue(1, 1), 2.0, DELTA);
    }

    