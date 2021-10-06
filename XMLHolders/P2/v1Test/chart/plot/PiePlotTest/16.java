@Test
    public void testBug1126_d() throws CloneNotSupportedException {
        DefaultPieDataset dataset1 = new DefaultPieDataset();
        PiePlot plot1 = new PiePlot(dataset1);
        plot1.setExplodePercent("A", 0.1);
        plot1.setExplodePercent("B", 0.2);
        PiePlot plot2 = (PiePlot) plot1.clone();
        plot2.setExplodePercent("A", 0.3);
        plot2.setExplodePercent("B", 0.4);
        assertEquals(0.1, plot1.getExplodePercent("A"), EPSILON);
        assertEquals(0.2, plot1.getExplodePercent("B"), EPSILON);
        assertEquals(0.3, plot2.getExplodePercent("A"), EPSILON);
        assertEquals(0.4, plot2.getExplodePercent("B"), EPSILON);
    }
    
    