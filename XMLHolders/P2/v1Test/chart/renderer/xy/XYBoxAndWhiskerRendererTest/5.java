@Test
    public void test2909215() {
        DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset(
                "Series");
        d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0,
                null, null, null));
        JFreeChart chart = ChartFactory.createBoxAndWhiskerChart("Title", "X",
                "Y", d1, true);
        try {
            BufferedImage image = new BufferedImage(400, 200,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = image.createGraphics();
            chart.draw(g2, new Rectangle2D.Double(0, 0, 400, 200), null, null);
            g2.dispose();
        }
        catch (Exception e) {
            fail("No exception should be thrown.");
        }
    }

}