@Test
    public void testAddOrUpdate() {
        XYSeries series = new XYSeries("S1", true, false);
        XYDataItem old = series.addOrUpdate(Long.valueOf(1), Long.valueOf(2));
        assertTrue(old == null);
        assertEquals(1, series.getItemCount());
        assertEquals(2L, series.getY(0));

        old = series.addOrUpdate(Long.valueOf(2), Long.valueOf(3));
        assertTrue(old == null);
        assertEquals(2, series.getItemCount());
        assertEquals(3L, series.getY(1));

        old = series.addOrUpdate(Long.valueOf(1), Long.valueOf(99));
        assertEquals(new XYDataItem(Long.valueOf(1), Long.valueOf(2)), old);
        assertEquals(2, series.getItemCount());
        assertEquals(99L, series.getY(0));
        assertEquals(3L, series.getY(1));
    }

    