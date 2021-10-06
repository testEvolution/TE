@Test
    public void testDrawSeriesWithZeroItems() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries("Series 1", new double[][] {{1.0, 2.0}, {3.0, 4.0}});
        dataset.addSeries("Series 2", new double[][] {{}, {}});
        JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y",
                dataset, PlotOrientation.VERTICAL, true, false, false);
        try {
            BufferedImage image = new BufferedImage(200 , 100,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
            g2.dispose();
        }
        catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

    