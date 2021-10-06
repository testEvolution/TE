@Test
    public void testBug1126() throws CloneNotSupportedException {
        DefaultPieDataset dataset1 = new DefaultPieDataset();
        PiePlot plot1 = new PiePlot(dataset1);
        plot1.setSectionPaint("A", Color.RED);
        plot1.setSectionPaint("B", Color.GREEN);
        PiePlot plot2 = (PiePlot) plot1.clone();
        plot2.setSectionPaint("A", Color.BLUE);
        plot2.setSectionPaint("B", Color.YELLOW);
        assertEquals(Color.RED, plot1.getSectionPaint("A"));
        assertEquals(Color.GREEN, plot1.getSectionPaint("B"));
        assertEquals(Color.BLUE, plot2.getSectionPaint("A"));
        assertEquals(Color.YELLOW, plot2.getSectionPaint("B"));
    }
    
    