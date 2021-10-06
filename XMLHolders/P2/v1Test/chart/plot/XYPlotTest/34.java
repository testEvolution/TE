@Test
    public void testGetDomainAxisForDataset() {
        XYDataset dataset = new XYSeriesCollection();
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYItemRenderer renderer = new DefaultXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        assertEquals(xAxis, plot.getDomainAxisForDataset(0));

        // should get IllegalArgumentException for negative index
        boolean pass = false;
        try {
            plot.getDomainAxisForDataset(-1);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // if multiple axes are mapped, the first in the list should be
        // returned...
        NumberAxis xAxis2 = new NumberAxis("X2");
        plot.setDomainAxis(1, xAxis2);
        assertEquals(xAxis, plot.getDomainAxisForDataset(0));

        plot.mapDatasetToDomainAxis(0, 1);
        assertEquals(xAxis2, plot.getDomainAxisForDataset(0));

        List<Integer> axisIndices = Arrays.asList(new Integer[] {0, 1});
        plot.mapDatasetToDomainAxes(0, axisIndices);
        assertEquals(xAxis, plot.getDomainAxisForDataset(0));

        axisIndices = Arrays.asList(new Integer[] {1, 2});
        plot.mapDatasetToDomainAxes(0, axisIndices);
        assertEquals(xAxis2, plot.getDomainAxisForDataset(0));
    }

    