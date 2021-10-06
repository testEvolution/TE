@Test
    public void testUpdate() {
        XYSeries series = new XYSeries("S1");
        series.add(Integer.valueOf(1), Integer.valueOf(2));
        assertEquals(2, series.getY(0));
        series.update(Integer.valueOf(1), Integer.valueOf(3));
        assertEquals(3, series.getY(0));
        try {
            series.update(2, 99);
            assertTrue(false);
        }
        catch (SeriesException e) {
            // got the required exception
        }
    }

    