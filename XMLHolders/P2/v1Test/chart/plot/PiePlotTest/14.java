@Test
    public void testBug1126_b() throws CloneNotSupportedException {
        DefaultPieDataset dataset1 = new DefaultPieDataset();
        PiePlot plot1 = new PiePlot(dataset1);
        plot1.setSectionOutlinePaint("A", Color.RED);
        plot1.setSectionOutlinePaint("B", Color.GREEN);
        PiePlot plot2 = (PiePlot) plot1.clone();
        plot2.setSectionOutlinePaint("A", Color.BLUE);
        plot2.setSectionOutlinePaint("B", Color.YELLOW);
        assertEquals(Color.RED, plot1.getSectionOutlinePaint("A"));
        assertEquals(Color.GREEN, plot1.getSectionOutlinePaint("B"));
        assertEquals(Color.BLUE, plot2.getSectionOutlinePaint("A"));
        assertEquals(Color.YELLOW, plot2.getSectionOutlinePaint("B"));
    }
    
    