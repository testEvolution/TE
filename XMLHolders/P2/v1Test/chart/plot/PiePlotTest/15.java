@Test
    public void testBug1126_c() throws CloneNotSupportedException {
        DefaultPieDataset dataset1 = new DefaultPieDataset();
        PiePlot plot1 = new PiePlot(dataset1);
        plot1.setSectionOutlineStroke("A", new BasicStroke(5.0f));
        plot1.setSectionOutlineStroke("B", new BasicStroke(6.0f));
        PiePlot plot2 = (PiePlot) plot1.clone();
        plot2.setSectionOutlineStroke("A", new BasicStroke(7.0f));
        plot2.setSectionOutlineStroke("B", new BasicStroke(8.0f));
        assertEquals(new BasicStroke(5.0f), plot1.getSectionOutlineStroke("A"));
        assertEquals(new BasicStroke(6.0f), plot1.getSectionOutlineStroke("B"));
        assertEquals(new BasicStroke(7.0f), plot2.getSectionOutlineStroke("A"));
        assertEquals(new BasicStroke(8.0f), plot2.getSectionOutlineStroke("B"));
    }
    
    