@Test
    public void testBug1766646A() {
        XYBlockRenderer r = new XYBlockRenderer();
        Range range = r.findDomainBounds(null);
        assertTrue(range == null);
        DefaultXYZDataset emptyDataset = new DefaultXYZDataset();
        range = r.findDomainBounds(emptyDataset);
        assertTrue(range == null);
    }

    