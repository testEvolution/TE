@Test
    public void testGetSubtitles() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("title", dataset);
        List<TextTitle> subtitles = chart.getSubtitles();

        assertEquals(1, chart.getSubtitleCount());

        // adding something to the returned list should NOT change the chart
        subtitles.add(new TextTitle("T"));
        assertEquals(1, chart.getSubtitleCount());
    }

    