@Test
    public void testDrawWithNullInfo() {
        MeterPlot plot = new MeterPlot(new DefaultValueDataset(60.0));
        plot.addInterval(new MeterInterval("Normal", new Range(0.0, 80.0)));
        JFreeChart chart = new JFreeChart(plot);
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
        g2.dispose();
        //FIXME we should really assert a value here
    }

}