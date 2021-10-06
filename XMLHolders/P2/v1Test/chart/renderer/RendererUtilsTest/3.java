@Test
    public void testFindLiveItemsLowerBound_Descending() {
        DefaultXYDataset d = new DefaultXYDataset() {
            @Override
            public DomainOrder getDomainOrder() {
                // we're doing this for testing only, and make sure that we
                // only add data in descending order by x-value
                return DomainOrder.DESCENDING;
            }
        };
        // check a series with no items
        d.addSeries("S1", new double[][] {{}, {}});
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 0, 10.0,
                11.0));

        // check a series with one item
        d.addSeries("S2", new double[][] {{1.0}, {9.9}});
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 1, 0.0,
                1.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 1, 1.1,
                2.0));

        // check a series with two items
        d.addSeries("S3", new double[][] {{2.0, 1.0}, {9.9, 9.9}});
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(d, 2, 0.1,
                0.5));
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(d, 2, 0.1,
                1.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 2, 1.1,
                2.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 2, 2.2,
                3.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 2, 3.3,
                4.0));

        // check a series with three items
        d.addSeries("S4", new double[][] {{3.0, 2.0, 1.0}, {9.9, 9.9, 9.9}});
        assertEquals(2, RendererUtils.findLiveItemsLowerBound(d, 3, 0.0,
                1.0));
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(d, 3, 1.0,
                2.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 3, 2.0,
                3.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 3, 3.0,
                4.0));

        // check a series with four items
        d.addSeries("S5", new double[][] {{4.0, 3.0, 2.0, 1.0}, {9.9, 9.9,
                9.9, 9.9}});
        assertEquals(3, RendererUtils.findLiveItemsLowerBound(d, 4, 0.1,
                0.5));
        assertEquals(3, RendererUtils.findLiveItemsLowerBound(d, 4, 0.1,
                1.0));
        assertEquals(2, RendererUtils.findLiveItemsLowerBound(d, 4, 1.1,
                2.0));
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(d, 4, 2.2,
                3.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 4, 3.3,
                4.0));
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 4, 4.4,
                5.0));

        // check a series with repeating items
        d.addSeries("S6", new double[][] {{3.0, 2.0, 2.0, 2.0, 1.0}, {9.9, 9.9,
                9.9, 9.9, 9.9}});
        assertEquals(0, RendererUtils.findLiveItemsLowerBound(d, 5, 0.0,
                3.0));
        assertEquals(1, RendererUtils.findLiveItemsLowerBound(d, 5, 0.0,
                2.0));
        assertEquals(4, RendererUtils.findLiveItemsLowerBound(d, 5, 0.0,
                1.0));
        assertEquals(4, RendererUtils.findLiveItemsLowerBound(d, 5, 0.0,
                0.5));
    }

    