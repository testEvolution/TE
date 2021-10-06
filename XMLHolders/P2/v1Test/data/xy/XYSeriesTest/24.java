@Test
    public void testBug1955483() {
        XYSeries series = new XYSeries("Series", true, true);
        series.addOrUpdate(1.0, 1.0);
        series.addOrUpdate(1.0, 2.0);
        assertEquals(1.0, series.getY(0));
        assertEquals(2.0, series.getY(1));
        assertEquals(2, series.getItemCount());
    }

    