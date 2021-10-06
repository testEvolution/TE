@Test
    public void testSerialization2() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Type 1", 54.5);
        data.setValue("Type 2", 23.9);
        data.setValue("Type 3", 45.8);
        JFreeChart c1 = ChartFactory.createPieChart3D("Test", data);
        JFreeChart c2 = (JFreeChart) TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    