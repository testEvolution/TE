@Test
    public void testFindMaximumDomainValue() {
        XYDataset dataset = createXYDataset1();
        Number maximum = DatasetUtils.findMaximumDomainValue(dataset);
        assertEquals(3.0, maximum);
    }

    