@Test
    public void testSerialization() {
        SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset());
        SpiderWebPlot p2 = (SpiderWebPlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    