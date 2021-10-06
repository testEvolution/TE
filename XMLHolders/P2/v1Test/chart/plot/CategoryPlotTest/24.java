@Test
    public void testRemoveDomainMarker() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.removeDomainMarker(new CategoryMarker("Category 1")));
    }

    