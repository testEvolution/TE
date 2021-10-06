@Test
    public void testCloning() throws CloneNotSupportedException {
        MeterPlot p1 = new MeterPlot();
        MeterPlot p2 = (MeterPlot) p1.clone();
        assertTrue(p1 != p2);
        assertTrue(p1.getClass() == p2.getClass());
        assertTrue(p1.equals(p2));

        // the clone and the original share a reference to the SAME dataset
        assertTrue(p1.getDataset() == p2.getDataset());

        // try a few checks to ensure that the clone is independent of the
        // original
        p1.getTickLabelFormat().setMinimumIntegerDigits(99);
        assertFalse(p1.equals(p2));
        p2.getTickLabelFormat().setMinimumIntegerDigits(99);
        assertTrue(p1.equals(p2));

        p1.addInterval(new MeterInterval("Test", new Range(1.234, 5.678)));
        assertFalse(p1.equals(p2));
        p2.addInterval(new MeterInterval("Test", new Range(1.234, 5.678)));
        assertTrue(p1.equals(p2));

    }

    