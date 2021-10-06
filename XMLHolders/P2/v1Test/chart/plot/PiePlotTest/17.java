@Test
    public void testBug1126_e() throws CloneNotSupportedException {
        DefaultPieDataset dataset1 = new DefaultPieDataset();
        PiePlot plot1 = new PiePlot(dataset1);
        plot1.setLabelGenerator(new StandardPieSectionLabelGenerator());
        PiePlot plot2 = (PiePlot) plot1.clone();
        StandardPieSectionLabelGenerator g2 
                = (StandardPieSectionLabelGenerator) plot2.getLabelGenerator();
        g2.setAttributedLabel(1, new AttributedString("TESTING"));
        assertNotEquals(plot1, plot2);
    }

}