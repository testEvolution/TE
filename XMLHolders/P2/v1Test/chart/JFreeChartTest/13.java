@Test
    public void testBug942() throws Exception {
        final String title = "Pie Chart Demo 1\n\n\ntestnew line";
        assertEquals(title, ChartFactory.createPieChart(title, 
                new DefaultPieDataset()).getTitle().getText());
    }

    