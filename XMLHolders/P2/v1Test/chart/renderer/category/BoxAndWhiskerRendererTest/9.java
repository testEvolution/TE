@Test
    public void testBug1572478Horizontal() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset() {

            @Override
            public Number getQ1Value(int row, int column) {
                return null;
            }

            @Override
            public Number getQ1Value(Comparable rowKey, Comparable columnKey) {
                return null;
            }
        };
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(10.0);
        values.add(100.0);
        dataset.add(values, "row", "column");
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("x"),
                new NumberAxis("y"), new BoxAndWhiskerRenderer());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        JFreeChart chart = new JFreeChart(plot);
        boolean success;

        try {
            BufferedImage image = new BufferedImage(200 , 100,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
                    new ChartRenderingInfo());
            g2.dispose();
            success = true;
        }
        catch (Exception e) {
            success = false;
        }

        assertTrue(success);

    }

    