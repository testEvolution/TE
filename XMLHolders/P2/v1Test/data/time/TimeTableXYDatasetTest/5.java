@Test
    public void testClear() {
        TimeTableXYDataset d = new TimeTableXYDataset();
        d.add(new Year(1999), 1.0, "Series 1");
        assertEquals(d.getItemCount(), 1);
        assertEquals(d.getSeriesCount(), 1);
        d.add(new Year(2000), 2.0, "Series 2");

        d.clear();
        // Make sure there's nothing left
        assertEquals(0, d.getItemCount());
        assertEquals(0, d.getSeriesCount());
    }

}