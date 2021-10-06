@Test  
    public void testBugX() {
        RectangleConstraint constraint = new RectangleConstraint(
                new Range(0.0, 200.0), new Range(0.0, 100.0));
        BlockContainer container = new BlockContainer(new BorderArrangement());
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        container.add(new EmptyBlock(10.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(20.0, 6.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(30.0, 6.0));
        Size2D size = container.arrange(g2, constraint);
        assertEquals(60.0, size.width, EPSILON);
        assertEquals(6.0, size.height, EPSILON);

        container.clear();
        container.add(new EmptyBlock(10.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(20.0, 6.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(300.0, 6.0));
        size = container.arrange(g2, constraint);
        assertEquals(200.0, size.width, EPSILON);
        assertEquals(6.0, size.height, EPSILON);
    }
}