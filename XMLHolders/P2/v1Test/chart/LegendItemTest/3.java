@Test
    public void testCloning() throws CloneNotSupportedException {
        LegendItem item1 = new LegendItem("Item");
        LegendItem item2 = (LegendItem) item1.clone();

        assertNotSame(item1, item2);
        assertSame(item1.getClass(), item2.getClass());
        assertEquals(item1, item2);

        // the clone references the same dataset as the original
        assertSame(item1.getDataset(), item2.getDataset());
    }

}