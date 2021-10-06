@Test
    public void testCloning() throws CloneNotSupportedException {
        LegendItemCollection c1 = new LegendItemCollection();
        LegendItem item1 = new LegendItem("Item 1");
        c1.add(item1);
        LegendItemCollection c2 = (LegendItemCollection) c1.clone();

        assertNotSame(c1, c2);
        assertSame(c1.getClass(), c2.getClass());
        assertEquals(c1, c2);

        Rectangle2D item1Shape = (Rectangle2D) item1.getShape();
        item1Shape.setRect(1.0, 2.0, 3.0, 4.0);
        assertFalse(c1.equals(c2));
    }

}