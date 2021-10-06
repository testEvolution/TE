@Test
    public void testTitleChangeEvent() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        JFreeChart chart = ChartFactory.createPieChart("title", dataset);
        chart.addChangeListener(this);
        this.lastChartChangeEvent = null;
        TextTitle t = chart.getTitle();
        t.setFont(new Font("Dialog", Font.BOLD, 9));
        assertNotNull(this.lastChartChangeEvent);
        this.lastChartChangeEvent = null;

        // now create a new title and replace the existing title, several
        // things should happen:
        // (1) Adding the new title should trigger an immediate
        //     ChartChangeEvent;
        // (2) Modifying the new title should trigger a ChartChangeEvent;
        // (3) Modifying the old title should NOT trigger a ChartChangeEvent
        TextTitle t2 = new TextTitle("T2");
        chart.setTitle(t2);
        assertNotNull(this.lastChartChangeEvent);
        this.lastChartChangeEvent = null;

        t2.setFont(new Font("Dialog", Font.BOLD, 9));
        assertNotNull(this.lastChartChangeEvent);
        this.lastChartChangeEvent = null;

        t.setFont(new Font("Dialog", Font.BOLD, 9));
        assertNull(this.lastChartChangeEvent);
        this.lastChartChangeEvent = null;
    }

    