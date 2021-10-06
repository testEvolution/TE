@Test
    public void testRefreshTicksWithZeroTickUnit() {
        LogAxis axis = new LogAxis();
        AxisState state = new AxisState();
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0.0, 0.0, 200, 100);
        axis.refreshTicks(g2, state, area, RectangleEdge.TOP);
    }
}