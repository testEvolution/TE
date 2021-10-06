@Test
    public void testSerialization1() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Type 1", 54.5);
        data.setValue("Type 2", 23.9);
        data.setValue("Type 3", 45.8);

        JFreeChart c1 = ChartFactory.createPieChart("Test", data);
        JFreeChart c2 = (JFreeChart) TestUtils.serialised(c1);
        assertEquals(c1, c2);
        LegendTitle lt2 = c2.getLegend();
        assertSame(lt2.getSources()[0], c2.getPlot());
    }

    