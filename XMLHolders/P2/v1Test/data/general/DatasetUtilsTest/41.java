@Test
    public void testSampleFunction2D() {
        Function2D f = new LineFunction2D(0, 1);
        XYDataset dataset = DatasetUtils.sampleFunction2D(f, 0.0, 1.0, 2,
                "S1");
        assertEquals(1, dataset.getSeriesCount());
        assertEquals("S1", dataset.getSeriesKey(0));
        assertEquals(2, dataset.getItemCount(0));
        assertEquals(0.0, dataset.getXValue(0, 0), EPSILON);
        assertEquals(0.0, dataset.getYValue(0, 0), EPSILON);
        assertEquals(1.0, dataset.getXValue(0, 1), EPSILON);
        assertEquals(1.0, dataset.getYValue(0, 1), EPSILON);
    }

    