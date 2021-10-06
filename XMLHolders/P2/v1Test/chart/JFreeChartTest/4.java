@Test
    public void testGetSubtitle() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("title", dataset);
        Title t = chart.getSubtitle(0);
        assertTrue(t instanceof LegendTitle);

        try {
            chart.getSubtitle(-1);
            fail("Should have thrown an IllegalArgumentException on negative number");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Index out of range.", e.getMessage());
        }

        try {
           chart.getSubtitle(1);
            fail("Should have thrown an IllegalArgumentException on excesive number");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Index out of range.", e.getMessage());
        }

        try {
            chart.getSubtitle(2);
            fail("Should have thrown an IllegalArgumentException on number being out of range");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Index out of range.", e.getMessage());
        }

    }

    