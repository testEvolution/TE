@Test
    public void testAddSubtitle() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("title", dataset);

        TextTitle t0 = new TextTitle("T0");
        chart.addSubtitle(0, t0);
        assertEquals(t0, chart.getSubtitle(0));

        TextTitle t1 = new TextTitle("T1");
        chart.addSubtitle(t1);
        assertEquals(t1, chart.getSubtitle(2));  // subtitle 1 is the legend

        try {
            chart.addSubtitle(null);
            fail("Should have thrown an IllegalArgumentException on index out of range");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Null 'subtitle' argument.", e.getMessage());
        }

        try {
            chart.addSubtitle(-1, t0);
            fail("Should have thrown an IllegalArgumentException on index out of range");
        }
        catch (IllegalArgumentException e) {
            assertEquals("The 'index' argument is out of range.", e.getMessage());
        }

        try {
            chart.addSubtitle(4, t0);
            fail("Should have thrown an IllegalArgumentException on index out of range");
        }
        catch (IllegalArgumentException e) {
             assertEquals("The 'index' argument is out of range.", e.getMessage());
        }

    }

    