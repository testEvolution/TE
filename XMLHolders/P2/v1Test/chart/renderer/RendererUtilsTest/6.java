@Test
    public void testFindLiveItemsUpperBound_Ascending() {
        DefaultXYDataset d = new DefaultXYDataset() {
            @Override
            public DomainOrder getDomainOrder() {
                // we're doing this for testing only, and make sure that we
                // only add data in ascending order by x-value
                return DomainOrder.ASCENDING;
            }
        };
        // check a series with no items
        d.addSeries("S1", new double[][] {{}, {}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 0, 10.0,
                11.1));

        // check a series with one item
        d.addSeries("S2", new double[][] {{1.0}, {9.9}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 1, 0.0,
                1.1));
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 1, 2.0,
                2.2));

        // check a series with two items
        d.addSeries("S3", new double[][] {{1.0, 2.0}, {9.9, 9.9}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 2, 0.0,
                1.0));
        assertEquals(1, RendererUtils.findLiveItemsUpperBound(d, 2, 1.0,
                2.2));
        assertEquals(1, RendererUtils.findLiveItemsUpperBound(d, 2, 2.0,
                3.3));
        assertEquals(1, RendererUtils.findLiveItemsUpperBound(d, 2, 3.0,
                4.4));

        // check a series with three items
        d.addSeries("S4", new double[][] {{1.0, 2.0, 3.0}, {9.9, 9.9, 9.9}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 3, 0.0,
                1.1));
        assertEquals(1, RendererUtils.findLiveItemsUpperBound(d, 3, 1.0,
                2.2));
        assertEquals(2, RendererUtils.findLiveItemsUpperBound(d, 3, 2.0,
                3.3));
        assertEquals(2, RendererUtils.findLiveItemsUpperBound(d, 3, 3.0,
                4.4));

        // check a series with four items
        d.addSeries("S5", new double[][] {{1.0, 2.0, 3.0, 4.0}, {9.9, 9.9,
                9.9, 9.9}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 4, 0.0,
                1.1));
        assertEquals(1, RendererUtils.findLiveItemsUpperBound(d, 4, 1.0,
                2.2));
        assertEquals(2, RendererUtils.findLiveItemsUpperBound(d, 4, 2.0,
                3.3));
        assertEquals(3, RendererUtils.findLiveItemsUpperBound(d, 4, 3.0,
                4.4));
        assertEquals(3, RendererUtils.findLiveItemsUpperBound(d, 4, 4.0,
                5.5));

        // check a series with repeating items
        d.addSeries("S5", new double[][] {{1.0, 2.0, 2.0, 2.0, 3.0}, {9.9, 9.9,
                9.9, 9.9, 9.9}});
        assertEquals(0, RendererUtils.findLiveItemsUpperBound(d, 4, 0.0,
                1.0));
        assertEquals(3, RendererUtils.findLiveItemsUpperBound(d, 4, 0.0,
                2.0));
        assertEquals(4, RendererUtils.findLiveItemsUpperBound(d, 4, 0.0,
                3.0));
        assertEquals(4, RendererUtils.findLiveItemsUpperBound(d, 4, 0.0,
                4.0));

    }

    