@Test
    public void testDrawWithNullInfo2() {
        JFreeChart chart = createGanttChart();
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDataset(createDataset());
        /* BufferedImage img =*/ chart.createBufferedImage(300, 200, null);
        //FIXME we should really assert a value
    }

    