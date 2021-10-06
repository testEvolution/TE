@Test
    public void testDrawWithEmptyDataset() {
        boolean success = false;
        JFreeChart chart = ChartFactory.createStackedXYAreaChart("title", "x",
                "y", new DefaultTableXYDataset(), PlotOrientation.VERTICAL,
                true, false, false);
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setRenderer(new StackedXYAreaRenderer2());
        try {
            BufferedImage image = new BufferedImage(200 , 100,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
            g2.dispose();
            success = true;
        }
        catch (Exception e) {
            success = false;
        }
        assertTrue(success);
    }

    